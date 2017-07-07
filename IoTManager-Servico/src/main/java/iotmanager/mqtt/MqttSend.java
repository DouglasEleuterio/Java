package iotmanager.mqtt;

import java.util.Date;
import java.util.Random;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MqttSend {
	
	private boolean pubComplete;
	private boolean pubAttempted;
	static MqttAsyncClient asyncClient;
	//String topic        = "homebridge/to/set";
	int qos 			= 0;
    String broker       = "tcp://192.168.1.150:1883";
    //String clientId     = cliente;
    static String mensMQTT		= "";
    static String destinoMQTT	= "";
	
    private String geraCod(){
    	Random gerador = new Random();
    	Date date = new Date();
    	String cliente = "servidor"+gerador.nextInt(100)+date.toString();
    	return cliente;
    }
    
	public MqttSend(){
		try {
			asyncClient = new MqttAsyncClient(broker, geraCod());
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//public static void main(String[] args) {
	public void sendMsg(String mensagem, String destino){
		//System.out.println(cliente);	
		MqttSend publisherExample = new MqttSend();
		publisherExample.publishMessage(mensagem, destino);
		//mensMQTT = mensagem;
		//destinoMQTT = destino;
		//new Thread(enviaThread).start();
	}
	
	//private static Runnable enviaThread = new Runnable() {
		
		//public void run() {
			//MqttSend publisherExample = new MqttSend();
			//publisherExample.publishMessage(mensMQTT, destinoMQTT);
		//}
	//};
	
	public void publishMessage(String mensagem, String destino) {
		try {
		IMqttActionListener pubListener = new IMqttActionListener() {
			
			//@Override
			public void onSuccess(IMqttToken asyncActionToken) {
				setPubComplete(true);
				//System.out.println("Publish Success!");
				
			}
			
			//@Override
			public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
				setPubAttempted(false);
				System.out.println("Publish Failure!");
				
			}
		};
    	
	    	while(!pubComplete){
	    		if(!asyncClient.isConnected()){
	    			// Client is not connected
		    		asyncClient.connect();
		    	} else {
		    		while(!pubAttempted){
			    		// Client is connected
			    		MqttMessage msg = new MqttMessage();
			    		msg.setPayload(mensagem.getBytes());
			    		msg.setQos(0);
			    		//System.out.println("Attempting Publish");
			    		asyncClient.publish(destino, msg, null, pubListener);
			    		setPubAttempted(true);
		    		}
		    	}
	    		Thread.sleep(1000);
	    	}
    	//System.out.println("Publish Complete!");
    	//asyncClient.disconnect();
    	} catch (Exception ex){
    		System.err.println("Inturrupted");
    		ex.printStackTrace();
    	}
	}
	
	public void setPubComplete(boolean pubComplete){
		this.pubComplete = pubComplete;
	}
	
	public void setPubAttempted(boolean pubAttempted){
		this.pubAttempted = pubAttempted;
	}

}