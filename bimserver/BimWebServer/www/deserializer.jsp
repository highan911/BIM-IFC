<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="org.bimserver.interfaces.objects.SDeserializer"%>
<%@page import="org.bimserver.interfaces.objects.SSerializerPluginDescriptor"%>
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
<h1>Edit deserializer</h1>
<fieldset>
<%
	String description = "";
	String name = request.getParameter("name");
	String className = request.getParameter("className");
	ServiceInterface service = loginManager.getService();
	
	if (request.getParameter("update") != null) {
		SDeserializer deserializer = loginManager.getService().getDeserializerById(Long.parseLong(request.getParameter("id")));
		description = request.getParameter("description");
		deserializer.setName(name);
		deserializer.setDescription(description);
		deserializer.setClassName(className);
		loginManager.getService().updateDeserializer(deserializer);
		response.sendRedirect("settings.jsp");
	} else {
		SDeserializer deserializer = loginManager.getService().getDeserializerById(Long.parseLong(request.getParameter("id")));
		description = deserializer.getDescription();
		name = deserializer.getName();
		className = deserializer.getClassName();
	}
%>
<form>
<input type="hidden" name="name" value="<%=name%>"/>
<table>
<tr>
	<td><label for="name">Name</label></td>
	<td><input name="name" id="name" value="<%=name%>"></input></td>
</tr>
<tr>
	<td><label for="description">Description</label></td>
	<td><input name="description" id="description" value="<%=description%>"></input></td>
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