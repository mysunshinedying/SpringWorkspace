<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
<h1>index 페이지 입니다</h1>
<a href="/second/newView">second/newView 페이지</a><br>
<a href="/project/newView">project/newView 페이지</a><br>
<img src="/second/resources/apple.png"/>
<p>현재 시간 : ${serverTime}</p>
</body>
</html>