package iotmanager.servico;

import java.util.ArrayList;

import iotmanager.db.FatosDB;
import iotmanager.modelo.Fatos;

public class FatosServico {
	
	private FatosDB dao = new FatosDB();
	
	private FatosDB getDao(){
		return dao;
	}

	public ArrayList<Fatos> listarTodosFatos(){
		return new ArrayList<Fatos>(this.getDao().listar());
	}
		
}
