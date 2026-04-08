<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 관리 프로그램</title>
	<style>
		body { text-align: center; }
		h1 { text-align: center; }
	</style>
</head>
<body>
	<h1>MyBatis 사용 DB 연동 : 도서 관리 프로그램</h1>
	<!--<a href="/mybatisEx/book/listAllBooks">전체 도서 정보 조회</a><br>-->
	<a href="<c:url value='/book/listAllBooks'/>">전체 도서 정보 조회</a><br>
	<a href="<c:url value='/book/newBookForm'/>">도서 등록</a>
</body>
</html>