<%-- 
    Document   : exam01
    Created on : 2017. 4. 28, 오전 11:15:17
    Author     : Administrator
[지시자]
1. 작성 <%@......%>
2. 종류
<%@page ... %> :JSP가 무엇을 만들어 내느냐?
<%@include ... %>
<%@taglib ... %> : JSP에서 추가적으로 사용할 수 있는 커스텀 태그 로딩

--%>

<%@page contentType="text/html ;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h4>JSTL(Java Standard Tag Library) 사용하기 </h4>
		<%for(int i=3;i<7;i++){%>
			<img src="<%=application.getContextPath() %>/resources/image/photo0<%=i%>.jpg"  width="50px" height="50px"/>
		<%}%>
		
		<br/>
		
		<c:forEach begin="3" end="7" step="1" varStatus="status">
			<img src="<%=application.getContextPath() %>/resources/image/photo0${status.count}.jpg"  width="50px" height="50px"/>
		</c:forEach>
			
    </body>
</html>
