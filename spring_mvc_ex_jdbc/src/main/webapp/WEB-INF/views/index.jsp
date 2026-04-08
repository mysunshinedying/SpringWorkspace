<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring JDBC 연결 예제</title>
<style>
	body { text-align: center; }
</style>
</head>
<body>
	<h1>상품 확인</h1>
	<p><a href='<c:url value="/product/productSelect"/>'>상품 조회</a></p>
</body>
</html>
