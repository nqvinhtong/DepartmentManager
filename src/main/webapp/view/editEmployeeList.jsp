<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <style>
	table.list
	{
		border-collapse:collapse;
		width: 70%;
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

<h2>Add Employee</h2>
 
<s:form method="post" action="addEmployee">
    <table class="liste">
	    <tr>
	        <s:textfield key="label.firstname" name="employee.firstname"/> 
	    </tr>
	    <tr>
	    	<s:textfield key="label.lastname" name="employee.lastname"/>
	    </tr>
	    <tr>
	        <s:textfield key="label.email" name="employee.email"/>
	    </tr>
	    <tr>
	        <s:textfield key="label.telephone" name="employee.telephone"/>
	    </tr>
	    <tr>
	    	<s:select list="departmentItems" name="employee.depId" listKey="key" listValue="value"/>
	    </tr>
	    <tr>
	        <s:submit key="label.add"/>
	    </tr>
	    
	    <tr>
	    <s:textfield key="label.search" name="search"/> 
	    <s:submit value="Search" action="employeeList"/>
	    </tr>
	</table> 
	
	<h3>Employees</h3>
	
	<c:if  test="${!empty employees}">
		<table class="list">
			<tr>
			    <th align="left">Name</th>
			    <th align="left">Email</th>
			    <th align="left">Telephone</th>
			    <th align="left" colspan="2">Actions</th>
			</tr>
			<c:forEach items="${employees}" var="emp">
			    <tr>
			        <td>${emp.lastname}, ${emp.firstname} </td>
			        <td>${emp.email}</td>
			        <td>${emp.telephone}</td>
			        <td><a href="editEmployee/${emp.id}">edit</a></td>
			        <td><a href="deleteEmployee/${emp.id}">delete</a></td>
			    </tr>
			</c:forEach>
		</table>
	</c:if>
</s:form>
