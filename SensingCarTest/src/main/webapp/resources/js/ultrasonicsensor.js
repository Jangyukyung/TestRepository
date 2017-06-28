function ultrasonicsensor(command,angle) {
	var json = {"command":command, "angle":angle};

	$.ajax({
		url:"http://" + location.host + "/SensingCarTest/ultrasonicsensor",
		data: json,
		method: "post",
		success: function(data) {
			if(data.result == "success") {
				$("#ultrasonicsensorStatus").html("angle=" + data.angle + "; distance=" + data.distance);
				
			}
		}
	});
}