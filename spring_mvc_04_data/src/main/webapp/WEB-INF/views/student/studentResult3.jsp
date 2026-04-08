<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>command 객체 사용(@ModelAttribute)</h5>
	학번 : ${studentInfo.no}<br>
	성명 : ${studentInfo.name}<br>
	학년 : ${studentInfo.year}<br>
	<!-- @ModelAttribute 사용해도 객체 성질이 변질되지는 않음 필드 없으므로 오류-->
	생일 : \${studentInfo.birth}<br>
</body>
</html>