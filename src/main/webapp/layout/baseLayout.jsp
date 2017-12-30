<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title><tiles:insertAttribute name="title" ignore="true" /></title>
            <style type="text/css">
            	.lista
				{
					border-collapse:collapse;
					width: 80%;
				}
				.lista, .lista td 
				{
					border:1px solid gray;
					padding: 5px;
				}
				
            </style>
    </head>
    <body>
        <table id="base" class="lista" align="center" width="100%" height="100%">
            <tr>
                <td height="30" colspan="2">
                    <tiles:insertAttribute name="header" />
                </td>
            </tr>
            <tr>
                <td width="20%" height="600" valign="top">
                    <tiles:insertAttribute name="menu" />
                </td>
                <td align="center" valign="top">
                    <tiles:insertAttribute name="body" />
                </td>
            </tr>
            <%-- <tr>
                <td height="30" colspan="2">
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr> --%>
        </table>
    </body>
</html>
