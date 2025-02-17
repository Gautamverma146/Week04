package TestingBeforeEachAndAfterEachAnnotations;

import static org.junit.jupiter.api.Assertions.*;

import com.titWeek4Day5GautamJUnit.BeforeEachAndAfterEachAnnotations.DatabaseConnection;
import org.junit.jupiter.api.*;


public class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
        assertTrue(dbConnection.isConnected(), "Database should be connected before each test.");
    }

    @Test
    void testDatabaseConnectionIsActive() {
        assertTrue(dbConnection.isConnected(), "Database should be connected during the test.");
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Database should be disconnected after each test.");
    }
}

