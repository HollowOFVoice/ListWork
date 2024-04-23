import org.example.IntegerSamovar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class IntegerListTest {
    @Test
    public void add()  {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);
            assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(3), list.get(2));
        }


    @Test
    public void remove()  {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(Integer.valueOf(2), list.remove(1));
        assertEquals(2, list.size());
        assertFalse(list.contains(2));
    }


    @Test
    public void indexOf()  {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, list.indexOf(2));
        assertEquals(-1, list.indexOf(4));
    }


    @Test
    public void lastIndexOf() {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);

        assertEquals(3, list.lastIndexOf(2));
        assertEquals(-1, list.lastIndexOf(5));
    }

    @Test
    public void set() {
        IntegerSamovar list = new IntegerSamovar(3);
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(Integer.valueOf(2), list.set(1, 5));
        assertEquals(Integer.valueOf(5), list.get(1));
    }

    @Test
    public  void testEquals() {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);

        assertTrue(list.equals(list));
    }

    @Test
    public  void contains() {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);

        assertTrue(list.contains(2));
        assertFalse(list.contains(4));
    }

    @Test
    public void size() {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.size());
    }


    @Test
    public  void clear()  {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);

        list.clear();

        assertTrue(list.isEmpty());
    }
}