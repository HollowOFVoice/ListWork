package org.example;

public interface IntegerList {

    Integer add(Integer item);


    Integer add(Integer item, int index);


    Integer set(int index, Integer item);


    Integer remove(Integer item) throws Exception;

    Integer remove (int index) throws Exception;
    boolean contains (Integer item);

    int indexOf(Integer item);

    int lastIndexOf(Integer item);

    Integer get (int index);
    boolean equals (IntegerList otherList);
    int size();
    boolean isEmpty();
    void clear();
    Integer[] toArray();

}
