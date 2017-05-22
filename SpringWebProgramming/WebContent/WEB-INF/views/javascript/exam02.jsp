<%-- 
    Document   : exam02
    Created on : 2017. 4. 26, 오전 11:37:48
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
		<script>
			function totalSum(from,to){
				
				if(to ==undefined){
					to=from;
					from=1;
				}  //to 값이 없을때 
				
				var sum=0;
				for(var i=from; i<=to; i++){
					sum+=i;
				}
				return sum;
			}
			
			var result=totalSum(1,100);
			console.log("result: " +result);
			
			var result=totalSum(100);
			console.log("result: " +result);
		</script>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
