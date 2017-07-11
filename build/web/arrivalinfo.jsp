<%-- 
    Document   : arrivalinfo
    Created on : 2017-1-7, 19:56:33
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="arrive" class="it.netshop.pojo.ArrivalInfo" scope="request"/>
        <jsp:setProperty name="arrive" property="*"/>
    </body>
</html>
