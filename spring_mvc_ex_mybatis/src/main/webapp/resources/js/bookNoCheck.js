$(document).ready(function(){
   $('#bookNoCheckBtn').on('click',function(event) {
        event.preventDefault();

        let bookNo = $('#bookNo').val();

        if(!bookNo){
            alert('도서 번호를 입력하세요');
            return false;
        } else {
            $.ajax({
                type:'post',
                url:'/mybatisEx/book/bookNoCheck',
                data:{'bookNo':bookNo},
                dataType:'text',
                success:function (result) {
                    if(result==='available'){
                        alert('사용 가능한 번호입니다.');
                    } else {
                        alert('사용 불가능한 번호입니다.');
                    }
                },
                error:function (data, textStatus) {
                    alert('전송실패');
                }
            });
        }

   });
});
