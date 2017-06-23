function backtire(command,direction, speed) {
	var json = {"command":command, "direction":direction, "speed":speed};

	$.ajax({
		url:"http://" + location.host + "/SensingCarRemoteWebControl/backtire",
		data: json,
		method: "post",
		success: function(data) {
			if(data.result == "success") {
				$("#backtireStatus").html("direction=" + data.direction+"; speed=" +data.speed);
				
				$("#btnForward").attr("onclick", "backtire('change', 'forward', '" + data.speed + "')");
				$("#btnBackward").attr("onclick", "backtire('change', 'backward', '" + data.speed + "')");
				
				$("#btnSpeed0").attr("onclick","backtire('change','" + data.direction + "'  ,'0')" );
				$("#btnSpeed1").attr("onclick","backtire('change','" + data.direction + "'  ,'1000')" );
				$("#btnSpeed2").attr("onclick","backtire('change','" + data.direction + "'  ,'1300')" );
				$("#btnSpeed3").attr("onclick","backtire('change','" + data.direction + "'  ,'1600')" );
				$("#btnSpeed4").attr("onclick","backtire('change','" + data.direction + "'  ,'1900')" );
				$("#btnSpeed5").attr("onclick","backtire('change','" + data.direction + "'  ,'2200')" );
				$("#btnSpeed6").attr("onclick","backtire('change','" + data.direction + "'  ,'2500')" );
				$("#btnSpeed7").attr("onclick","backtire('change','" + data.direction + "'  ,'2800')" );
				$("#btnSpeed8").attr("onclick","backtire('change','" + data.direction + "'  ,'3100')" );
				$("#btnSpeed9").attr("onclick","backtire('change','" + data.direction + "'  ,'3400')" );
				$("#btnSpeed10").attr("onclick","backtire('change','" + data.direction + "'  ,'3700')" );
			}
		}
	});
}