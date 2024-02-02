package WhiskLV1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.sql.*;

//

public class WPR {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/whiskycastle","root","Zxczxc123123@");
			Statement stat=con.createStatement();
			System.out.println("insert");
			String sql="Insert into castleID values(01)";
			stat.execute(sql);
		}catch(Exception e) {
			System.out.println(e);
		}
		/*
	   ArrayList<Whisky> whiskies;
	   Options option = new Options();
	   whiskies=option.archivist();
	   option.getWhisky(2);
	   option.SortWhiskies(whiskies);
	   */
	}
}
   
