package TestListOperations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import com.titWeek4Day5GautamJUnit.ListOperations.LIstOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListOperationsTest {
    private List<Integer> testList;

    @BeforeEach
    void setUp() {
        testList = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        LIstOperations.addElement(testList, 5);
        assertEquals(1, LIstOperations.getSize(testList));
        assertTrue(testList.contains(5));

        LIstOperations.addElement(testList, 10);
        assertEquals(2, LIstOperations.getSize(testList));
        assertTrue(testList.contains(10));
    }

    @Test
    void testRemoveElement() {
        testList.add(5);
        testList.add(10);

        LIstOperations.removeElement(testList, 5);
        assertEquals(1, LIstOperations.getSize(testList));
        assertFalse(testList.contains(5));

        LIstOperations.removeElement(testList, 10);
        assertEquals(0, LIstOperations.getSize(testList));
    }

    @Test
    void testGetSize() {
        assertEquals(0, LIstOperations.getSize(testList));

        testList.add(1);
        testList.add(2);
        assertEquals(2, LIstOperations.getSize(testList));
    }
}


