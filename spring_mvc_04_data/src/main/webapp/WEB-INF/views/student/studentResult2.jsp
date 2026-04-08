<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	학번 : ${no}<br>
	성명 : ${name}<br>
	학년 : ${year}<br>
	생일 : ${birth}<br>
	<h5>command 객체 사용</h5>
	학번 : ${student.no}<br>
	성명 : ${student.name}<br>
	학년 : ${student.year}<br>
	<!-- 오류 : student 객체에 birth 필드 없고 getter도 없음
		자바 객체가 전달되고 해당 필드가 없으므로 자바 오류가 발생함
		전달되는 command 객체 필드 birth가 Date 타입이고 클라이언트 형식이 결정되어 있으므로
		동일 형식으로 포맷 지정
	 -->
	생일 : <fmt:formatDate value="${student.birth}" pattern="YYYY-MM-dd"/><br>
</body>
</html>