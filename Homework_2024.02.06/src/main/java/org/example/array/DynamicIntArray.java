package org.example.array;

import java.util.Arrays;

public class DynamicIntArray {

    private int length;

    private int capacity;

    private int[] arr;

    public static final int DEFAULT_CAPACITY = 8;
    private int PERCENT_CHANGE = 50 ;

    public DynamicIntArray() {
        this.arr = new int[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
        this.length = DEFAULT_CAPACITY;;
    }

    public DynamicIntArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.length = capacity;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getArr() {
        return arr;
    }

    public void fill() {
        int inc = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inc;
            inc +=2;
        }
    }

    public void add(int element) {
        int[] arr1;
        if (length == capacity){
            arr1 = new int[capacity + (capacity * PERCENT_CHANGE / 100)];
        }
        else {
            arr1 = new int[capacity];
        }
        for (int i = 0; i < length; i++) {
            arr1[i] = arr[i];
        }
        arr1[length] = element;
        arr = arr1;
        capacity = arr.length;
        length++;
    }

    public void add(int[] elements) {
        int[] arr1;

        if (length + elements.length >= capacity){
            arr1 = new int[capacity + elements.length + (capacity * PERCENT_CHANGE / 100)];
        }
        else {
            arr1 = new int[capacity];
        }

        for (int i = 0; i < length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < elements.length; i++) {
            arr1[length + i] = elements[i];
        }
        arr = arr1;
        capacity = arr.length;
        length += elements.length;
    }

    public void insert(int index, int element) {
        int[] arr1;
        if (length == capacity) {
            arr1 = new int[capacity + (capacity * PERCENT_CHANGE / 100)];

        } else {
            arr1 = new int[capacity];
            for (int i = 0; i < index; i++) {
                arr1[i] = this.arr[i];
            }
            arr1[index] = element;

            for (int i = index + 1; i < length + 1; i++) {
                arr1[i] = arr[i - 1];
            }
            arr = arr1;
            capacity = arr.length;
            length++;
        }
    }

    public void delete(int index) {
        int[] arr1 = new int[capacity - 1];
        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }
        for (int i = index + 1; i < capacity; i++) {
            arr1[i - 1] = arr[i];
        }
        arr = arr1;
        capacity = arr.length;
        length--;
    }

    public void get(int index){
        for (int i = 0; i < capacity; i++) {
            if (i == index){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}



