<%-- 
    Document   : exam11
    Created on : 2017. 4. 27, 오전 11:53:57
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
	<script>
		function handleBtn1(){
			var imgArray=$("img");
			imgArray.attr("src","<%=application.getContextPath() %>/resources/image/photo04.jpg");
		}
		function handleBtn2(){
			var img1=$("#img1");
			img1.attr("src","<%=application.getContextPath() %>/resources/image/photo05.jpg";
		}
		function handleBtn3(){
			var class1=$(".class1");
			class1.attr("src","<%=application.getContextPath() %>/resources/image/photo06.jpg";
		}
	</script>
    </head>
    <body>
        <h1>DOM 사용하기</h1>
		<div>
			<button onclick="handleBtn1()">이미지 변경</button> <br/>
			<img src="<%=application.getContextPath() %>/resources/image/photo03.jpg" width="100px" height="100px"/>
			<img src="<%=application.getContextPath() %>/resources/image/photo03.jpg" width="100px" height="100px"/>
		</div>
		<div>
			<button onclick="handleBtn2()" class="btn btn-success">img1 이미지 변경</button> <br/>
			<button onclick="handleBtn3()" class="btn btn-success">class1 이미지 변경</button> <br/>
			<img id="img1" src="<%=application.getContextPath() %>/resources/image/photo03.jpg" width="100px" height="100px"/>
			<img class="class1" src="<%=application.getContextPath() %>/resources/image/photo03.jpg" width="100px" height="100px"/>
			<img class="class1" src="<%=application.getContextPath() %>/resources/image/photo03.jpg" width="100px" height="100px"/>
		</div>
    </body>
</html>
