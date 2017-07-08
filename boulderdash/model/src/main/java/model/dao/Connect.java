package model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.api.jdbc.Statement;




public class Connect
{
	public String wordmap = null;

public Connect(){
	
	this.Connection();
}


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
	String sql = "call GetMap(1)";
	rs = st.executeQuery(sql);
	while (rs.next()){
		wordmap=rs.getString("Map");}
	
//System.out.println(wordmap);
	
	
}
catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}
	

}
public String Getmap() {
	return this.wordmap;
	
}}
