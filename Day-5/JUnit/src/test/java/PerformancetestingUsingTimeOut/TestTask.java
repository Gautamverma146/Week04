package PerformancetestingUsingTimeOut;

import com.titWeek4Day5GautamJUnit.PerformanceTestingUsingTimeOut.Task;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

public class TestTask {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fails if execution > 2 sec
    void testLongRunningTask() throws InterruptedException {
        assertEquals("Task Completed", Task.longRunningTask());
    }
}

