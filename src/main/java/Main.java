


import java.sql.*;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/newsql";
        String user = "postgres";
        String pass = "password";
        Connection conn = null;


        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery("select * from car");

            while (res.next()){
                System.out.println("#"+ res.getInt("id")+
                        " " + res.getString(2)+
                " " + res.getInt(3));

            }

        } catch (Exception e) {
//    e.printStackTrace();
            System.err.println("Не удалось ");
        } finally {
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
