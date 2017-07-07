package iotmanager.tratativas;

import java.util.regex.Pattern;

import iotmanager.mqtt.MqttSend;

public class trataDados{
	static String mensagemOriginal = "";
	static String deOndeVem = "";
	
	public static void receberDados(String msg, String origem){
		mensagemOriginal = msg;
		deOndeVem = origem;
		new Thread(rodaPorra).start();
	}
	
	public static Runnable rodaPorra = new Runnable() {
		public void run(){
			tratamento(mensagemOriginal, deOndeVem);
		}
	};
	
	private static void tratamento(String msg, String origem){	
			try{
				String infoSeparada[] = msg.split(Pattern.quote(","));
				
				if(origem == "ESP"){
					//Array 0 = Nome do Sensor
					//Array 1 = Local da Leitura
					//Array 2 = Valor
					//Array 3 = Serviço Homebridge
					//Array 4 = Caracteristica HomeBridge
					
					//InsertFatos.gravarFato(infoSeparada[0], infoSeparada[1], infoSeparada[2]);
					
					
					String mensagemMQTT = 
							"{\"name\": \""
							+ infoSeparada[0]
							+ "\", \"service_name\": \""
							+ infoSeparada[3]
							+ "\", \"characteristic\": \""
							+ infoSeparada[4]
							+ "\", \"value\": \""
							+ infoSeparada[2]
							+ "\"}";
					
					MqttSend enviar = new MqttSend();
					enviar.sendMsg(mensagemMQTT, "homebridge/to/set");
					
				}
				
				if(origem == "homebridge"){
					String msgSeparada[] = msg.split(Pattern.quote("\""));
					//for(int i=0; i < msgSeparada.length; i++){
						//System.out.println(msgSeparada[i]);
					//}
					String detalheSeparado[] = msgSeparada[3].split(Pattern.quote("_"));
					//System.out.print("Sensor: ");
					//System.out.println(detalheSeparado[0]);
					//System.out.print("Local: ");
					//System.out.println(detalheSeparado[1]);
					String acao = msgSeparada[14].replaceAll(":", "").replaceAll("}", "");
					//System.out.print("Ação: ");
					//System.out.println(acao);
					
					String enviaComando = 
							detalheSeparado[0] 
							+ ","
							+ acao;
					
					MqttSend enviar = new MqttSend();
					enviar.sendMsg(enviaComando, detalheSeparado[1]);
				}
				
			
			}catch(Exception a){
				System.out.println(a);
				//log("a");
			}
		}
	}
	

