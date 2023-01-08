<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jquery : ajax, bootstrap, datepicker -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>

<!-- bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<!-- css -->
<link rel="stylesheet" href="/static/css/style.css">
</head>
<body>
	<!-- #wrap.section > .~~area > .~~box -->
	<div class="user-login d-flex">

		<div class="image-area w-100">
			<!-- 이미지 들어가는 영역 -->
			<img src="https://picsum.photos/1000" alt="">


			<div class="login-area w-50">
				<!-- 로고 -->
				<h1 class="logo text-center">
					<a href="#">랜덤화상채팅</a>
				</h1>
				
				<div class="user-login-content-box">
					<div class="user-login-content">
						<!-- 데이터 입력 -->
						<div class="user-loginbox">
							<input type="text" placeholder="아이디"> <input
								type="password" placeholder="비밀번호" autoComplete="off">
							<!--label은 id값만 먹는 것 같아 input 값 아이디로 지정했음. 체크해야함. -->
							<label for="user-remember-check"> <input type="checkbox"
								id="user-remember-check"> 아이디 저장하기
							</label>
						</div>
						<!-- 버튼들 -->
						<div class="user-button-box mt-3">
							<input type="submit" value="로그인" class="user-login-submit">
							<input type="button" value="소셜로그인" class="user-login-social">
							<img src="/static/img/kakao_login_large_wide.png"
								class="user-login-kakao">
						</div>
						<hr>
						<!-- 아이디, 비밀번호찾기, 회원가입 -->
						<p class="user-find">
							<span><a href="/user/id">아이디 찾기</a></span> 
							<span><a href="/user/pwd">비밀번호 찾기</a></span> 
							<span><a href="/user/sign-up">회원가입</a></span>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>