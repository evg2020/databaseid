
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url ="jdbl:postgresql://localhost:5432/newsql";
        String user = "postgres";
        String pass = "password";
        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.getUserName());
            System.out.println(metaData.getURL());
        }

    }
}
