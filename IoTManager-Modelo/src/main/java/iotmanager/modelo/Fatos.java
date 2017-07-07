package iotmanager.modelo;

import java.util.Date;

public class Fatos implements Entidade {
	
	private int codigo;
	private Date data;
	private Date hora;
	private String origem;
	private String sensor;
	private String informacao;
	private Long identificador;
	
	//@Override
	public Long getIdentificador(){
		return identificador;
	}
	
	public Fatos(){
		
	}
	
	public Fatos(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public Date getData(){
		return data;
	}
	
	public void setData(Date data){
		this.data = data;
	}
	
	public Date getHora(){
		return hora;
	}
	
	public void setHora(Date hora){
		this.hora = hora;
	}
	
	public String getOrigem(){
		return origem;
	}
	
	public void setOrigem(String origem){
		this.origem = origem;
	}
	
	public String getSensor(){
		return sensor;
	}
	
	public void setSensor(String sensor){
		this.sensor = sensor;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	

}
