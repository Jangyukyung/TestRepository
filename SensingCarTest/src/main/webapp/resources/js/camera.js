function camera(command, leftright, updown) {
	
	var json = {"command":command, "leftright":leftright, "updown":updown};
	
	$.ajax({
		url:"http://" + location.host + "/SensingCarTest/camera",
		data: json,
		method: "post",
		success: function(data) {
			console.log(data.result);
			if(data.result == "success") {
				//$("#cameraStatus").html("leftright=" + data.leftright + "; updown=" + data.updown);
				
				//$("#btnLeftRight").attr("onclick", "camera('change', 'leftright', '" + data.updown + "')");
				
				//$("#btnUpDown").attr("onclick", "camera('change',  '" + data.leftright + "' , 'updown')");
				//$("#leftright").attr("onchange", "camera('change',  '" + data.leftright + "' , 'updown')");
				$("#rangeLeftRight").html(data.leftright);
				$("#rangeUpDown").html(data.updown);
				
				
				/*$("#btnLeftright180").attr("onclick", "camera('change', '180', '" + data.updown + "')");
				$("#btnLeftright135").attr("onclick", "camera('change', '135', '" + data.updown + "')");
				$("#btnLeftright90").attr("onclick", "camera('change', '90', '" + data.updown + "')");
				$("#btnLeftright45").attr("onclick", "camera('change', '45', '" + data.updown + "')");
				$("#btnLeftright0").attr("onclick", "camera('change', '0', '" + data.updown + "')");
				$("#btnUpdown10").attr("onclick", "camera('change', '" + data.leftright + "', '10')");
				$("#btnUpdown45").attr("onclick", "camera('change', '" + data.leftright + "', '45')");
				$("#btnUpdown75").attr("onclick", "camera('change', '" + data.leftright + "', '75')");*/
			}
		}
	});
}