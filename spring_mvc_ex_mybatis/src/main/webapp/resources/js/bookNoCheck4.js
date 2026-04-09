$(document).ready(function(){
   $('#bookNoCheckBtn').on('click',function(event) {
        event.preventDefault();

        let bookNo = $('#bookNo').val();

        if(!bookNo){
            alert('도서 번호를 입력하세요');
            return false;
        } else {
            axios.get('/mybatisEx/book/bookNoCheck4/' + bookNo)
                .then(function(response){
                    console.log(response.data);
                    if(response.data === 'available'){
                        alert('사용 가능한 번호입니다.4');
                    } else {
                        alert('사용 불가능한 번호입니다.4');
                    }
                })
                .catch(
                    (error) => {console.log(error.response)}
                )
        }

   });
});
