<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <style>
	.liste, .liste td 
	{
		border:0;
		padding: 5px;
	}
	</style>
 
<h2>Update Department</h2>

<s:form method="post" action="addDepartment">
	<s:push value="department">
		<s:hidden name="id" />
	    <table class="liste">
		    <tr>
		        <td><s:textfield key="label.departmentName" name="departmentName"/></td> 
		    </tr>
		    <tr>
		        <td><s:textfield key="label.managerName" name="managerName"/></td>
		    </tr>
		    <tr>
		        <td>
		        	<s:submit key="label.addDepartment"></s:submit>
		        </td>
		    </tr>
		</table>
	</s:push>
</s:form>
 
 
 
