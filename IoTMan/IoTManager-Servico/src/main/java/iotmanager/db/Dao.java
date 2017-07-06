package iotmanager.db;

import java.util.Collection;

import iotmanager.modelo.Entidade;;

public interface Dao <E extends Entidade> {

	Collection<E> listar();
	
}
