<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<h2>Hello World</h2>
	<h3>Hello World</h3>
	<h4>Hello World</h4>
	<h5>Hello World</h5>
	<h6>Hello World</h6>
	
	<table border='1' cellspacing='0' cellpadding='10'>
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>작성자</th>			
		</tr>
		<tr>
			<td>1</td>
			<td>안녕</td>
			<td>둘리</td>			
		</tr>
		<tr>
			<td>2</td>
			<td>안녕~</td>
			<td>마이콜</td>			
		</tr>
		<tr>
			<td>3</td>
			<td>안녕!</td>
			<td>또치</td>			
		</tr>
	</table>
	<br/>
	<img src='images/dooly.png' style='width:80px; border:1px solid #999'/> 
	<img src='/helloweb/images/dooly.png' style='width:80px; border:1px solid #999'/>
	<br/>
	<a href='form.jsp'>폼으로 가기</a>
	<br/>
	<a href='hello.jsp?name=naolj83&email=k@gmail.com'>Hello</a>
	<p>
	5월 24, 2021 2:07:20 오후 org.apache.catalina.startup.Catalina start<br/>
	INFO: Server startup in 531 ms
	</p>
</body>
</html>