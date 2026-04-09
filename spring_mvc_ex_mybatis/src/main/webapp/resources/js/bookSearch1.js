$(document).ready(function(){
   $('#bookSearchFrm1').on('submit',function (e) {
        e.preventDefault();

       let formData = $(this).serialize();

       let keyword = $('#keyword').val();
       let type = $('#type').val();

       if(!keyword || !type){
           alert('검색 조건과 검색어를 입력하세요');
       } else {
           $.ajax({
               type:'post',
               url:'/mybatisEx/book/bookSearch1',
               data:formData,
               success:function (result) {
                   console.log(result);

                   let resultTable = '<table id="resultTable" border="1" width="700">' +
                           '<tr><th>도서번호</th><th>도서명</th><th>저자명</th><th>가격</th><th>발행일자</th><th>재고</th><th>출판사 번호</th></tr>';
                   if(!result){
                       resultTable += '<tr align="center"><td colspan="7">찾는 도서가 없습니다</td></tr>';
                   } else {
                       for(let i = 0; i < result.length; i++){
                           let book_date = new Date(result[i].bookDate);
                           let year = book_date.getFullYear();
                           let month = (book_date.getMonth() + 1).toString().padStart(2,'0');
                           let date = (book_date.getDate()).toString().padStart(2,'0');
                           let bookDate = `${year}-${month}-${date}`;
                           resultTable += '<tr><td>' + result[i].bookNo + '</td><td>' +
                                                                    result[i].bookName + '</td><td>' +
                                                                    result[i].bookAuthor + '</td><td>' +
                                                                    result[i].bookPrice + '</td><td>' +
                                                                    bookDate + '</td><td>' +
                                                                    result[i].bookStock + '</td><td>' +
                                                                    result[i].pubNo + '</td></tr>';
                       }
                   }
                   resultTable += '</table>';
                   $('#searchResultBox').empty().append(resultTable);
               },
               error:function () {
                   alert('전송실패');
               }
           });
       }
   });
});

