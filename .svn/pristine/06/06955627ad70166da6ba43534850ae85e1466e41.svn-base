<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main_left.jsp' starting page</title>
    
	
  <link href='http://fonts.googleapis.com/css?family=Days+One' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
    </head>
 <jsp:include page="islogin.jsp"></jsp:include>
  <body>

    
    <dl class="list nigiri">
           <dt>菜单</dt>
     <dd><a href="inputstuinfo.jsp" target="main_right">录入学生信息</a><br></dd>
    <dd><a href="student/queryallstuservlet?osid=query" target="main_right">查看学生信息</a><br></dd>
     <dd><a href="student/queryallstuservlet?osid=modify" target="main_right">修改学生信息</a><br></dd>
       <dd><a href="student/queryallstuservlet?osid=delete" target="main_right">删除学生信息</a><br></dd>
        <dd><a href="user/exitservlet" target="_top">退出</a><br></dd>
 
    </dl>
   

  <script src='js/jquery.js'></script>
  <script src='js/index.js'></script>

  </body>
</html>
