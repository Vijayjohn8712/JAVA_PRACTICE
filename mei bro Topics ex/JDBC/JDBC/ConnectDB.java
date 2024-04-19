import java.sql.*;

class ConnectDB{
public static void main(String args[]) throws ClassNotFoundException{
    final String url="jdbc:mysql://localhost:3306/dbexample";
    final String user_Name="root";
    final String PassWord="@Mysqlvijay123";

    //Queries:
    final String selectQuer="select * from cliend";

    Class.forName("com.mysql.cj.jdbc.Driver");

    try (Connection con = DriverManager.getConnection(url, user_Name, PassWord)) {
        if(con!=null){
            System.out.println("connected");
        }

        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(selectQuer);
        while(rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("Gpa"));
        }
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}
}