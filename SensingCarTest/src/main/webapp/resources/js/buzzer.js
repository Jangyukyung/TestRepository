function buzzer(command, status){
	var json = {"command":command, "status":status};
	console.log(json);
	$.ajax({
		url:"http://" + location.host + "/SensingCarTest/buzzer",
		data: json,
		method:"post",
		success: function(data){
			if(data.result=="success"){
				$("#buzzerStatus").html(data.status);
				
			}
		}
	});
}