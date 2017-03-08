package com.sdajava.generyki;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T> void printArray(T[] inArray){

        for(T value: inArray)
        {
            System.out.println(value);
        }
    }

    public static <E> void printList(List<E> myList){
        for (E value: myList)
        {
            System.out.println(value);
        }
    }


    public static void main(String[] args) {


        Integer[] intArray = {1,2,3,4,5,6};
        Double[] doubleArray = {1.2, 3.4,3.23, 45.23};
        Character[] charArray ={'c', 'z', 'e','s','c'};

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(2);
        intList.add(21);
        intList.add(32);

        List<String> stringList = new ArrayList<String>();

        stringList.add("czesc");
        stringList.add("romek");
        stringList.add("tomek");
        stringList.add("atomek");

        printList(stringList);

        Box b1 = new Box();

        b1.setT(new Integer(10));

        b1.setT(new String("test"));


    }

}
