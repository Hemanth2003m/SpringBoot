import java.sql.*;

public class DemoJDBC {
    public static void main(String... args) throws Exception  {

        /*
import package
load and register
create connection
create statement
execute statement
process the results
close

*/

        String url = "jdbc:mysql://localhost:3306/application_user_logins";
        String uname = "root";
        String pass = "7776";
        String sql = "SELECT * FROM users";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected " + con);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
//        rs.next();                    //this code is useful to check weather that there is next column or not
//        System.out.println(rs.getString("username"));

        while(rs.next()){
            System.out.print(rs.getInt(1)+ ". ");
            System.out.print(rs.getString(2) + " - ");
            System.out.print(rs.getString(3)+ " - ");
            System.out.print(rs.getString(4)+ " - ");
            System.out.print(rs.getString(5)+ " - ");
            System.out.println(rs.getString(6));
           // System.out.print(rs.getString(7));

        }
        con.close();

    }
}
