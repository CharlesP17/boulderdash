package model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.api.jdbc.Statement;




public class Connect
{   
	public char levelmap[][];
	public String wordmap = null;

public Connect(){
	
	this.Connection();
}


public void Connection()
{
	String url = "jdbc:mysql://localhost/boulderdash_1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String login ="root";
	String passwd= "";
	Connection cn = null;
	Statement st = null;
	ResultSet rs =null;


try 
{
	cn = DriverManager.getConnection(url, login, passwd);
	st = (Statement) cn.createStatement();
	String sql = "call GetMap(4)";
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
public void split(){
	this.levelmap = new char[20][20];
	String str = this.wordmap;
	String[] splitArray = str.split(";");
	for(int x = 0; x<20;x++){
	for(int y = 0; y<20;y++){
		levelmap[x][y]=splitArray[x].charAt(y);}}
	
/*for(int i = 0; i < this.levelmap.length; i++) {
for(int j =0; j < this.levelmap.length; j++) {
System.out.print(this.levelmap[i][j]);}
System.out.println("");}*/
}



/*public String Getmap() {
	return this.wordmap;
	
}*/}
