/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.chart;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class ThermistorController implements Initializable {


	private static final int MAX_DATA_POINTS = 50;
    private String xSeriesData = "";
    private XYChart.Series series1;
    private XYChart.Series series2;
    private ExecutorService executor;
    private BlockingQueue<Number> dataQ1 = new ArrayBlockingQueue<Number>(1024);
    private BlockingQueue<Number> dataQ2 = new ArrayBlockingQueue<Number>(1024);

    @FXML
    private CategoryAxis xAxis = new CategoryAxis();
    @FXML
    final NumberAxis yAxis = new NumberAxis();
    @FXML
    final LineChart<String, Number> linechart = new LineChart<String, Number>(xAxis, yAxis);
	@FXML
	private TextField fluidT;
	@FXML
	private TextField gasT;


public void initGraph(){
    xAxis.setAutoRanging(false);

    xAxis.setTickLabelsVisible(false);
    xAxis.setTickMarkVisible(false);

    NumberAxis yAxis = new NumberAxis();
    yAxis.setAutoRanging(true);

    //Graph
    final LineChart<String, Number> lc = new LineChart<String, Number>(xAxis, yAxis){
            @Override 
            protected void dataItemAdded(Series<String, Number> series, int itemIndex, Data<String, Number> item){}
            };
    lc.setAnimated(false);
    lc.setId("liveLineChart");
    lc.setTitle("Animated Line Chart");

    //Graph Series
    series1 = new XYChart.Series<Number, Number>();
    series2 = new XYChart.Series<Number, Number>();
    linechart.getData().addAll(series1, series2);

    series1.setName("T1");
    series2.setName("T2");

    fluidT.setText("0000");
    gasT.setText("0000");

//    prepareTimeline();
//
//    Runnable con = new Consumer(this) {};
//    Thread c = new Thread(con);
//    c.start();

}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	
	
}
