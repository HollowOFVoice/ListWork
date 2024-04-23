
import org.example.IntegerSamovar;
import org.example.StringSamovar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringLIstTest {

    @Test
    public void add()  {
        StringSamovar list = new StringSamovar(5);

        assertEquals(list.add("1"), "1");
    }
    @Test
    public void remove()  {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals( list.remove(1),"2");
    }

    @Test
    public void indexOf()  {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals(list.indexOf("2"),1 );

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

        assertEquals( list.lastIndexOf("5"),3);

    }
    @Test
    public void set() {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals(list.set(1, "5"),"2");

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

        assertEquals( list.size(),3);
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
    @Test
    public  void toArray()  {
        StringSamovar list = new StringSamovar(5);
        list.add("1");
        list.add("2");
        list.add("3");



        assertEquals(list.size(),3);
    }

    @Test
    public void exT(){
StringSamovar samovar = new StringSamovar(5);
assertThrows(IllegalArgumentException.class,()->samovar.set(10,null),"Что-то типо не правильно написал");
    }
}
