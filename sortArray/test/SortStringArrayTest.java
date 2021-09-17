import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortStringArrayTest {

    @Test
    void testGenerate1() {
        SortStringArray sta = new SortStringArray(20);
        SortStringArray sta2 = new SortStringArray(20);
        assertNotNull(sta.get(19));
    }

    @Test
    void testGenerate2() {
        SortStringArray sta = new SortStringArray(100);
        SortStringArray sta2 = new SortStringArray(100);
        assertNotNull(sta.get(99));
    }

    @Test
    void testGenerate3() {
        SortStringArray sta = new SortStringArray(300);
        SortStringArray sta2 = new SortStringArray(300);
        assertNotNull(sta.get(299));
    }


    @Test
    void testSort() {
        SortStringArray sta =  new SortStringArray(100);

        sta.sort();

        assertTrue(sta.get(0).compareTo(sta.get(1)) < 0);
        assertTrue(sta.get(98).compareTo(sta.get(99)) < 0);
    }

}