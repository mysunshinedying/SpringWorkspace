$(document).ready(function(){
   $('#bookNoCheckBtn').on('click',function(event) {
        event.preventDefault();

        let bookNo = $('#bookNo').val();

        if(!bookNo){
            alert('도서 번호를 입력하세요');
            return false;
        } else {
            let data = {bookNo : bookNo};
            axios.post('/mybatisEx/book/bookNoCheck5', data)
                .then(function(response){
                    console.log(response.data);
                    if(response.data === 'available'){
                        alert('사용 가능한 번호입니다.5');
                    } else {
                        alert('사용 불가능한 번호입니다.5');
                    }
                })
                .catch(
                    (error) => {console.log(error.response)}
                )
        }

   });
});
