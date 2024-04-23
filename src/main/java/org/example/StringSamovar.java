package org.example;

import java.util.Arrays;

public class StringSamovar implements StringList{
    private String[] myarray;
    private int size;
    public StringSamovar(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Не может быть отрицательным!");
        }

        this.myarray = new String[capacity];
        this.size = 0;
    }
    @Override
    public String add(String  item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть пустым");
        }

        myarray[size] = item;
        size++;
        return item;
    }
    @Override
    public String add(int index,String item) {
        if (index < 0 || size > index) {
            throw new IllegalArgumentException("Индекс не может быть меньше 0!");
        }

        if (item == null) {
            throw new IllegalArgumentException("Элемент не должен быть пустым!");
        }

        for (int i = size; i > index; i--) {
            myarray[i] = myarray[i - 1];
        }
        myarray[index] = item;
        size++;
        return item;
    }
    @Override
    public String set(int index, String item) {
        if (item == null) {
            throw new IllegalArgumentException("Значение не должно быть null!");
        }
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Индекс не может быть меньше 0!");
        }
        String replaced = myarray[index];
        myarray[index] = item;
        return replaced;
    }

    @Override
    public String remove(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Значение не должно быть null!");
        }
        for (int i = 0; i < size; i++) {
            if (item.equals(myarray[i])) {
                for (int j = i; j < size - 1; j++)
                    myarray[j] = myarray[j + 1];
            }
            size--;
        }
        return item;
    }

    @Override
    public String remove(int index)  {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Индекс не может быть меньше 0!");
        }
        String removeIndex = myarray[index];
        for (int i = index; i < size - 1; i++) {
            myarray[i] = myarray[i + 1];
        }
        size--;
        return removeIndex;
    }

    @Override
    public boolean contains(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Значение не должно быть null!");
        }
        for (int i = 0; i < size; i++) {
            if (myarray[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Значение не должно быть null!");
        }
        for (int i = 0; i < size; i++) {
            if (myarray[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Значение не должно быть null!");
        }
        for (int i = size - 1; i >= 0; i--) {
            if (myarray[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Индекс не может быть меньше 0!");
        }
        return myarray[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (otherList == null) {
            throw new IllegalArgumentException("Лист не может быть пустым!");
        }
        if (size != otherList.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!myarray[i].equals(otherList.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        Arrays.fill(myarray, null);
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(myarray, size);
    }



}


