<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	index 페이지 입니다.<br>
	<p>redirect</p>
	<a href="/data2/redirect">redirect</a><br>
	redirect param 전달방식<br>
	<a href="/data2/redirectParam1">쿼리 스트링 방식</a><br>
	<a href="/data2/redirectParam2">Model 객체</a><br>
	<a href="/data2/redirectParam3">RedirectAttributes 객체</a><br>
	
	<p>Product</p>
	<a href="/data2/product/productForm">상품등록1(getParameter())</a><br>
	<a href="/data2/product/productForm2">상품등록2(@RequestPram 생략)</a><br>
	<a href="/data2/product/productForm3">상품등록3(command 객체 사용) - 콘솔에 로그 전달된 값 출력</a><br>
	<a href="/data2/product/productForm4">상품등록4(@ModelAttribute)</a><br>
	<a href="/data2/product/productSearchForm">상품검색</a>
	
	<p>Student</p>
	<a href="/data2/student/studentForm">studentForm(getParameter()) + url에 데이터를 첨부</a><br>
	<a href="/data2/student/studentForm2">studentForm2(@RequestParam)</a><br>
	<a href="/data2/student/studentForm2-1">studentForm2_1(@RequestParam 생략)</a><br>
	<a href="/data2/student/studentForm3">studentForm3(command 객체 사용 요청)</a><br>
	<a href="/data2/student/studentForm4">studentForm4(@ModelAttribute)</a><br>
	<a href="/data2/student/studentSearchForm">studentSearchForm(HashMap)</a><br>
	
	<p>showInfo</p>
	<a href="/data/showInfo">showInfo</a><br>
	<a href="/data/showInfo2">showInfoModelAndView</a><br>
	<a href="/data/showInfo3">showInfoModelAndView / MODEL</a><br>
	<p>BOOK</p>
	<a href="/data/bookInfoView1">bookInfoView1</a><br>
	<a href="/data/bookInfoView2">bookInfoView2</a>
	<a href="/data/book/bookInfoView3">bookInfoView3</a>
	<a href="/data/book/bookInfoView4">bookInfoView4</a>
</body>
</html>