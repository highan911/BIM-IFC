<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="org.bimserver.interfaces.objects.SObjectIDMPluginDescriptor"%>
<%@ include file="header.jsp"%>
<%@page import="org.bimserver.interfaces.objects.SSerializer"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="org.bimserver.utils.Formatters"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.apache.commons.io.IOUtils"%>
<%@page import="org.bimserver.interfaces.objects.SUserType"%>
<%@page import="org.bimserver.shared.ServiceInterface"%>
<%@page import="org.bimserver.shared.exceptions.ServiceException"%>
<%@page import="org.bimserver.interfaces.objects.SObjectIDM"%>
<div class="sidebar">
<ul>
</ul>
</div>
<div class="content">
<h1>Edit ObjectIDM</h1>
<fieldset>
<%
	String name = request.getParameter("name");
	String className = request.getParameter("className");
	long id = Long.parseLong(request.getParameter("id"));
	if (request.getParameter("update") != null) {
		SObjectIDM objectIDM = loginManager.getService().getObjectIDMById(id);
		objectIDM.setName(name);
		objectIDM.setClassName(className);
		loginManager.getService().updateObjectIDM(objectIDM);
		response.sendRedirect("settings.jsp");
	} else {
		SObjectIDM objectIDM = loginManager.getService().getObjectIDMById(id);
		if (name == null) {
			name = objectIDM.getName();
		}
		if (className == null) {
			className = objectIDM.getClassName();
		}
	}
%>
<form>
<input type="hidden" name="id" value="<%=id%>"/>
<table>
<tr>
	<td><label for="name">Name</label></td>
	<td><input name="name" id="name" value="<%=name%>"></input></td>
</tr>
<tr>
	<td><label for="className">Object IDM</label></td>
	<td><select name="className" id="className">
		<option value="[none]">[None]</option>
<%
	for (SObjectIDMPluginDescriptor objectIDMPluginDescriptor : loginManager.getService().getAllObjectIDMPluginDescriptors()) {
%>
	<option value="<%=objectIDMPluginDescriptor.getClassName()%>"<%=(objectIDMPluginDescriptor.getClassName().equals(className) ? " selected=\"selected\"" : "") %>><%=objectIDMPluginDescriptor.getClassName()%></option>
<%
	}
%>
	</select></td>
</tr>
<tr>
	<td></td>
	<td><input name="update" type="submit" value="Update"/></td>
</tr>
</table>
</form>
</fieldset>
</div>
<script>
$(function(){
	$("#name").focus();
});
</script>
<%@ include file="footer.jsp"%>