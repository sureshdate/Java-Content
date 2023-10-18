import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {
	public static void main(String[] args) throws SQLException {
		
		/*try{
			//step1.load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step2:create the connection
		String url="jdbc:mysql://localhost:3306/student_manage?verifyServerCertificate=false&useSSL=true";
		String username="root";
		String password ="GurudevDatta@123";
		
		Connection con= DriverManager.getConnection(url, username, password);
			
			Statement stmt=con.createStatement();
			String sql="insert into Students values(5,'sonali','8623818891','pune')";
			int result =stmt.executeUpdate(sql);
			if(result==1) {
				System.out.println("inserted succesfully");
			}
				else {
					System.out.println("pleas etry again");
				}
			}
			
		 catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}*/
		
		//by using prepareStatement
		
		
	}

}
