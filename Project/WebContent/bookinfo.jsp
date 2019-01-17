<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书籍信息</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js" ></script>
</head>
<body>
	<!-- 显示的table表格 -->
	<table id="tab" class="easyui-datagrid" style="width:400px;height:250px"   
        data-options="fit:true,url:'book_allbook',fitColumns:true,singleSelect:true,toolbar:'#tb'">   
	    <thead>   
	        <tr>   
	            <th data-options="field:'bid',width:100">编码</th>
	            <th data-options="field:'bname',width:100">书籍名称</th>
	            <th data-options="field:'bauthor',width:100">作者</th>
	            <th data-options="field:'bpublish',width:100">出版社</th>
	            <th data-options="field:'bdate',width:100">时间</th>
	            <th data-options="field:'bsum',width:100">总和</th>
	            <th data-options="field:'bnum',width:100">当前数量</th>
	            <th data-options="field:'type',width:100,formatter:function(value){if(value){return value.tname}}">类型名称</th>
	        </tr>   
	    </thead>   
	</table>
	
	
	<div id="tb">
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="add();">添加</a>
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" onclick="update();">修改</a>
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="del();">删除</a>
	</div>
	
	
	
	<div id="dd" class="easyui-dialog" title="My Dialog" style="width:600px;height:300px;"   
        data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#bb'">   
	    <form id="form1">
	    	<table align="center">
	    		<tr style="display: none">
	    			<td>编号：</td>
	    			<td><input id="bid" readonly="readonly" class="easyui-textbox" ></td>
	    		</tr>
	    		<tr>
	    			<td>名称：</td>
	    			<td><input id="bname" class="easyui-textbox" ></td>
	    		</tr>
	    		<tr>
	    			<td>作者：</td>
	    			<td><input id="bauthor" class="easyui-textbox" ></td>
	    		</tr>
	    		<tr>
	    			<td>出版社：</td>
	    			<td><input id="bpublish" class="easyui-textbox" ></td>
	    		</tr>
	    		<tr>
	    			<td>时间：</td>
	    			<td><input id="bdate" class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"></td>
	    		</tr>
	    		<tr>
	    			<td>总和：</td>
	    			<td><input id="bsum" class="easyui-textbox" ></td>
	    		</tr>
	    		<tr>
	    			<td>当前数量：</td>
	    			<td><input id="bnum" class="easyui-textbox" ></td>
	    		</tr>
	    		<tr>
	    			<td>类型名称：</td>
	    			<td><input id="type" class="easyui-combobox" ></td>
	    		</tr>
	    	</table>
	    </form>    
	</div>
	
	<div id="dd2" class="easyui-dialog" title="My Dialog" style="width:600px;height:300px;"   
        data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#bb2'">   
	    <form id="form2">
	    	<table align="center">
	    		<tr style="display: none">
	    			<td>编号：</td>
	    			<td><input id="biid" readonly="readonly" class="easyui-textbox" ></td>
	    		</tr>
	    		<tr>
	    			<td>操作人：</td>
	    			<td><input id="uname" readonly="readonly" class="easyui-textbox" ></td>
	    		</tr>
	    		<tr>
	    			<td>书籍名称：</td>
	    			<td><input id="bname2" readonly="readonly" class="easyui-textbox" ></td>
	    		</tr>
	    		<tr>
	    			<td>借出时间：</td>
	    			<td><input id="borrowdate" required="required" class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"></td>
	    		</tr>
	    		<tr>
	    			<td>归还时间：</td>
	    			<td><input id="returndate" required="required" class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"></td>
	    		</tr>
	    	</table>
	    </form>    
	</div>
	
	<div id="bb">
		<a href="#" class="easyui-linkbutton" onclick="OK();">保存</a>
		<a href="#" class="easyui-linkbutton" onclick="shut();">关闭</a>
	</div>
	
	
	<div id="bb2">
		<a href="#" class="easyui-linkbutton" onclick="OK2();">保存</a>
		<a href="#" class="easyui-linkbutton" onclick="shut();">关闭</a>
	</div>
	
