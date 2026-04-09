$(document).ready(function(){
   $('#bookNoCheckBtn').on('click',function(event) {
        event.preventDefault();

        let bookNo = $('#bookNo').val();

        if(!bookNo){
            alert('도서 번호를 입력하세요');
            return false;
        } else {
            fetch('/mybatisEx/book/bookNoCheck2/'+bookNo)
                .then(response => response.text())
                .then(result => {
                    console.log(result);
                    if(result === 'available'){
                        alert('사용 가능한 번호입니다2.');
                     } else {
                        alert('사용 불가능한 번호입니다2.');
                    }
                })
                .catch(err => console.log(err));
        }

   });
});
