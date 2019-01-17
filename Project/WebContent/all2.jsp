<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>起始页</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">   
<script type="text/javascript" src="easyui/jquery.min.js"></script>   
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<style type="text/css">
	#cc{
		margin: auto;
		width:1024px;
		height:950px;
	}
	#left div{
		text-align: center;
	}
	#aa a{
		text-decoration: none;
		font-size: 15px;
		color:#0099FF;
		margin-top: 20px;
		display: inline-block;
	}
	#aa a:hover{
		color:red;
	}
	
	#w{
		display:inline-block;
		margin-top:30px;
		margin-left: 130px;
		line-height: 30px;
		font-size: 33px;
	}
	#roll{
		margin-top: 43px;
		margin-left:35px;
		width: 180px;
		float: left;
		/* background-color: red; */
		line-height: 45px;
	}
</style>
</head>
<body>
	<div id="cc" class="easyui-layout">
		<!-- 布局上面 -->
	    <div data-options="region:'north',split:false" style="height:110px;">
	    
	    	<span id="w">欢迎进入图书管理系统</span>
	    	<div id="roll" style="height: 40px;padding-top: 20px;">
				<marquee direction="left" height="25" width="100%" onmouseout="this.start()" onmouseover="this.stop()" scrollamount="3" scrolldelay="1">
					尊敬的${admin}${user},欢迎您进入图书管理系统
				</marquee>
			</div>
	    </div>
	    <!-- 下面 -->
	    <div data-options="region:'south',split:false" style="height:100px;"></div>
	    <!-- 左边 -->
	    <div id="left" data-options="region:'west',split:false" style="width:252px;">
	    	
	    	<!-- 左边的导航栏 -->
	    	<div id="aa" class="easyui-accordion" style="width:250px;height:300px;">   
			    <div title="读者管理" style="padding:10px;">
			         <% 
				    	String admin = (String)session.getAttribute("admin");
				    	String user = (String)session.getAttribute("user");
			    	if(admin != null){
			         %><a href="#" onclick="add('个人信息','adminsingleinfo.jsp');">个人信息</a> <%  
			    		
			    	}else {
			    		%><a href="#" onclick="add('个人信息','usersingleinfo.jsp');">个人信息</a> <%
			    	}
			    %>  
			    </div>   
			    <div title="图书管理">   
			         <a href="#" onclick="add('图书信息','bookinfo2.jsp');">图书信息</a><br>
			    </div>
			    <div title="图书借还管理">   
			         <a href="#" onclick="add('我的借阅','myborrow.jsp');">我的借阅</a>    
			    </div>
			    <div title="还书申请">   
			         <a href="#" onclick="add('我的还书信息','returninfo2.jsp');">我的还书信息</a><br>
			    </div>
			    <div title="推荐信息">   
			         <a href="#" onclick="add('图书推荐信息','recommendbook.jsp');">图书推荐</a><br>
			         <a href="#" onclick="add('类型推荐信息','recommendtype.jsp');">类型推荐</a>
			    </div>
			</div> 
	    
	    </div>
	    <!-- 中间 -->
	    <div data-options="region:'center'" style="padding:1px;background:#eee;">
	    
	    	<div id="tt" data-options="fit:true" class="easyui-tabs" >   
			    <div title="首页" data-options="closable:false" style="padding:20px;display:none;">
			    </div>
			</div>
	    
	    </div>
	</div> 
</body>
<script type="text/javascript">
function add(title,name){
	if ($('#tt').tabs('exists',title)) {
		$('#tt').tabs('select',title);
	} else {
		var content = "<iframe scrolling:'auto' frameborder:'0' src='"+name+"' style='width:99.99%;height:99.9%;border:0px solid white;'></iframe>";
		$('#tt').tabs('add',{    
		    title:title,    
		    content:content,    
		    closable:true
		});
	}
}
</script>
</html>