package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class TestSetCollection {

    @Test
    public void testCreateSet() {
        SetCollection test2 = new SetCollection();
        Set<Object> resultSet = test2.createSet();
        
        // Assert that the set contains exactly 4 elements (123, "ram", 3.4, null)
        assertEquals(4, resultSet.size(), "Set should have 4 unique elements");

        // Assert that the set contains the correct elements
        assertTrue(resultSet.contains(123), "Set should contain 123");
        assertTrue(resultSet.contains("ram"), "Set should contain 'ram'");
        assertTrue(resultSet.contains(3.4), "Set should contain 3.4");
        assertTrue(resultSet.contains(null), "Set should contain null");
        
        // Since LinkedHashSet maintains insertion order, we can assert the order as well
        Object[] expectedOrder = {123, "ram", 3.4, null};
        assertEquals(expectedOrder, resultSet.toArray(), "Set should maintain insertion order");
    }
}
