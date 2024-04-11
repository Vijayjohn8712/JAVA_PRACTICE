import java.sql.*;
public class ConnectDataBase {

		
public static void main(String[] args) throws ClassNotFoundException {
	final String url="jdbc:mysql://localhost:3306/dbexample";
	final String userName="root";
	final String passWord="@Mysqlvijay123";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	try {
		Connection con=DriverManager.getConnection(url,userName,passWord);
		if(con != null) {
			System.out.println("Connected");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from cliend");
		while(rs.next()) {
		System.out.println("Id: "+rs.getInt(1));
		System.out.println("Name: "+rs.getString(2));
		}
		con.close();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
