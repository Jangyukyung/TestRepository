<%-- 
    Document   : exam01
    Created on : 2017. 4. 26, 오후 12:37:42
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>JSP Page</title>
		<link href="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		
		<script src="<%=application.getContextPath() %>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
		
		<script src="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
		<h3> 버튼</h3>
			<button>Default</button>
			<button class="btn btn-default">Default</button>
			<button class="btn btn-primary">primary</button>
			<button class="btn btn-success">success</button>
			<button class="btn btn-info">info</button>
			<a class="btn btn-info" href="/WebApplication">a 태그</a>
			<input type="button" value="input 태그" class="btn btn-warning"/>
			
		<h3> 테이블</h3>
		<table class="table table-bordered table-hover">
			<tr class="active">
				<td>번호</td>
				<td>제목</td>
				<td>글쓴이</td>
			</tr>
			
			<tr>
				<td>1</td>
				<td class="success">오늘은 축구하는 날</td>
				<td>유경</td>
			</tr>
			
			<tr>
				<td>2</td>
				<td>오늘은 자바하는 날</td>
				<td>602</td>
			</tr>
		</table>
		
		<h3>이미지</h3>
		<img src="/WebApplication/resources/image/photo1.jpg" width="100px" height="100px"/>
		<img class="img-rounded" src="/WebApplication/resources/image/photo1.jpg"/>
		<img class="img-circle" src="/WebApplication/resources/image/photo1.jpg"/>
		
		<h3>폼</h3>
		<form>
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label>
				<input class="form-control" id="exampleInputEmail1" placeholder="Email">
			</div>
		</form>
    </body>
</html>
