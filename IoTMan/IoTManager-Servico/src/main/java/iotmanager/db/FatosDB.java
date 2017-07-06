package iotmanager.db;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Date;
import java.util.Collection;

import iotmanager.modelo.Fatos; 


public class FatosDB implements Dao<Fatos> {
   //public static void main( String args[] )
     //{
	   
	public Collection<Fatos> listar(){
	   
		   Fatos fato = new Fatos();
		   
		   ArrayList<Fatos> fatos = new ArrayList<Fatos>(); 
		   
	       Statement stmt = null;
	       try {    	  
	    	   Connection con = ConnectionFactory.getConexao();
	    	   stmt = con.createStatement();
	    	   ResultSet rs = stmt.executeQuery( "SELECT * FROM fatos;" );
	    	   while ( rs.next() ) {
	
	    		   fato.setCodigo(rs.getInt("codigo"));
	    		   fato.setData(rs.getDate("data"));
	    		   fato.setHora(rs.getTime("hora"));
	    		   fato.setOrigem(rs.getString("origem"));
	    		   fato.setSensor(rs.getString("sensor"));
	    		   fato.setInformacao(rs.getString("informacao"));
	
	    		   fatos.add(fato);
	
	    	   }
	
	    	 rs.close();
	         stmt.close();
	         con.close();
	         
	       } catch ( Exception e ) {
		         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		         System.exit(0);
	       }
	       
	       return fatos;
	       
	   }
}
//}