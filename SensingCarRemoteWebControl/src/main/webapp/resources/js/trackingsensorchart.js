var trackingSensorChart;
$(function() {
	trackingSensorChart = new Highcharts.Chart({
		chart: {
			renderTo:"trackingSensorChartContainer",
			type:"spline",
			events: {
				load: requestTrackingSensorData
			}
		},
		colors: ['gray'],
		title: {
			text: "trackingsensor(라인감지선센서)"
		},
		xAxis: {
			type: "datetime",
			tickPixelInterval: 100,
			minRange: 20*1000
		},
		yAxis: {
			title: {
				text: "감지",
				margin: 30
			}
		},
		series: [{
			name: "감지",
			data: [ ]
		}]
	});
});

function requestTrackingSensorData() {
	var ws = new WebSocket("ws://" + location.host + "/SensingCarRemoteWebControl/websocket/trackingsensor");
	ws.onmessage = function(event) {
		var data = JSON.parse(event.data);
		var series = trackingSensorChart.series[0];
		var shift = series.data.length > 20;
		series.addPoint([data.time, data.trackingvalue], true, shift);
	};
}






