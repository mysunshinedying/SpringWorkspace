<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 리스트</title>
<style>
	body, h1, table, thead, tbody { text-align: center; }
	table { margin: 0 auto; border: 1px solid #000; }
	thead { background: gold; }
	table th, table td { border: 1px solid #000;  }
</style>
</head>
<body>
	<h1>상품 리스트</h1>
	<table>
		<thead>
		<tr>
			<th>상품번호</th>
			<th>상품명</th>
			<th>가격</th>
			<th>제조사</th>
			<th>재고</th>
			<th>제조일자</th>
		</tr>
		</thead>
		<tbody>
		<c:choose>
			<c:when test="${empty prdList}">
				<tr>
					<td colspan="6">등록된 상품 정보가 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="p" items="${prdList}">
				<tr>
					<td>${p.prdNo}</td>
					<td>${p.prdName}</td>
					<td><fmt:formatNumber value="${p.prdPrice}" type="currency" currencySymbol="￦"/></td>
					<td>${p.prdCompany}</td>
					<td>${p.prdStock}</td>
					<td><fmt:formatDate value="${p.prdDate}" pattern="yyyy-MM-dd"/></td>
				</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		</tbody>
	</table>
	<p><a href="<c:url value="/"/>">처음으로</a></p>
</body>
</html>
