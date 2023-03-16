<%@page import="com.rlfghks12q.utils.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String popupMode = "on";
	String popupCookieValue = CookieManager.readCookie(request, "popupCookie02");
	if(popupCookieValue != null && popupCookieValue.equals("off")){
		popupMode = popupCookieValue;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="./js/jquery-3.6.3.min.js"></script>
<style>
      .popup {
        position: fixed;
        left: 100px;
        top: 100px;
        border: 1px solid #000;
        box-shadow: 10px 10px 10px rgba(0, 0, 0, 0.1);
        width: 400px;
      }
      .popup h2 {
        padding: 20px;
        background-color: #111;
        color: #fff;
        margin: 0;
      }
      .popup .contents {
        padding: 20px;
        background-color: #fff;
      }
    </style>
</head>
<body>
	<% if(popupMode.equals("on")) { %>
	<div class="popup">
      <h2>공지사항</h2>
      <div class="contents">
        <p>공지사항입니다.</p>
        <p>공지사항입니다.</p>
        <p>공지사항입니다.</p>
        <p>공지사항입니다.</p>
        <p>공지사항입니다.</p>
      </div>
      <div>
        <input type="checkbox" id="sevenDayCheck" value="1" /> 오늘 하루 이창을 열지 않기
        <button class="btn sevenDay">닫기</button>
      </div>
    </div>
    <% } %>
    <script>
    	$(".sevenDay").on("click", function(){
    		const isChecked = $("#sevenDayCheck:checked").val();
    		$(".popup").hide();
    		$.ajax({
    			url:"popupModeProcess03.jsp",
    			type:"POST",
    			data:{sevenDay:isChecked},
    			success:function(response){
    				console.log(response);
    			}
    		});
    	})
    </script>
</body>
</html>