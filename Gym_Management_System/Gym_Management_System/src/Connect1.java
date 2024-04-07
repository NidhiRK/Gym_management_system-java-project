

import java.sql.*;

import javax.swing.JOptionPane;

public class Connect1 {
	Connection con=null;
	public static Connection connectDb()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_mgmt_system","root","123@nidhikushwaha");
		 return con;
		 }
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
	public static void main(String[] args) {
		Connect1 c= new Connect1();
		c.connectDb();
}


}
