<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书推荐信息显示</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">   
<script type="text/javascript" src="easyui/jquery.min.js"></script>   
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
</head>
<body>
	<table id="tab" class="easyui-datagrid"   
        data-options="fit:true,url:'recommendtype_allrecommendType',fitColumns:true,singleSelect:true,toolbar:'#tb'">   
	    <thead>   
	        <tr>   
	            <th data-options="field:'rtid',width:100">编号</th>
	            <th data-options="field:'tname',width:100">名称</th>
	            <th data-options="field:'rtsum',width:100">数量</th>
	        </tr>   
	    </thead>   
	</table> 
	
</body>
<script type="text/javascript">
	/* function a(){
		$('#t_tid').combobox({
			url:'type_alltype',
			valueField:'tid',
			textField:'tname'
		}); */
	function search(){
		$('#tab').datagrid({
			queryParams: {
				'book.type.tid':$('#t_tid').val(),
				'book.bname':$('#b_bname').val(),
				'book.bauthor':$('#b_bauthor').val(),
				'book.des':$('#b_des').val()
			}
		});
	}

	
	function add(){
		$('#dd').dialog('open');
		$('#form').form('clear');
	}
	
	/************************添加********************************/
	function OK(){
		$.ajax({
			type:'post',
			url:'admin_editadmin',
			data:{
				'admin.aid':$('#aid').val(),
				'admin.ausername':$('#ausername').val(),
				'admin.apwd':$('#apwd').val()
			},
			success:function(msg){
				$('#dd').dialog('close');
				$('#tab').datagrid('reload');
			}
		});
		/* $('#tid').combobox({
			url:'type_alltype',
			valueField:'tid',
			textField:'tname'
		}); */
		/*  $('#form').form('reset');*/
	}
	function shutdown(){
		$('#dd').dialog('close');
	}
	
	
	function update(){
		var row = $('#tab').datagrid('getSelected');
		if (row != null) {
			add();
			$.ajax({
				type:'post',
				url:'admin_querybyid',
				data:{
					'admin.aid':row.aid
				},
				success:function(msg){
					$('#aid').textbox('setValue',msg.aid);
					$('#ausername').textbox('setValue',msg.ausername);
					$('#apwd').textbox('setValue',msg.apwd);
				}
			});
		}else{
			alert("请选中要修改的行！！");
		}
	}
	
	function del(){
		var row = $('#tab').datagrid('getSelected');
		if (row != null) {
			$.ajax({
				type:'post',
				url:'admin_del',
				data:{
					'admin.aid':row.aid
				},
				success:function(msg){
					$('#tab').datagrid('reload');
				}
			});
		}else{
			alert("请选中要删除的行！！");
		}
	}
	
</script>
</html>