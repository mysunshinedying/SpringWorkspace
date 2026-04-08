<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>도서 정보 등록</title>
    <style>
        body, form, h1{ text-align:center; }
        table { margin: 0 auto; margin-bottom:20px; text-align:left; }
        a { text-decoration: none; }
        .homeLink {
            background: #bddbf1;
            padding: 2px 6px;
            border-radius: 8px;
            color: #000;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <h1>도서 정보 등록</h1>
    <form method="POST" action="<c:url value='/book/insertBook'/>">
        <table>
            <tbody>
            <tr>
                <th><label for="bookNo">도서번호</label></th>
                <td><input type="text" name="bookNo" id="bookNo" /></td>
            </tr>
            <tr>
                <th><label for="bookName">도서명</label></th>
                <td><input type="text" name="bookName" id="bookName" /></td>
            </tr>
            <tr>
                <th><label for="bookAuthor">저자명</label></th>
                <td><input type="text" name="bookAuthor" id="bookAuthor" /></td>
            </tr>
            <tr>
                <th><label for="bookPrice">가격</label></th>
                <td><input type="number" name="bookPrice" id="bookPrice" /></td>
            </tr>
            <tr>
                <th><label for="bookDate">발행일자</label></th>
                <td><input type="text" name="bookDate" id="bookDate" /></td>
            </tr>
            <tr>
                <th><label for="bookStock">재고</label></th>
                <td><input type="number" name="bookStock" id="bookStock" /></td>
            </tr>
            <tr>
                <th><label for="pubNo">출판사 번호</label></th>
                <td><input type="text" name="pubNo" id="pubNo" /></td>
            </tr>
            </tbody>
        </table>
        <input type="submit" value="등록">
        <input type="reset" value="취소">
    </form>
    <p><a href="<c:url value='/' />" class="homeLink">홈으로 이동</a></p>
</body>
</html>