<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
	<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
    	body{
		    background: url("img/04.jpg");
		    background-size: cover;
		    background-repeat: no-repeat;
		    animation-name:myfirst;
		    animation-duration:20s;
		    /*变换时间*/
		    animation-timing-function: linear;
		    animation-delay:2s;
		    /*动画开始时间*/
		    animation-iteration-count:infinite;
		    /*下一周期循环播放*/
		    animation-play-state:running;
		    /*动画开始运行*/
		}
		@keyframes myfirst
		{
		    0%   {background:url("img/04.jpg");
		 			background-size: cover;}
		    25%  {background:url("img/06.jpg");
					background-size: cover;}
		    50%  {background:url("img/07.jpg");
					background-size: cover;}
		    75% {background:url("img/08.jpg");
					background-size: cover;}
			100% {background:url("img/05.jpg");
					background-size: cover;}
		}
		.form{background: rgba(255,255,255,0.2);width:400px;margin:120px auto;}
		/*阴影*/
		.fa{display: inline-block;top: 27px;left: 6px;position: relative;color: #ccc;}
		input[type="text"],input[type="password"]{padding-left:26px;}
		.checkbox{padding-left:21px;}
    </style>
</head>
<body>
	
    <div class="container">
    	<form action="login_login" method="post">
	        <div class="form row">
	            <div class="form-horizontal col-md-offset-3" id="login_form">
	                <h3 class="form-title">LOGIN</h3>
	                <div class="col-md-9">
	                    <div class="form-group">
	                        <i class="fa fa-user fa-lg"></i>
	                        <input class="form-control required" type="text" placeholder="Username" id="username" name="username" autofocus="autofocus" maxlength="20"/>
	                    </div>
	                    <div class="form-group">
	                            <i class="fa fa-lock fa-lg"></i>
	                            <input class="form-control required" type="password" placeholder="Password" id="password" name="password" maxlength="8"/>
	                    </div>
	                    <div class="form-group">
	                        <label class="checkbox">
	                            <input type="checkbox" name="remember" value="1"/>记住我
	                        </label>
	                    </div>
	                    <div class="form-group col-md-offset-9">
	                        <button type="submit" class="btn btn-success pull-right" name="submit">登录</button>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </form>
    </div>
</body>
</html>