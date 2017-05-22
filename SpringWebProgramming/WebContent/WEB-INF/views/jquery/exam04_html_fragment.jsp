<%-- 
    Document   : exam04_html_fragment
    Created on : 2017. 4. 27, 오후 3:22:23
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%for (int i = 2; i <= 5; i++) {%>
<div>
	<img src="<%=application.getContextPath() %>/resources/image/photo<%=i%>.jpg" width="30px" height="30px"/>
	<span>메시지<%=i%></span>
</div>
<%}%>