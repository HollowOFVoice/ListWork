import org.example.IntegerSamovar;
import org.example.StringSamovar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class IntegerListTest {
    @Test
    public void add()  {
        IntegerSamovar list = new IntegerSamovar(5);
        assertEquals(list.add(3),3 );
        }


    @Test
    public void remove()  {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);


        assertEquals( list.remove(1),2);

    }


    @Test
    public void indexOf()  {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(list.indexOf(2),1 );

    }


    @Test
    public void lastIndexOf() {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);

        assertEquals( list.lastIndexOf(2),3);

    }

    @Test
    public void set() {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(9);
        assertEquals(list.set(1,2),2);

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

        assertEquals( list.size(),3);
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

    @Test
    public  void toArray()  {
        IntegerSamovar list = new IntegerSamovar(5);
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(list.size(),3);
    }

    @Test
    public void exT(){
        IntegerSamovar samovar = new IntegerSamovar(5);
        assertThrows(IllegalArgumentException.class,()->samovar.set(10,-1),"Что-то типо не правильно написал");
    }

}