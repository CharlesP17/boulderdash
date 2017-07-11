package model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.api.jdbc.Statement;

/**
 * Class that reads from the database and put the data in a Table
 * @author Florentin
 *
 */


public class Connect
{   
	public char levelmap[][];
	public String wordmap = null;
	static int idlevel = 2;
	
public Connect(){
	
	
	this.Connection(); 
	
}


/**
 * Connection to the database
 */
public void Connection()
{
	String url = "jdbc:mysql://localhost/boulderdash?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String login ="root";
	String passwd= "";
	Connection cn = null;
	Statement st = null;
	ResultSet rs =null;
	
	


try 
{
	cn = DriverManager.getConnection(url, login, passwd);
	st = (Statement) cn.createStatement();
	String sql = "call GetMap("+idlevel+")";
	rs = st.executeQuery(sql);
	while (rs.next()){
		wordmap=rs.getString("Map");}
	this.split();	
}
catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}
	

}

public String getWordmap() {
	return wordmap;
}


/**
 * Filling of a 20 by 20 table with the data
 */
public void split(){
	this.levelmap = new char[20][20];
	String str = this.wordmap;
	String[] splitArray = str.split(";");
	for(int x = 0; x<20;x++){
	for(int y = 0; y<20;y++){
		levelmap[x][y]=splitArray[x].charAt(y);}}
	

}



}
