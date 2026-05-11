import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Main{
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/ri_db";
        String user = "test";
        String password = "test123";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement st = conn.createStatement();

            String CreateTable = "CREATE TABLE IF NOT EXISTS student("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(50))";

            st.executeUpdate(CreateTable);

            System.out.println("Table created successfully");
            conn.close();
            
            // INSERT into Table
            String insert1="INSERT INTO student VALUES(1,"SAMI")";
            st.executeUpdate(insert1);
            
            String insert2="INSERT INTO student VALUES(2,"Mihir")";
            st.executeUpdate(insert2);
            
            

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}