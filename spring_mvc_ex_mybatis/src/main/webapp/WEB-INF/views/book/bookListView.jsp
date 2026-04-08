<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 도서 조회</title>
<style>
    body, h1, table, thead, tbody { text-align: center; }
    table { margin: 0 auto; border: 1px solid #000; }
    thead { background: gold; }
    table th, table td { border: 1px solid #000;  }
</style>
</head>
<body>
<h1>도서 리스트</h1>
<table>
    <thead>
    <tr>
        <th>도서번호</th>
        <th>도서명</th>
        <th>저자명</th>
        <th>가격</th>
        <th>발행일자</th>
        <th>재고</th>
        <th>출판사 번호</th>
        <th>수정</th>
        <th>삭제</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${bookList}" var="b">
            <tr>
                <td><a href="/mybatisEx/book/detailViewBook/${b.bookNo}">${b.bookNo}</a></td>
                <td>${b.bookName}</td>
                <td>${b.bookAuthor}</td>
                <td>${b.bookPrice}</td>
                <td><fmt:formatDate value="${b.bookDate}" pattern="YYYY-MM-dd"/></td>
                <td>${b.bookStock}</td>
                <td>${b.pubNo}</td>
                <td><a href="<c:url value='/book/updateBookForm/${b.bookNo}'/>">수정</a></td>
                <td><a href="<c:url value='/book/deleteBook/${b.bookNo}'/>" onclick="return deleteCheck();">삭제</a></td>
            </tr>
        </c:forEach>
    <script>
        function deleteCheck() {
            let answer = confirm("삭제 하시겠습니까?");
        }
    </script>
    </tbody>
</table>
<p><a href="<c:url value="/"/>" class="homeLink">처음으로</a></p>
</body>
</html>