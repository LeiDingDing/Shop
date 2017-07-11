<%-- 
    Document   : newjsp
    Created on : 2016-12-29, 14:36:52
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <c:forEach items="${categorylist}" var="category">
                                                         <li>
								<a href="products.html">${category.ctype}</a>
							</li>
                         </c:forEach>
        </form>
    </body>
</html>
