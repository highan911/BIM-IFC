<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="header.jsp"%>
<%@page import="org.bimserver.interfaces.objects.SUserType"%>
<%@page import="org.bimserver.shared.exceptions.ServiceException"%>
<%@page import="org.bimserver.web.JspHelper"%>
<div class="sidebar">
</div>
<div class="content">
<%
	long uoid = Long.parseLong(request.getParameter("uoid"));
	SUser user = loginManager.getService().getUserByUoid(uoid);
	String notificationUrl = user.getNotificationUrl();
	if (notificationUrl == null) {
		notificationUrl = "";
	}
	if (request.getParameter("save") != null) {
		notificationUrl = request.getParameter("notificationUrl");
		SUserType userType = SUserType.values()[Integer.parseInt(request.getParameter("type"))];
		try {
			loginManager.getService().changeUserType(uoid, userType);
			if (!notificationUrl.trim().equals("")) {
				loginManager.getService().setHttpCallback(uoid, notificationUrl);
			}
			response.sendRedirect("user.jsp?uoid=" + uoid);
		} catch (ServiceException e) {
			JspHelper.showException(out, e);
		}
	}
%>
<h1>Edit user (<%=user.getName() %>)</h1>
<div class="tabber" id="usertabber">
<div class="tabbertab" id="detailstab" title="Details">

<form>
<input type="hidden" name="uoid" value="<%=uoid %>"/>
<table>
<tr>
	<td><label for="type">Type</label></td>
	<td><select name="type">
<%
	for (SUserType sUserType : SUserType.values()) {
		if (sUserType != SUserType.SYSTEM) {
			if (sUserType == user.getUserType()) {
				%>
				<option value="<%=sUserType.ordinal() %>" selected="selected"><%=JspHelper.getNiceUserTypeName(sUserType) %></option>
				<%
			} else {
				%>
				<option value="<%=sUserType.ordinal() %>"><%=JspHelper.getNiceUserTypeName(sUserType) %></option>
				<%
			}
		}
	}
%>
	</select></td>
</tr>
<tr>
	<td><label for="notificationUrl">Notification URL</label></td>
	<td><input type="text" name="notificationUrl" id="notificationUrl" value="<%=notificationUrl%>"/></td>
</tr>
</table>
<input type="submit" value="Save" name="save"/>
</form>
</div>
</div>
</div>
<jsp:include page="footer.jsp" />