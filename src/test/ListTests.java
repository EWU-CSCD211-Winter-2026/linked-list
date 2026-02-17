
package test;

import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;



import list.*;

public class ListTests {

    @Test
    public void TestListConstructor() {
        // Arrange
        LinkedList<Integer> intList = new LinkedList<>();
        
        // Act

        // Assert
        assertNotNull(intList);
        
    }

    @Test
    public void testSizeEmptyList() {
        // Arrange
        LinkedList<String> strList = new LinkedList<String>();

        // Act

        // Assert
        assertEquals(0, strList.size());

    }

    @Test
    public void testIsEmptyEmptyList() {
        // Arrange
        LinkedList<Boolean> booleanList = new LinkedList<>();

        // Act

        // Assert
        assertEquals(true, booleanList.isEmpty());
    }

    @Test
    public void testSizeIncreaseAdd() {
        // Arrange
        LinkedList<Double> doubleList = new LinkedList<>();
        int size = doubleList.size();

        // Act
        doubleList.add(0.123);

        // Assert
        assertEquals(size + 1, doubleList.size());
    }

    @Test
    public void testAddElement() {
        // Arrange
        LinkedList<String> strList = new LinkedList<>();

        // Act
        strList.add("A");

        // Assert
        assertEquals("[A] size = 1, head: null, tail: A", strList.toString());

    }

    @Test
    public void testAddTwoElements() {
        // Arrange
        LinkedList<String> strList = new LinkedList<>();

        // Act
        strList.add("A");
        strList.add("B");

        // Assert
        assertEquals("[A, B] size = 2, head: null, tail: B", strList.toString());

    }

    @Test 
    public void testGet() {
        // Arrange
        List<Boolean> boolList = new LinkedList<Boolean>();
        boolList.add(true);
        boolList.add(false);
        
        // Act
        boolean result = boolList.get(1);

        // Assert
        assertEquals(false, result);
    }

    @Test 
    public void testOutsideBounds() {
        // Arrange
        List<Boolean> blist = new LinkedList<>();
        blist.add(true);
        blist.add(true);
        blist.add(true);

        // Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {

            // Act
            Boolean res = blist.get(10000);
			
		});

    }

}
