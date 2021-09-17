import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortIntArrayTest {

    @Test
    void testGenerate1() {
        SortIntArray sia = new SortIntArray(20);
        SortIntArray sia2 = new SortIntArray(20);
        assertTrue(sia.get(0) != sia2.get(0));
        assertTrue(sia.get(19) != sia2.get(19));
    }

    @Test
    void testGenerate2() {
        SortIntArray sia = new SortIntArray(100);
        SortIntArray sia2 = new SortIntArray(100);
        assertTrue(sia.get(0) != sia2.get(0));
        assertTrue(sia.get(99) != sia2.get(99));
    }


    @Test
    void testSort() {
        SortIntArray sia =  new SortIntArray(100);
        sia.sort();

        assertTrue(sia.get(0) < sia.get(99));
    }

}