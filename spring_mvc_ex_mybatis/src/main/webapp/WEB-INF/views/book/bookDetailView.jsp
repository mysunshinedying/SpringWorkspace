<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>도서 정보 상세 조회(${book.bookName})</title>
    <style>
        body, h1, table, thead, tbody { text-align: center; }
        table { margin: 0 auto; border: 1px solid #000; }
        thead { background: gold; }
        table th, table td { border: 1px solid #000;  }
        a { text-decoration: none;
            padding: 2px 6px;
            border-radius: 8px;
            font-weight: bold; }
        .homeLink {
            background: #bddbf1;
            color: #000;
        }
        .deleteLink {
            background: #800c2b;
            color:#fff;
        }
        .updateLink {
            background: #5fba5a;
            color: #000;
        }
    </style>
</head>
<body>
    <h1>${book.bookName} 정보 조회</h1>
    <table>
        <tr>
            <th>도서번호</th>
            <td>${book.bookNo}</td>
        </tr>
        <tr>
            <th>도서명</th>
            <td>${book.bookName}</td>
        </tr>
        <tr>
            <th>저자명</th>
            <td>${book.bookAuthor}</td>
        </tr>
        <tr>
            <th>가격</th>
            <td>${book.bookPrice}</td>
        </tr>
        <tr>
            <th>발행 일자</th>
            <td><fmt:formatDate value="${book.bookDate}" pattern="YYYY-MM-dd"/></td>
        </tr>
        <tr>
            <th>재고</th>
            <td>${book.bookStock}</td>
        </tr>
        <tr>
            <th>출판사 번호</th>
            <td>${book.pubNo}</td>
        </tr>
    </table>
    <p>
    <a href="<c:url value='/'/>" class="homeLink">홈으로 이동</a>
    <a href="<c:url value='/book/updateBookForm/${book.bookNo}'/>" class="updateLink">상품 정보 수정</a>
    <a href="javascript:deleteCheck();" class="deleteLink">상품 정보 삭제</a>
    <script>
        function deleteCheck() {
            let answer = confirm("삭제 하시겠습니까?");
            if(answer) {
                location.href="<c:url value='/book/deleteBook/${book.bookNo}'/>"
            }
        }
    </script>
    </p>
</body>
</html>