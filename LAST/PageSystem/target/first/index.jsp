<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%--<%--%>
    <%--pageContext.setAttribute("path", request.getContextPath());--%>
<%--%>--%>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <%--基于SSM框架的管理系统：简单实现增、删、改、查。--%>
                </h1>
            </div>
        </div>
    </div>
</div>
<br><br>
<h3>
<%--${path }--%>
    <%--<a href="paper/test">点击进入管理页面</a>--%>
    <form action="check/checkStudentLogin" method="post">

        <input type="text" required="required" placeholder="用户名" name="idstudent"></input>
        <input type="password" required="required" placeholder="密码" name="pwdstudent"></input>
        <button class="but" type="submit">登录</button>
        <%--<button class="but" type="reset">重置</button>--%>

    </form>


</h3>
</body>
</html>