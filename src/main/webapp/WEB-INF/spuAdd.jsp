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
<script type="text/javascript">

</script>
<title>Insert title here</title>
</head>
<body>
	spu信息添加${spu.flbh1}|${spu.flbh2}|${spu.pp_id}
	
	<form action="spu_add.do" enctype="multipart/form-data" method="post">
		<input type="hidden" name="flbh1" value="${spu.flbh1}" />
		<input type="hidden" name="flbh2" value="${spu.flbh2}" />
		<input type="hidden" name="pp_id" value="${spu.pp_id}" />
		
		商品名称：<input name="shp_mch" type="text" /><br>
		商品描述：<textarea name="shp_msh" rows="10" cols="50"></textarea><br>
		商品图片：<br>
		<input type="file" name="files" />
		<input type="file" name="files" />
		<input type="file" name="files" />
		
		<input type="submit" value="提交" />
	</form>
</body>
</html>