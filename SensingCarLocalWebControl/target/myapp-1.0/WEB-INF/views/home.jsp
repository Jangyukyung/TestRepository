<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>Home</title>
		<link href="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

		<script src="<%=application.getContextPath() %>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>

		<script src="<%=application.getContextPath() %>//resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>

		<script type="text/javascript">
			function handleBtnUltrasonicSensor(){
				var angle=$("#txtUltrasonicSensorAngle").val();
				$.ajax({
					url:"<%=application.getContextPath()%>/ultrasonicsensor",
					data: {"angle":angle},
					success: function(data){
						$("#spanUltrasonicSensorDistance").text(data.distance);
					}
				});
	
			}
			
			function handleBtnGasSensor(){
				
				$.ajax({
					url:"<%=application.getContextPath()%>/gassensor",
					
					success: function(data){
						$("#spanGasSensor").text(data.gas);
					}
				});
	
			}
		</script>
	</head>


	<body>
		<h3>Sensing Web Control</h3>
		<hr/>
		<h4>[ Ultrasonicsensor ]</h4>
		[ UltrasonicSensor 제어 ]<br/>
		<input id="txtUltrasonicSensorAngle" type="number" />
		<button id="btnUltrasonicSensor" class="btn btn-info" onclick="handleBtnUltrasonicSensor()">거리 측정</button>
		<span id="spanUltrasonicSensorDistance"> </span> cm
		
		<h4>[ Gassensor ]</h4>
		[ GasSensor 제어 ]<br/>
		
		<button id="btnGasSensor" class="btn btn-info" onclick="handleBtnGasSensor()">가스 측정</button>
		<span id="spanGasSensor"> </span> /255
		 
		 
		
	</body>
</html>