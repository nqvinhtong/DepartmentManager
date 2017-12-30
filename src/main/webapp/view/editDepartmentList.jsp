<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <style>
	table.list
	{
		border-collapse:collapse;
		width: 60%;
	}
	table.list, table.list td, table.list th
	{
		border:1px solid gray;
		padding: 5px;
	}
	
	.liste, .liste td 
	{
		border:0;
		padding: 5px;
	}
	</style>
 
<h2>Add Department</h2>

<s:form method="post" action="addDepartment">
	<s:hidden name="department.id" />
    <table class="liste">
	    <tr>
	        <td><s:textfield key="label.departmentName" name="department.departmentName"/></td> 
	    </tr>
	    <tr>
	        <td><s:textfield key="label.managerName" name="department.managerName"/></td>
	    </tr>
	    <tr>
	        <td>
	        	<s:submit key="label.addDepartment"></s:submit>
	        </td>
	    </tr>
	</table>
	<h3>Departments</h3>
	<c:if  test="${!empty departments}">
		<table class="list">
			<tr>
			    <th align="left">Department</th>
			    <th align="left">Manager Name</th>
			    <th align="left" colspan="2">Actions</th>
			</tr>
			<c:forEach items="${departments}" var="dep">
			    <tr>
			        <td>${dep.departmentName} </td>
			        <td>${dep.managerName}</td>
			        <td><a href="editDepartment/${dep.id}">edit</a></td>
			        <td><a href="deleteDepartment/${dep.id}">delete</a></td>
			    </tr>
			</c:forEach>
		</table>
	</c:if>
</s:form>
 
 
 
