<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.bimserver.interfaces.objects.SExtendedDataSchemaType"%>
<%@page import="org.bimserver.interfaces.objects.SExtendedDataSchema"%>
<%@page import="org.bimserver.interfaces.objects.SExtendedData"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="org.bimserver.shared.comparators.SCheckoutDateComparator"%>
<%@page import="java.util.List"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Collections"%>
<%@page import="org.bimserver.utils.Formatters"%>
<%@page import="org.bimserver.shared.exceptions.ServiceException"%>
<%@page import="org.bimserver.web.JspHelper"%>
<%@page import="org.bimserver.interfaces.objects.SCheckout"%>
<%@page import="org.bimserver.interfaces.objects.SRevision"%>
<%@page import="org.bimserver.interfaces.objects.SProject"%>
<%@page import="org.bimserver.interfaces.objects.SUser"%>
<%@page import="org.bimserver.interfaces.objects.SUserType"%>
<%@page import="org.bimserver.utils.WebUtils"%>
<%@page import="org.bimserver.interfaces.objects.SSerializer"%>
<%@ include file="header.jsp"%>
<%
	if (loginManager.isLoggedIn()) {
		long roid = Long.parseLong(request.getParameter("roid"));
		try {
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if (isMultipart) {
				SExtendedData extendedData = new SExtendedData();
				DiskFileItemFactory factory = new DiskFileItemFactory();
				factory.setSizeThreshold(1024 * 1024 * 500);
				ServletFileUpload upload = new ServletFileUpload(factory);
				List<FileItem> items = (List<FileItem>) upload.parseRequest(request);
				Iterator<FileItem> iter = items.iterator();
				while (iter.hasNext()) {
					FileItem next = iter.next();
					if (!next.isFormField()) {
						extendedData.setData(next.get());
					} else {
						String fieldName = next.getFieldName();
						if ("title".equals(fieldName)) {
							extendedData.setTitle(next.getString());
						} else if ("schema".equals(fieldName)) {
							extendedData.setSchemaId(Long.parseLong(next.getString()));
						} else if ("url".equals(fieldName)) {
							extendedData.setUrl(next.getString());
						}
					}
				}
				loginManager.getService().addExtendedDataToRevision(roid, extendedData);
				response.sendRedirect("revision.jsp?roid=" + roid);
			}
			
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
	SRevision revision = loginManager.getService().getRevision(roid);
	boolean isTagged = revision.getTag() != null;
	SProject project = loginManager.getService().getProjectByPoid(revision.getProjectId());
	SUser user = loginManager.getService().getUserByUoid(revision.getUserId());
	List<SCheckout> checkouts = loginManager.getService().getAllCheckoutsOfRevision(roid);
	Collections.sort(checkouts, new SCheckoutDateComparator(false));
	List<String> classes = loginManager.getService().getAvailableClasses();
	Collections.sort(classes);
	boolean isAdmin = loginManager.getService().getCurrentUser().getUserType() == SUserType.ADMIN;
	boolean isTopProject = project.getParentId() == -1L;
	boolean kmzEnabled = loginManager.getService().hasActiveSerializer("application/vnd.google-earth.kmz");
%>
<div class="sidebar">
<ul>
 <li>
 <a id="browserlink" class="link">Browser</a></li>
</ul>
</div>
<div id="downloadcheckoutpopup"></div>
<div class="content">
<%-- ------------------------------------------------------------------------ this page shows the REVISION Details --%>
<h1>Revision details (Project: <%=project.getName()%>, Revision: <%=revision.getId()%>)</h1>
<div id="guide">
  <div id="guidewrap">
    <ol id="breadcrumb">
	  <li><%=JspHelper.generateBreadCrumbPath(revision, loginManager.getService())%></li>
    </ol>
  </div>
</div>
<div id="guide_wrap_btm"></div>

<div class="tabber" id="revisiontabber">
<div class="tabbertab" id="detailstab" title="Details">
<table class="formtable">
	<tr>
		<td class="first">Id</td>
		<td><%=revision.getId()%></td>
	</tr>
	<tr>
		<td class="first">Project</td>
		<td><a href="project.jsp?poid=<%=revision.getProjectId()%>"><%=project.getName()%></a></td>
	</tr>
	<tr>
		<td class="first">User</td>
		<td><a href="user.jsp?uoid=<%=revision.getUserId()%>"><%=user.getUsername()%></a></td>
	</tr>
	<tr>
		<td class="first">Date</td>
		<td><%=dateFormat.format(revision.getDate())%></td>
	</tr>
	<tr>
		<td class="first">Comment</td>
		<td><%=revision.getComment()%></td>
	</tr>
	<tr>
		<td class="first">Size</td>
		<td><%=revision.getSize()%></td>
	</tr>
<%
	if (kmzEnabled) {
	String url = WebUtils.getWebServer(request.getRequestURL().toString());
	String link = "http://" + url + getServletContext().getContextPath() + "download?roid=" + revision.getOid() + "&serializerName=KMZ";
%>
	<tr>
		<td class="first">Google Earth Link</td>
		<td><a href="<%=link%>"><%=link%></a></td>
	</tr>
<%
	}
%>
</table>
<br />

<%-- ------------------------------------------------------------------------ REVISION TAG --%>
<form action="setrevisiontag.jsp" method="post"><input
	type="hidden" name="roid" value="<%=roid%>" />
<table class="formtable">
	<tr>
		<td class="first" width="100">Tag:</td>
		<%
			if (isAdmin && isTagged && isTopProject) {
		%>
		<td><%=revision.getTag()%></td>
		<td></td>
		<%
			} else if (isAdmin && !isTagged && isTopProject) {
		%>
		<td><input type="text" name="tagLabel" /></td>
		<td><input type="submit" name="setTag" value="Set" /></td>
		<%
			} else if (isTagged) {
		%>
		<td><%=revision.getTag()%></td><td></td>
		<%
			} else {
		%>
		<td></td><td></td>
		<%
			}
		%>
	</tr>
</table>
</form>
<br />

<%-- ---------------------------------------------------------------------------- DOWNLOAD --%>
<form action="<%=request.getContextPath()%>/download" method="get">
<input type="hidden" name="roid" value="<%=roid%>" />
<table class="formtable">
	<tr>
		<td class="first" width="100">Download:</td>
		<td><a href="#" revisionoid="<%=revision.getOid() %>" class="downloadCheckoutButton">Download</a></td>
	</tr>
</table>
</form>
<br />

<%-- --------------------------------------------------------------- BRANCH TO NEW PROJECT --%>
<fieldset>
<legend>Branch to new project</legend>
<form method="post" action="branch.jsp">
<label>New project name</label> <input type="text" name="name" /> 
<label>Revision comment</label> <input type="text" name="comment" />
<input type="submit" value="Branch" /> <input type="hidden" name="roid" value="<%=roid%>" />
<input type="hidden" name="action" value="branchtonewproject" />
</form>
</fieldset>
</div>
<%
	if (checkouts.size() > 0) {
%>
<div class="tabbertab" id="checkoutstab" title="Checkouts<%=checkouts.size() == 0 ? "" : " (" + checkouts.size() + ")"%>">
<table class="formatted">
	<tr>
		<th>User</th>
		<th>Date</th>
		<th>Active</th>
		<th>Download</th>
	</tr>
	<%
		for (SCheckout checkout : checkouts) {
			SUser checkoutUser = loginManager.getService().getUserByUoid(checkout.getUserId());
	%>
	<tr>
		<td><a href="user.jsp?id=<%=checkout.getUserId()%>"><%=checkoutUser.getUsername()%></a></td>
		<td><%=dateFormat.format(checkout.getDate())%></td>
		<td><%=checkout.getActive()%></td>
		<td>
			<a href="#" revisionoid="<%=checkout.getRevisionId() %>" class="downloadCheckoutButton">Download</a>
		</td>
	</tr>
	<%
		}
	%>
</table>
</div>
<%
	}
%>
<div class="tabbertab" id="extendeddatatab" title="Extended Data">
<form enctype="multipart/form-data" method="post">
<table>
<tr>
	<td><label for="type"></label></td>
	<td><select>
<%
	for (SExtendedDataSchema extendedDataSchema : loginManager.getService().getAllExtendedDataSchemas()) {
		out.println("<option value=\"" + extendedDataSchema.getOid() + "\">" + extendedDataSchema.getName() + "</option>");
	}
%>
	</select></td>
</tr>
<tr>
	<td><label for="title">Title</label></td>
	<td><input type="text" id="title"/></td>
</tr>
<tr>
	<td><label for="url">URL</label></td>
	<td><input type="text" id="url"/></td>
</tr>
<tr>
	<td></td>
	<td> OR</td>
</tr>
<tr>
	<td><label for="data">Data</label></td>
	<td><input type="file" id="data"/></td>
</tr>
</table>
<input type="hidden" name="action" value="addextendeddata"/>
<input type="hidden" name="roid" value="<%=roid%>"/>
<input type="submit" value="Add"/>
</form>
<%
	if (!revision.getExtendedData().isEmpty()) {
%>
<table>
<tr><th>Title</th><th>URL/Data</th><th>Date</th></tr>
<%
	for (long edoid : revision.getExtendedData()) {
		SExtendedData sExtendedData = loginManager.getService().getExtendedData(edoid);
		out.println("<tr>");
		out.println("<td>" + sExtendedData.getTitle() + "</td>");
		if (sExtendedData.getData() != null && sExtendedData.getData().length > 0) {
		} else {
			out.println("<a href=\"\">" + sExtendedData.getUrl() + "</a>");
		}
		out.println("<td>" + dateFormat.format(sExtendedData.getAdded()) + "</td>");
		out.println("</tr>");
	}
%>
</table>
<%
}%>
</div>
</div>
<script>
	$(function(){
		$("#browserajaxloader").hide();
		$("#browserajaxlink").click(function(){
			$("#browserajaxlink").hide();
			$("#browserajaxloader").show();
			$("#browser").load("browser.jsp?roid=<%=roid%>");
		});
		
		$(".downloadCheckoutButton").click(function(event){
			event.preventDefault();
			var params = {
				downloadType: "single",
				allowCheckouts: true,
				roid: $(this).attr("revisionoid"),
			};
			showDownloadCheckoutPopup("download.jsp?data=" + JSON.stringify(params));
		});

		$("#browserlink").click(function(){
			showOverlay("Browser", "browser.jsp?roid=<%=revision.getOid() %>");
			return false;
		});
	});
</script> <%
 	} catch (ServiceException e) {
		JspHelper.showException(out, e);
 		}
 	}
 %>
</div>
<%@ include file="footer.jsp"%>