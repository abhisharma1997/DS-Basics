package com.learning.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackBasicOp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 5 elements to insert in stack:");

        //Insertion
        for(int i = 0 ; i<5;i++){
            stack.push(scan.nextInt());
        }

        //Traversing
        stack.forEach(x->System.out.print(x+" ")); //List all the elements
        System.out.println("");
        System.out.println(stack.peek()); //List topmost  element
        System.out.println("");

        //Search
        System.out.println("Please enter  element to search in stack:");
        int search = scan.nextInt();
        System.out.println(stack.search(search)); // Returns position of element from top of stack starting from 1
        System.out.println(stack.contains(search)); // Returns true if value is present else returns false

        //Deletion
        System.out.println("Element got removed : "+stack.pop()); //Deletes the Topmost element
        stack.forEach(x->System.out.print(x+" "));


    }
}
