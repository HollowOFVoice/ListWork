
import org.example.IntegerSamovar;
import org.example.StringSamovar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringLIstTest {

    @Test
    public void add()  {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("3", list.get(2));
    }
    @Test
    public void remove()  {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals("2", list.remove(1));
        assertEquals(2, list.size());
        assertFalse(list.contains("2"));
    }

    @Test
    public void indexOf()  {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals(1, list.indexOf("2"));
        assertEquals(-1, list.indexOf("4"));
    }
    @Test
    public void lastIndexOf() {
        StringSamovar list = new StringSamovar(10);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("6");
        list.add("9");

        assertEquals(3, list.lastIndexOf("5"));
        assertEquals(-1, list.lastIndexOf("10"));
    }
    @Test
    public void set() {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals("2", list.set(1, "5"));
        assertEquals("5", list.get(1));
    }


    @Test
    public  void testEquals() {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertTrue(list.equals(list));
    }

    @Test
    public  void contains() {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertTrue(list.contains("2"));
        assertFalse(list.contains("4"));
    }

    @Test
    public void size() {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals(3, list.size());
    }

    @Test
    public  void clear()  {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");

        list.clear();

        assertTrue(list.isEmpty());
    }
}
