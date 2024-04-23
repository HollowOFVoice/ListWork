package org.example;

import java.util.Arrays;

public class IntegerSamovar implements IntegerList {
    private Integer[] array;
    private int size;

    private void grow() {
        array = Arrays.copyOf(array, array.length + array.length / 2);
    }

    private void swapElements(int[] arr, int left, int right) {
        Integer temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private int partition(int[] arr, int begin, int end) {
        Integer pivot = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swapElements(arr, i, j);
            }
        }
        swapElements(arr, i + 1, end);
        return i + 1;
    }

    public boolean contains(Integer[] arr, int element) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (element == arr[mid]) {
                return true;
            }
            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public IntegerSamovar(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Не может быть отрицательным!");
        }

        this.array = new Integer[capacity];
        this.size = 0;
    }

    @Override
    public Integer add(Integer item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть пустым");
        }
        if (size == array.length) {
            grow();
        }
        array[size] = item;
        size++;
        return item;
    }

    private void ex(Integer item,int index){


        if (item == null) {
            throw new IllegalArgumentException("Элемент не должен быть пустым!");
        }
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Индекс не может быть меньше 0!");
        }

    }
    private void ex1(Integer item){


        if (item == null) {
            throw new IllegalArgumentException("Элемент не должен быть пустым!");
        }


    }
    private void ex2(int index){



        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Индекс не может быть меньше 0!");
        }

    }

    @Override
    public Integer add(Integer item, int index) {

        ex(index,item);
        if (size == array.length) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        size++;
        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        ex(index,item);
        Integer replaced = array[index];
        array[index] = item;
        return replaced;
    }

    @Override
    public Integer remove(Integer item) {
        ex1(item);
        for (int i = 0; i < size; i++) {
            if (item.equals(array[i])) {
                for (int j = i; j < size - 1; j++)
                    array[j] = array[j + 1];
            }
            size--;
        }
        return item;
    }



    @Override
    public Integer remove(int index)  {
        ex2(index);
        Integer removeIndex = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removeIndex;
    }


    @Override
    public boolean contains(Integer item) {
        ex1(item);
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Integer item) {
       ex1(item);
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        ex1(item);
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public Integer get(int index) {
        ex2(index);
        return array[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
        if (otherList == null) {
            throw new IllegalArgumentException("Лист не может быть пустым!");
        }
        if (size != otherList.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!array[i].equals(otherList.get(i))) {
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
        Arrays.fill(array, null);
        size = 0;
    }

    @Override
    public Integer[] toArray() {
        return Arrays.copyOf(array, size);
    }



}
