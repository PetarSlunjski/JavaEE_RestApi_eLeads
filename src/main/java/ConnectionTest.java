import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres/";
        String user = "postgres";
        String pass = "postgres";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Dela!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
