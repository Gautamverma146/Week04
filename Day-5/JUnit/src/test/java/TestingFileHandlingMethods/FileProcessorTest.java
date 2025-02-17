package TestingFileHandlingMethods;

import com.titWeek4Day5GautamJUnit.FileHandlingMethods.FileProcessor;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    void setUp() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE)); // Clean up before each test
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, File Handling!";

        // Write content to file
        FileProcessor.writeToFile(TEST_FILE, content);

        // Check if file exists
        assertTrue(Files.exists(Path.of(TEST_FILE)));

        // Read content from file
        String readContent = FileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("non_existent_file.txt"));
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE)); // Clean up after each test
    }
}

