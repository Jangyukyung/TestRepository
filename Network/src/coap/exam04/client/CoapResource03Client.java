package coap.exam04.client;

import java.io.IOException;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapHandler;
import org.eclipse.californium.core.CoapObserveRelation;
import org.eclipse.californium.core.CoapResponse;

public class CoapResource03Client {
	//Field
	private CoapClient coapClient;
	private CoapObserveRelation coapObserveRelation;
	
	//Constructor
	public CoapResource03Client(){
		coapClient=new CoapClient();
		
	}
	//Method
	public void observe(){
		coapClient.setURI("coap://192.168.3.32/resource03");
		coapObserveRelation=coapClient.observe(new CoapHandler(){
			@Override
			public void onLoad(CoapResponse response) {  //통보 왔을 때 
				String text=response.getResponseText();
				System.out.println(text);
			}

			@Override
			public void onError() {
			}
			
		});
	}
	
	public void shutdown(){
		coapObserveRelation.proactiveCancel(); //관찰 기능 중지
		coapClient.shutdown();  //클라이언트 종료 
	}
	
	public static void main(String[] args) throws IOException {
		CoapResource03Client client=new CoapResource03Client();
		client.observe();
		System.in.read();
		
		client.shutdown();
	}
}
