<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员管理用户信息</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">   
<script type="text/javascript" src="easyui/jquery.min.js"></script>   
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
</head>
<body>
	<table id="tab" class="easyui-datagrid"   
        data-options="fit:true,url:'borrow_querybyname',
        queryParams: {
				'borrow.uname': '${user}'
			},fitColumns:true,singleSelect:true,toolbar:'#tb'">   
	    <thead>   
	        <tr>   
	            <th data-options="field:'biid',width:100">编号</th>
	            <th data-options="field:'uname',width:100">用户名称</th>
	            <th data-options="field:'bname',width:100">书籍名称</th>
	            <th data-options="field:'borrowdate',width:100">借书时间</th>
	            <th data-options="field:'returndate',width:100">还书时间</th>
	        </tr>   
	    </thead>   
	</table> 
	
	<!-- table导航栏 -->
	<div id="tb">
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-man',plain:true" onclick="del();">申请还书</a>
	</div>
</body>
<script type="text/javascript">
	function del(){
		var row = $('#tab').datagrid('getSelected');
		if (row != null) {
			$.ajax({
				type:'post',
				url:'borrow_del',
				data:{
					'borrow.biid':row.biid
				},
				success:function(msg){
					$('#tab').datagrid('reload');
					alert("操作成功！！");
				},error:function(){
					alert(111);
				}
			});
		}else{
			alert("请选中要提交的行！！");
		}
	}
	
</script>
</html>