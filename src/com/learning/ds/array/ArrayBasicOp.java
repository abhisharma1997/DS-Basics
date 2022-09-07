package com.learning.ds.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasicOp {

    public static void main(String[] args) {
        int[] a = new int[5];

        //Insertion
        for(int i = 1 ;i<=5 ;i++){
            a[i-1]=i;
        }
        //Traversing
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println("");

        //Searching (Using Stream)
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number to Search in array");
        int num = s.nextInt();
        Arrays.stream(a).sequential().filter(b->b==num).forEach((n)->System.out.println(n+" Element Found"));

        //Searching without Stream
        for(int i : a){
            if(i==num){
                System.out.println("Element Found :"+num);
                break;
            }
        }

        //Deletion
        System.out.println("Enter Number to Delete in array");
        int num1 = s.nextInt();
        int loc=0;
        boolean flag=false;
        for(int i = 0 ;i< a.length;i++){
            if(a[i]==num1){
                loc=i;
                flag=true;
                break;
            }

        }
        if(flag){
            for(int j = loc+1;j<a.length;j++){
                a[j-1]=a[j];
            }

        }
        System.out.println("Array After Deletion");
        for(int i = 0 ; i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");



    }
}
