<%@page import="com.find.model.stuinfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'displaystuinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <link href='http://fonts.googleapis.com/css?family=Days+One' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
    </head>
  
  <body>
    <jsp:include page="islogin.jsp"></jsp:include>
<body>
	<%
		List stus =(List) session.getAttribute("stus");
		// out.print(stus.size());  
		Iterator iter = stus.iterator();
	%>
	<table>
	 <dl class="list nigiri">
		<tr>
			<aa><td>id</td></aa>
			<aa><td>昵称</td></aa>
			<aa><td>真实姓名</td></aa>
			<aa><td>性别</td></aa>
			<aa><td>出生日期</td></aa>
			<aa><td>所在专业</td></aa>
			<aa><td>所选课程</td></aa>
			<aa><td>兴趣</td></aa>
			<aa><td>备注</td></aa>
		</tr>
		</dl>
		
		<%
			int i = 0;
			while (iter.hasNext()) {
				stuinfo student = (stuinfo) iter.next();
		%>
		<tr <%if (i % 2 == 0) {%> bgcolor="#F0F8FF" <%}%>>
			<td><%=student.getId()%></td>
			<td><%=student.getNicheng()%></td>
			<td><%=student.getTruename()%></td>
			<td>
				<%
					if (student.getXb() == 1)
							out.print("男");
						else
							out.print("女");
				%>
			</td>
			<td><%=student.getCsrq()%></td>
			<td><%=student.getZy()%></td>
			<td><%=student.getKcs()%></td>
			<td><%=student.getXqs()%></td>
			<td><%=student.getBz()%></td>
		</tr>
		<%
			i++;
			}
		%>

	</table>
  </body>
</html>
