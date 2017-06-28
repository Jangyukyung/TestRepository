var gasSensorChart;
$(function() {
	gasSensorChart = new Highcharts.Chart({
		chart: {
			renderTo:"gasSensorChartContainer",
			type:"spline",
			events: {
				load: requestgasSensorData
			}
		},
		colors: ['pink'],
		title: {
			text: "gasSensor(가스센서)"
		},
		xAxis: {
			type: "datetime",
			tickPixelInterval: 100,
			minRange: 20*1000
		},
		yAxis: {
			title: {
				text: "가스",
				margin: 30
			}
		},
		series: [{
			name: "가스",
			data: [ ]
		}],
		//마커(점)이 없어지는 현상 방지 
		plotOptions: {
			series: {
				marker: {
					enabled: true
				}
			}
		}
	});
});

function requestgasSensorData() {
	var ws = new WebSocket("ws://" + location.host + "/SensingCarTest/websocket/gassensor");
	ws.onmessage = function(event) {
		var data = JSON.parse(event.data);
		var series = gasSensorChart.series[0];
		var shift = series.data.length > 20;
		series.addPoint([data.time, data.gas], true, shift);
	};
}






