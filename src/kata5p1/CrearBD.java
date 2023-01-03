package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;

public class CrearBD {

    public static void createNewDataBase(String url) {
        try (Connection conn = DriverManager.getConnection(url)){
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("El driver es " + meta.getDriverName());
                System.out.println("Se ha creado una nueva BD.");
            }
        } catch (SQLException e ) {
                System.out.println(e.getMessage());
        }
    }
}