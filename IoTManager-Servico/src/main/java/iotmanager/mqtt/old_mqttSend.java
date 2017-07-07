package iotmanager.mqtt;

//import java.sql.Timestamp;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
//import org.eclipse.paho.client.mqttv3.MqttMessage;
//import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class old_mqttSend {
	
	public void enviaMensagem(String content) {
		//System.out.println(mensagem);
	//	String topic        = "msgTratada";
	    //String content      = "Message from MqttPublishSample";
	  //  int qos             = 2;
	    String broker       = "tcp://192.168.1.150:1883";
	    String clientId     = "Servidor";
	    //MemoryPersistence persistence = new MemoryPersistence();
	 
	    
	    try{
	    	//MqttClient client = new MqttClient(broker, clientId);
	    	MqttClient client = new MqttClient(broker, clientId);
		    MqttConnectOptions conOpt = new MqttConnectOptions();
		    System.out.println("Oi");
	    	
		 // Connect to the MQTT server
	    	//log("Connecting to "+brokerUrl + " with client ID "+client.getClientId());
	    	System.out.println(client.isConnected());
		    if(client.isConnected() == false){
		    	client.connect(conOpt);
		    }
		    
		    //System.out.println(client.isConnected());
	    	//log("Connected");
	
	    	//String time = new Timestamp(System.currentTimeMillis()).toString();
	    	//log("Publishing at: "+time+ " to topic \""+topicName+"\" qos "+qos);
	
	    	// Create and configure a message
	   		//MqttMessage message = new MqttMessage(content.getBytes());
	    	//message.setQos(qos);
	
	    	// Send the message to the server, control is not returned until
	    	// it has been delivered to the server meeting the specified
	    	// quality of service.
	    	//client.publish(topic, message);
	
	    	// Disconnect the client
	    	//client.disconnect();
	    	//log("Disconnected");
	    } catch(MqttException me) {
	        System.out.println("reason "+me.getReasonCode());
	        System.out.println("msg "+me.getMessage());
	        System.out.println("loc "+me.getLocalizedMessage());
	        System.out.println("cause "+me.getCause());
	        System.out.println("excep "+me);
	        me.printStackTrace();
	    }
	}	
 
}

