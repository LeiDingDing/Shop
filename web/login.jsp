<%-- 
    Document   : login
    Created on : 2016-12-12, 15:28:39
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css"/>
        <style>
             #loginform{
                padding-left:100px;
                padding-top:50px;
            }
        </style>
    </head>
    <body>
        <form action="LoginServlet" method="POST" class="form-horizontal" id="loginform">
            <div class="control-group">
                <label class="control-label" for="inputUsername">用户名：</label>
                <div class="controls">
                    <input type="text" id="inputUsername" placeholder="Username" name="name" value="${username}">
                    <p style="color:red">${user}</p>
                </div>
                
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">密码：</label>
                <div class="controls">
                    <input type="password" id="inputPassword" placeholder="Password" name="password" value="">
                    <p style="color:red">${msg}</p>
                </div>
           </div>
            <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn">登录</button>
                 </div>
            </div>
            
        </form>
    </body>
</html>