</body>
<script type="text/javascript">
	function add(){
		$('#dd').dialog('open');
		$('#type').combobox({
			url:'type_alltype',
			valueField:'tid',
			textField:'tname'
		});
		$('#form1').form('clear');
	}
	
	function shut(){
		$('#dd').dialog('close');
		$('#dd2').dialog('close');
	}
	
	function OK(){
		$.ajax({
			type:'post',
			url:'book_editbook',
			data:{
				'book.bid':$('#bid').val(),
				'book.bname':$('#bname').val(),
				'book.bauthor':$('#bauthor').val(),
				'book.bpublish':$('#bpublish').val(),
				'book.bdate':$('#bdate').val(),
				'book.bsum':$('#bsum').val(),
				'book.bnum':$('#bnum').val(),
				'book.type.tid':$('#type').val()
			},
			success:function(msg){
				$('#tab').datagrid('reload');
				$('#dd').dialog('close');
			},
			error:function(){
				alert("报错");
			}
		});
	}
	
	function update(){
		var row = $('#tab').datagrid('getSelected');
		if (row != null) {
			add();
			$.ajax({
				type:'post',
				url:'book_querybyid',
				data:{
					'book.bid':row.bid
				},
				success:function(msg){
					//var obj=JSON.parse(msg);
					//var result = eval("("+msg+")");
					$('#bid').textbox('setValue',msg.bid);
					$('#bname').textbox('setValue',msg.bname);
					$('#bauthor').textbox('setValue',msg.bauthor);
					$('#bpublish').textbox('setValue',msg.bpublish);
					$('#bdate').datebox('setValue',msg.bdate);
					$('#bsum').textbox('setValue',msg.bsum);
					$('#bnum').textbox('setValue',msg.bnum);
					$('#type').combobox('setValue',msg.type.tid);
				},
				error:function(){
					alert("error");
				}
			});
		}else{
			alert("请选中你 要修改的数据！！！");
		}
	}
	
	
	function del(){
		var row = $('#tab').datagrid('getSelected');
		if (row != null) {
			$.ajax({
				type:'post',
				url:'book_del',
				data:{
					'book.bid':row.bid,
					'book.bname':row.bname
				},
				success:function(msg){
					$('#tab').datagrid('reload');
				},
				error:function(){
					alert(11);
				}
			});
		}else {
			alert("请选中你要删除的数据！！！");
		}
	}
	
	function borrow(){
		var row = $('#tab').datagrid('getSelected');
		if (row != null) {
			$('#dd2').dialog('open');
			$('#uname').textbox('setValue','${user}');
			$('#bname2').textbox('setValue',row.bname);
		}else {
			alert("请选中你要借阅的数据！！！");
		}
	}
	
	
	function OK2(){
		$.ajax({
			type:'post',
			url:'borrow_ensure',
			data:{
				'borrow.biid':$('#biid').val(),
				'borrow.uname':$('#uname').val(),
				'borrow.bname':$('#bname2').val(),
				'borrow.borrowdate':$('#borrowdate').val(),
				'borrow.returndate':$('#returndate').val()
			},
			success:function(msg){
				$('#dd2').dialog('close');
				alert("操作成功！！！");
			},
			error:function(){
				alert("报错");
			}
		});
	}
	
	function myformatter(date){
	    var y = date.getFullYear();
	    var m = date.getMonth()+1;
	    var d = date.getDate();
	    return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
	}
	function myparser(s){
	    if (!s) return new Date();
	    var ss = (s.split('-'));
	    var y = parseInt(ss[0],10);
	    var m = parseInt(ss[1],10);
	    var d = parseInt(ss[2],10);
	    if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
	        return new Date(y,m-1,d);
	    } else {
	        return new Date();
	    }
	}
</script>
</html>