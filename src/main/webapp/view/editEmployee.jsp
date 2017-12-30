<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <style>
	.liste, .liste td 
	{
		border:0;
		padding: 5px;
	}
	</style>

<h2>Edit Employee</h2>
 
<s:form method="post" action="addEmployee">
	<s:push value="employee">
		<s:hidden name="id" />
	    <table class="liste">
		    <tr>
		        <td><s:textfield key="label.firstname" name="firstname"/></td> 
		    </tr>
		    <tr>
		        <td><s:textfield key="label.lastname" name="lastname"/></td>
		    </tr>
		    <tr>
		        <td><s:textfield key="label.email" name="email"/></td>
		    </tr>
		    <tr>
		        <td><s:textfield key="label.telephone" name="telephone"/></td>
		    </tr>
		    <tr>
		    	<td><s:select list="departmentItems" name="depId" listKey="key" listValue="value"/></td>
		    </tr>
		    <tr>
		        <td>
		        	<s:submit key="label.add"></s:submit>
		        </td>
		    </tr>
		</table> 
	</s:push>
</s:form>
