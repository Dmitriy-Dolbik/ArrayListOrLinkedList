package org.example;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListOrLinkedList
{
    private static int sizeOfList = 1000000;
    public static void main(String[] args)
    {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        /*System.out.println("LinkedList");
        measureTimeAddToStart(linkedList);
        System.out.println("ArrayList");
        measureTimeAddToStart(arrayList);*/

        /*System.out.println("LinkedList");
        measureTimeAddToEnd(linkedList);
        System.out.println("ArrayList");
        measureTimeAddToEnd(arrayList);*/

        fillList(linkedList);
        fillList(arrayList);

        /*System.out.println("LinkedList");
        measureTimeAddToMiddle(linkedList);
        System.out.println("ArrayList");
        measureTimeAddToMiddle(arrayList);*/

        System.out.println("LinkedList");
        measureTimeDeleteFromEnd(linkedList);
        System.out.println("ArrayList");
        measureTimeDeleteFromEnd(arrayList);

        /*System.out.println("LinkedList");
        measureTimeDeleteFromMiddle(linkedList);
        System.out.println("ArrayList");
        measureTimeDeleteFromMiddle(arrayList);*/
        /*System.out.println("LinkedList");
        measureTimeDeleteFromStart(linkedList);
        System.out.println("ArrayList");
        measureTimeDeleteFromStart(arrayList);*/

        System.out.println(linkedList.size());
        System.out.println(arrayList.size());
    }

    private static void fillList(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < sizeOfList; i++)
        {
            list.add(i);
        }
        long end = System.currentTimeMillis();
    }

    private static void measureTimeDeleteFromMiddle(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < sizeOfList/2; i++) {
            int index = (list.size()-i)/2;
            list.remove(index);
        }
        long end = System.currentTimeMillis();
        System.out.println("Delete from middle: " + (end - start));
    }
    private static void measureTimeDeleteFromStart(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < sizeOfList/2; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();
        System.out.println("Delete from start: " + (end - start));
    }
    private static void measureTimeDeleteFromEnd(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < sizeOfList/2; i++) {
            list.remove(sizeOfList-i-1);
        }
        long end = System.currentTimeMillis();
        System.out.println("Delete from the end: " + (end - start));
    }
    private static void measureTimeAddToStart(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < sizeOfList; i++) {
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Add to start: " + (end - start));
    }
    private static void measureTimeAddToMiddle(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < sizeOfList; i++) {
            list.add(i/2,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Add to middle: " + (end - start));
    }
    private static void measureTimeAddToEnd(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < sizeOfList; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Add to End: " + (end - start));
    }

}

