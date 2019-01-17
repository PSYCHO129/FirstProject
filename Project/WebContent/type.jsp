<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书类别表</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js" ></script>
</head>
<body>
	<!-- 显示的table表格 -->
	<table id="tab" class="easyui-datagrid" style="width:400px;height:250px"   
        data-options="fit:true,url:'type_alltype',fitColumns:true,singleSelect:true,toolbar:'#tb'">   
	    <thead>   
	        <tr>   
	            <th data-options="field:'tid',width:100">编码</th>
	            <th data-options="field:'tname',width:100">名称</th>
	        </tr>   
	    </thead>   
	</table>
	
	
	<div id="tb">
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="add();">添加</a>
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" onclick="update();">修改</a>
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="del();">删除</a>
	</div>
	
	
	
	<div id="dd" class="easyui-dialog" title="My Dialog" style="width:400px;height:200px;"   
        data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#bb'">   
	    <form id="form1">
	    	<table>
	    		<tr style="display: none">
	    			<td>编号：</td>
	    			<td><input id="tid" readonly="readonly" class="easyui-textbox" ></td>
	    		</tr>
	    		<tr>
	    			<td>名称：</td>
	    			<td><input id="tname" class="easyui-textbox" ></td>
	    		</tr>
	    	</table>
	    </form>    
	</div>
	
	
	
	<div id="bb">
		<a href="#" class="easyui-linkbutton" onclick="OK();">保存</a>
		<a href="#" class="easyui-linkbutton" onclick="shut();">关闭</a>
	</div>
	
	
</body>
<script type="text/javascript">
	function add(){
		$('#dd').dialog('open');
		$('#form1').form('clear');
	}
	
	function shut(){
		$('#dd').dialog('close');
	}
	
	function OK(){
		$.ajax({
			type:'post',
			url:'type_edit',
			data:{
				'type.tid':$('#tid').val(),
				'type.tname':$('#tname').val()
			},
			success:function(msg){
				$('#tab').datagrid('reload');
				$('#dd').dialog('close');
			},
			error:function(){
				alert(11);
			}
		});
	}
	
	function update(){
		var row = $('#tab').datagrid('getSelected');
		if (row != null) {
			add();
			$.ajax({
				type:'post',
				url:'type_querybyid',
				data:{
					'type.tid':row.tid
				},
				success:function(msg){
					$('#tid').textbox('setValue',msg.tid);
					$('#tname').textbox('setValue',msg.tname);
				},
				error:function(){
					alert("error");
				}
			});
		}else{
			alert("请选中你要修改的行！！");
		}
	}
	
	
	function del(){
		var row = $('#tab').datagrid('getSelected');
		if (row != null) {
			$.ajax({
				type:'post',
				url:'type_del',
				data:{
					'type.tid':row.tid
				},
				success:function(msg){
					$('#tab').datagrid('reload');
				},
				error:function(){
					alert(11);
				}
			});
		}else{
			alert("请选中你要删除的行！！");
		}
	}
</script>
</html>