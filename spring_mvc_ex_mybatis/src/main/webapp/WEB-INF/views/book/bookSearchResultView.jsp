<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>도서 검색 결과 출력</title>
</head>
<body>
<h3>도서 검색 결과</h3>
<table border="1" width="700">
	<tr>
		<th>도서번호</th>
		<th>도서명</th>
		<th>저자명</th>
		<th>가격</th>
		<th>발행일자</th>
		<th>재고</th>
		<th>출판사 번호</th>
	</tr>
	<c:choose>
		<c:when test="${empty bookList}">
			<tr align="center">
			<td colspan="7">찾는 도서가 없습니다</td>
		</c:when>
		<c:otherwise>
			<c:forEach items="${bookList}" var="b">
				<tr>
					<td><a href="<c:url value='/book/detailViewBook/${b.bookNo}'/>">${b.bookNo}</a></td>
					<td>${b.bookName}</td>
					<td>${b.bookAuthor}</td>
					<td>${b.bookPrice}</td>
					<td><fmt:formatDate value="${b.bookDate}" pattern="YYYY-MM-dd" /></td>
					<td>${b.bookStock}</td>
					<td>${b.pubNo}</td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
</table>
</body>
</html>

