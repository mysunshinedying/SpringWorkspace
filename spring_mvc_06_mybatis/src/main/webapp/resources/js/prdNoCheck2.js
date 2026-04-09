/**
 *  상품번호 중복 체크 : ajax 활용
 */

$(document).ready(function(){
   $('#prdNoCheckBtn').on('click',function(event) {
        event.preventDefault();

        let prdNo = $('#prdNo').val();

        if(!prdNo){
            alert('상품 번호를 입력하세요');
            return false;
        } else {
            //js 내장 함수 fetch("url+data").then().catch()
            fetch('/mybatis/product/prdNoCheck2/'+prdNo) //1. url로 네트워크 요청 전송, 서버 응답 개체: promise 객체 반환
                .then(response => response.text()) //콜백으로 호출됨 -> HTTPResponse 객체를 첫번째 인자로 받음
                //.then(response => console.log(response.text()))
                .then(result => {
                    //첫번째 then에서 파싱한 실제 body data를 인자로 받음
                    console.log(result);
                    if(result === 'available'){
                        alert('사용 가능한 번호입니다2.');
                     } else {
                        alert('사용 불가능한 번호입니다2.');
                    }
                })
                .catch(err => console.log(err));
        } //else

   }); //on
}); //ready