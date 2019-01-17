<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>还书申请</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">   
<script type="text/javascript" src="easyui/jquery.min.js"></script>   
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
</head>
<body>
	<table id="tab" class="easyui-datagrid"   
        data-options="fit:true,url:'return_allreturn',fitColumns:true,singleSelect:true,toolbar:'#tb'">   
	    <thead>   
	        <tr>   
	            <th data-options="field:'riid',width:100">编号</th>
	            <th data-options="field:'uname',width:100">用户名称</th>
	            <th data-options="field:'bname',width:100">书籍名称</th>
	            <th data-options="field:'applydate',width:100">申请时间</th>
	        </tr>   
	    </thead>   
	</table> 
	
	<!-- table导航栏 -->
	<div id="tb">
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-man',plain:true" onclick="del();">通过申请</a>
	</div>
	
	
	
	<div id="dd" class="easyui-dialog" title="My Dialog" style="width:400px;height:350px;"   
        data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#bb'">   
	    <form id="form" style="margin:0 auto;">
	    	<table style="margin:0 auto;padding-top: 30px;">
	    		<tr style="display: none;">
	    			<td>编号：</td>
	    			<td><input id="uid" readonly="readonly" class="easyui-textbox"></td>
	    		</tr>
	    		<tr>
	    			<td>名称：</td>
	    			<td><input id="uname" class="easyui-textbox" required="required" ></td>
	    		</tr>
	    		<tr>
	    			<td>密码：</td>
	    			<td><input id="upwd" class="easyui-textbox" required="required" ></td>
	    		</tr>
	    		<tr>
	    			<td>班级：</td>
	    			<td><input id="uclass" class="easyui-textbox" required="required" ></td>
	    		</tr>
	    		<tr>
	    			<td>电话：</td>
	    			<td><input id="utel" class="easyui-textbox" required="required" ></td>
	    		</tr>
	    		<tr>
	    			<td>借书数量：</td>
	    			<td><input id="borrownum" class="easyui-textbox" required="required" ></td>
	    		</tr>
	    	</table>
	    </form>    
	</div>
	
	<div id="bb">
		<a href="#" class="easyui-linkbutton" onclick="OK();">保存</a>
		<a href="#" class="easyui-linkbutton" onclick="shutdown();">关闭</a>
	</div>
</body>
<script type="text/javascript">
	/* function a(){
		$('#t_tid').combobox({
			url:'type_alltype',
			valueField:'tid',
			textField:'tname'
		}); */
	/* function search(){
		$('#tab').datagrid({
			queryParams: {
				'book.type.tid':$('#t_tid').val(),
				'book.bname':$('#b_bname').val(),
				'book.bauthor':$('#b_bauthor').val(),
				'book.des':$('#b_des').val()
			}
		});
	} */

	
	function add(){
		$('#dd').dialog('open');
		$('#form').form('clear');
	}
	
	/************************添加********************************/
	function OK(){
		$.ajax({
			type:'post',
			url:'adminSeeUser_editUser',
			data:{
				'user.uid':$('#uid').val(),
				'user.uname':$('#uname').val(),
				'user.upwd':$('#upwd').val(),
				'user.uclass':$('#uclass').val(),
				'user.utel':$('#utel').val(),
				'user.borrownum':$('#borrownum').val()
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
				url:'adminSeeUser_querybyid',
				data:{
					'user.uid':row.uid
				},
				success:function(msg){
					$('#uid').textbox('setValue',msg.uid);
					$('#uname').textbox('setValue',msg.uname);
					$('#upwd').textbox('setValue',msg.upwd);
					$('#uclass').textbox('setValue',msg.uclass);
					$('#utel').textbox('setValue',msg.utel);
					$('#borrownum').textbox('setValue',msg.borrownum);
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
				url:'return_del',
				data:{
					'returninfo.riid':row.riid
				},
				success:function(msg){
					$('#tab').datagrid('reload');
				}
			});
		}else{
			alert("请选中要通过的申请！！");
		}
	}
	
</script>
</html>