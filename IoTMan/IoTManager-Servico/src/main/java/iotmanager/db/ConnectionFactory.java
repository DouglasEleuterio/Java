package iotmanager.db;

import java.sql.*;
import java.util.*;

public class ConnectionFactory {
   public static Connection getConexao() throws SQLException {
      try {
         Class.forName("org.postgresql.Driver");
         ResourceBundle prop = ResourceBundle.getBundle("jdbc");

		//final InputStream in = getClass().getResourceAsStream("/META-INF/email.properties");
		//final Properties properties = new Properties();

         String url = prop.getString("jdbc.url");
         String user = prop.getString("jdbc.user");
         String password = prop.getString("jdbc.password");

         return DriverManager.getConnection(url, user, password);
      } catch (Exception e) {
    	  throw new SQLException(e);
      }
   }
}
