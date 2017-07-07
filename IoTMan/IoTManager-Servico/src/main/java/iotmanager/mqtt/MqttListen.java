package iotmanager.mqtt;

//import mqttsql.mqttsql.mqttSend;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
//import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
//import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import iotmanager.tratativas.trataDados;

public abstract class MqttListen implements MqttCallback {
	

	public static void main(String[] args) {

	    String topic        = "ESP";
	    String topic2        = "homebridge/from/set";
	    //String content      = "Message from MqttPublishSample";
	    //int qos             = 2;
	    String broker       = "tcp://192.168.1.150:1883";
	    String clientId     = "Servidor_ESP";
	    String clientId2     = "Servidor_HomeBridge";
	    MemoryPersistence persistence = new MemoryPersistence();

	    try {
	        IMqttClient client = new MqttClient(broker, clientId, persistence);
	        IMqttClient client2 = new MqttClient(broker, clientId2, persistence);
	        MqttConnectOptions connOpts = new MqttConnectOptions();
	        System.out.println("Connecting to broker: "+broker);
	        client.connect(connOpts);
	        client2.connect(connOpts);
	        System.out.println("Connected");
	        client.subscribe(topic);
	        client2.subscribe(topic2);
	        
	        client.setCallback(new MqttCallback() {
				
				public void messageArrived(String topico, MqttMessage mensagem) throws Exception {
					//System.out.println(mensagem);
					
					//trataDados tratar = new trataDados(); 
					
					trataDados.receberDados(mensagem.toString(),"ESP");
				}
				
				public void deliveryComplete(IMqttDeliveryToken arg0) {
					
				}
				
				public void connectionLost(Throwable arg0) {
					
				}
			});
	        
	        client2.setCallback(new MqttCallback() {
				
				public void messageArrived(String topico, MqttMessage mensagem) throws Exception {
					//System.out.println(mensagem);
					
					//trataDados tratar = new trataDados(); 
					
					trataDados.receberDados(mensagem.toString(),"homebridge");
				}
				
				public void deliveryComplete(IMqttDeliveryToken arg0) {
					
				}
				
				public void connectionLost(Throwable arg0) {
					
				}
			});
	        
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