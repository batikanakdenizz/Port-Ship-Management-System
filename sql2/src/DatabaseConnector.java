import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    // Local development defaults; the password always comes from the environment.
    // Set PORTSHIP_DB_URL / PORTSHIP_DB_USER / PORTSHIP_DB_PASSWORD before running.
    private static final String URL = System.getenv().getOrDefault(
            "PORTSHIP_DB_URL", "jdbc:mysql://localhost:3306/portshipsecure");

    private static final String USER = System.getenv().getOrDefault("PORTSHIP_DB_USER", "root");

    private static final String PASSWORD = System.getenv().getOrDefault("PORTSHIP_DB_PASSWORD", "");

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
