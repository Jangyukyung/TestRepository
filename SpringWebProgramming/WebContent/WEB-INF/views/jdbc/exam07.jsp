<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8>
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>JSP Page</title>
		<link href="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		
		<script src="<%=application.getContextPath() %>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
		
		<script src="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
    
    <style type="text/css">
    	.layer{
    		position:absolute;
    		top:40%;
    		left:50%;
    		transform:translate(-50%,-50%)
    	}
    	</style>
    	
    </head>
<body>
	
	<div class="layer" style="font-family:sans-serif; ; text-align:center;">
	<h2 style="font-family:sans-serif; ; text-align:center; font-weight: bold;"> 게시물 목록 Member</h2>
	<hr/>
	<div align="right">
		<a href="exam03" class="btn btn-default" style="margin:5px">글쓰기</a>
	</div>
	
	<table class="table table-bordered" style="width:1000px;" >
			<tr class="warning">
				
				<td>번호</td>
				<td>사진</td>
				<td>이름</td>
				<td>비밀번호</td>
				<td>날짜</td>
				<td>전화번호</td>
				<!-- <td>이메일</td> -->
				<td>나이</td>
				<td>주소</td>
				
				 </tr>
			<c:forEach var="m" items="${list}">
				<tr>
					
					<td><a href="exam07Detail?mid=${m.mid}">${m.mid}</a></td>
					<td><img src="file/image?mid=${m.mid}" width="100px"/></td>
					<td>${m.mname}</td>
					<td>${m.mpassword}</td>
					<td>${m.mdate}</td>
					<td>${m.mtel}</td>
					<%-- <td>${m.memail}</td> --%>
					<td>${m.mage}</td>
					<td>${m.maddress}</td>
					
				</tr>
			</c:forEach>
		</table> 
			
		<hr/>
		
		
		<div class="row">
		<c:forEach var="m" items="${list }">
			<div class="col-sm-4">
				<a href ="exam07Detail?mid=${m.mid }">
					<img class="img-thumbnail" src="file/image?mid=${m.mid}" width="100%"/>
				</a>
			</div>
		</c:forEach>
		</div>
			
			
		
		<div style="margin-top: 20px; width:700px; text-align: center;">
			<a href ="exam07?pageNo=1">[처음]</a>
			<c:if test="${groupNo>1}">
				<a href ="exam07?pageNo=${startPageNo-1}">[이전]</a>
			</c:if>
			
			<c:forEach var="i" begin="${startPageNo}" end="${endPageNo }">
				&nbsp;
					<a href="exam07?pageNo=${i}"<c:if test="${pageNo==i}">style="font-weight: bold; color: red;"</c:if>>
						${i}
					</a>
				&nbsp;
				
			</c:forEach>
			
			<c:if test="${groupNo<totalGroupNo }">
				<a href ="exam07?pageNo=${endPageNo+1}">[다음]</a>
			</c:if>
			 <a href="exam07?pageNo=${totalPageNo}">[맨끝]</a>
		</div>
		</div>
</body>

</html>