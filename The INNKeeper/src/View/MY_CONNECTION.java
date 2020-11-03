package View;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MY_CONNECTION {
public   Connection CreateConnection()
{

	java.sql.Connection connection = null;
	MysqlDataSource mds=new MysqlDataSource();
	mds.setServerName("35.193.80.255");
	mds.setPortNumber(3306);
	mds.setUser("sofproject");
	mds.setPassword("123");
	mds.setDatabaseName("TheINNKeeper");
	
	try {	
		connection = mds.getConnection();
	}catch(SQLException ex) {
		Logger.getLogger(MY_CONNECTION.class.getName()).log(Level.SEVERE,null,ex);
	}
	return connection;
	
	}
}
	




