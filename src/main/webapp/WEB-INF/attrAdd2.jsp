<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
	添加商品属性
	<hr>
	<input type="button" value="添加属性名列表" onclick="add_table()" />
	<form action="attr_add.do" id="attr_form">
		<input type="text" value="${flbh2}" name="flbh2" id="ii"/>
		<table border="1" width="700px" id="1">
			<tr><td>属性名：<input type="text" name="list_attr[0].shxm_mch" /></td><td></td><td><a href="javascript:;" onclick="add_attr(this)">添加属性值</a></td></tr>
			<tr><td>属性值：<input type="text" name="list_attr[0].list_value[0].shxzh" /></td><td>单位：<input type="text" name="list_attr[0].list_value[0].shxzh_mch" /></td><td><a href="javascript:delete()">删除</a></td></tr>
<!-- 		<tr><td>属性值：<input type="text" name="list_attr[0].list_value[1].shxzh" /></td><td>单位：<input type="text" name="list_attr[0].list_value[1].shxzh_mch" /></td><td>删除</td></tr> -->
		</table>
		<!-- <table border="1" width="500px">
			<tr><td>属性名：<input type="text" name="list_attr[1].shxm_mch" /></td><td></td><td>添加值</td></tr>
			<tr><td>属性值：<input type="text" name="list_attr[1].list_value[0].shxzh" /></td><td>单位：<input type="text" name="list_attr[1].list_value[0].shxzh_mch" /></td><td>删除</td></tr>
			<tr><td>属性值：<input type="text" name="list_attr[1].list_value[1].shxzh" /></td><td>单位：<input type="text" name="list_attr[1].list_value[1].shxzh_mch" /></td><td>删除</td></tr>
		</table> -->
		<input type="submit" value="提交" />
	</form>
<script type="text/javascript">
	function add_table(){
		var table_len = $("table").length;
		//alert(table_len);
		var a = '<table border="1" width="700px">'
		var b = '<tr><td>属性名：<input type="text" name="list_attr['+table_len+'].shxm_mch" /></td><td></td><td><a href="javascript:;" onclick="add_attr(this)">添加属性值</a></td></tr>'
		var c = '<tr><td>属性值：<input type="text" name="list_attr['+table_len+'].list_value[0].shxzh" /></td><td>单位：<input type="text" name="list_attr['+table_len+'].list_value[0].shxzh_mch" /></td><td><a href="javascript:delete()">删除</a></td></tr>'
		var d = '</table>'
		$("#ii").after(a+b+c+d);
	}
	
	function add_attr(obj){
		//alert(obj);
		var table_len = $("table").length;
		var i = $("table tr").length;
		$(obj).parents("table").append('<tr><td>属性值：<input type="text" name="list_attr['+table_len+'].list_value['+(i-1)+'].shxzh" /></td><td>单位：<input type="text" name="list_attr['+table_len+'].list_value['+(i-1)+'].shxzh_mch" /></td><td><a href="javascript:delete()">删除</a></td></tr>')
	}
	/* function delete(){
		alert("1");	
	} */
</script>
</body>
</html>