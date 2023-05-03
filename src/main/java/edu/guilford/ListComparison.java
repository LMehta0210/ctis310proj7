package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListComparison 
{
    public static void main( String[] args )
    {
        final int MAX = 10000;
        //create array and linked list of computers
        ArrayList<Computer> computerArrayList = new ArrayList<Computer>();
        LinkedList<Computer> computerLinkedList = new LinkedList<Computer>();

        //time how long it takes to populate the array list
        long startTime = System.nanoTime();
        for(int i = 0; i < MAX; i++){
            computerArrayList.add(new Computer());
        }
        long endTime = System.nanoTime();
        System.out.println("Time to populate array list: " + String.format("%.2f", (endTime - startTime)/1.e6) + " milliseconds");

        //time how long it takes to populate the linked list
        startTime = System.nanoTime();
        for(int i = 0; i < MAX; i++){
            computerLinkedList.add(new Computer());
        }
        endTime = System.nanoTime();
        System.out.println("Time to populate linked list: " + String.format("%.2f", (endTime - startTime)/1.e6) + " milliseconds");

        //time how long it takes to sort the array list
        startTime = System.nanoTime();
        Collections.sort(computerArrayList);
        endTime = System.nanoTime();
        System.out.println("Time to sort array list: " + String.format("%.2f", (endTime - startTime)/1.e6) + " milliseconds");

        //time how long it takes to sort the linked list
        startTime = System.nanoTime();
        Collections.sort(computerLinkedList);
        endTime = System.nanoTime();
        System.out.println("Time to sort linked list: " + String.format("%.2f", (endTime - startTime)/1.e6) + " milliseconds");

        //time how long it takes to shuffle the array list
        startTime = System.nanoTime();
        Collections.shuffle(computerArrayList);
        endTime = System.nanoTime();
        System.out.println("Time to shuffle array list: " + String.format("%.2f", (endTime - startTime)/1.e6) + " milliseconds");

        //time how long it takes to shuffle the linked list
        startTime = System.nanoTime();
        Collections.shuffle(computerLinkedList);
        endTime = System.nanoTime();
        System.out.println("Time to shuffle linked list: " + String.format("%.2f", (endTime - startTime)/1.e6) + " milliseconds");

        //time 1,000,000 random gets from the array list
        startTime = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            computerArrayList.get((int)(Math.random()*MAX));
        }
        endTime = System.nanoTime();
        System.out.println("Time to get 1,000,000 random elements from array list: " + String.format("%.2f", (endTime - startTime)/1.e6) + " milliseconds");

        //time 1,000,000 random gets from the linked list
        startTime = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            computerLinkedList.get((int)(Math.random()*MAX));
        }
        endTime = System.nanoTime();
        System.out.println("Time to get 1,000,000 random elements from linked list: " + String.format("%.2f", (endTime - startTime)/1.e6) + " milliseconds");

        //time sequential gets in the array list
        startTime = System.nanoTime();
        for(int i = 0; i < MAX; i++){
            computerArrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to get all elements sequentially from array list: " + String.format("%.2f", (endTime - startTime)/1.e6) + " milliseconds");

        //time sequential gets in the linked list
        startTime = System.nanoTime();
        for(int i = 0; i < MAX; i++){
            computerLinkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to get all elements sequentially from linked list: " + String.format("%.2f", (endTime - startTime)/1.e6) + " milliseconds");

    }
}
