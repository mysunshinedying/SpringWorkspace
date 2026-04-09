$(document).ready(function(){
   $('#bookNoCheckBtn').on('click',function(event) {
        event.preventDefault();

        let bookNo = $('#bookNo').val();

        if(!bookNo){
            alert('도서 번호를 입력하세요');
            return false;
        } else {
            fetch('/mybatisEx/book/bookNoCheck3/',
                {
                    method:'post',
                    headers: { 'Content-Type': 'application/json' },
                    body:bookNo,
                })
                .then(response => response.text())
                .then(result => {
                    console.log(result);
                    if(result === 'available'){
                        alert('사용 가능한 번호입니다3.');
                     } else {
                        alert('사용 불가능한 번호입니다3.');
                    }
                })
                .catch(err => console.log(err));
        }

   });
});
