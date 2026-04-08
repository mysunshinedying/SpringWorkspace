<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--controller 통해 view로 전달된 데이터는 ModelAndView 객체를 통해 Object로 전달 -->
	<!-- model의 attribute와 동일하게 el로 표시 -->
	이름 : ${name}<br>
	주소 : ${address}<br>
</body>
</html>