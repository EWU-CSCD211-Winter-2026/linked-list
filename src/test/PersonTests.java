package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import model.Person;

public class PersonTests {

    @Test
    public void testComparable() {
        // Arrange
        Person p = new Person("Alice", 20);

        // Act
        boolean isComparable = p instanceof Comparable;

        // Assert
        assertTrue(isComparable);

    }

}
