package iotmanager.db;

import java.sql.*;
import java.util.Date;
import java.text.*;

public class InsertFatos {
	
	private static int geraCod(){
		
		int newCod = 0;
		
		try {
	    	  
    	  	Connection con = ConnectionFactory.getConexao();
    	  	
    	  	String consultaCod = "SELECT MAX(codigo) as cod FROM fatos;";
	         
	         PreparedStatement consulta = con.prepareStatement(consultaCod);
	         ResultSet resultado = consulta.executeQuery();
	         while(resultado.next()){
	        	 int ultCod = resultado.getInt("cod");
	        	 newCod = ultCod + 1;
	         }
	         con.close();
	         
		}catch (SQLException e) {
			System.out.println("Erro ao conectar ao banco" + e.getMessage());
		}
		
		return newCod;
	}
	
	
   public static void gravarFato(String origem, String sensor, String valor) {
	  Date date = new Date(); 
	  SimpleDateFormat sdfh = new SimpleDateFormat("HH:mm:ss");
	  SimpleDateFormat sdfd = new SimpleDateFormat("yyyy/MM/dd");
	  String horaFormatada = sdfh.format(date);
	  String dataFormatada = sdfd.format(date);

      Statement stmt = null;
      try {
    	  
    	 Connection con = ConnectionFactory.getConexao();
    	 con.setAutoCommit(false);

         stmt = con.createStatement();
         String sql = "INSERT INTO fatos (codigo,data,hora,origem,sensor,informacao) "
               //+ "VALUES (0, '01/01/01', '10:10', 'California', 'TEMPERATURA', '23.2' );";
        		 + "VALUES ("
                 +  geraCod() + "," 
                 +  "'" + dataFormatada  + "'," 
                 +  "'" + horaFormatada  + "',"
                 +  "'" + origem.toString()		 + "',"
                 +  "'" + sensor.toString()		 + "',"
                 +  "'" + valor.toString()		     + "');";
         stmt.executeUpdate(sql);

         stmt.close();
         con.commit();
         con.close();
         //System.out.println(sql);
      } catch (SQLException e) {
			System.out.println("Erro ao conectar ao banco" + e.getMessage());
		}
      
      System.out.println("Records created successfully");
   }
}