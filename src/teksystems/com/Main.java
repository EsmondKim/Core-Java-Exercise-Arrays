package teksystems.com;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        createArray123();
//        midPoint();
//        colorStrings();
//        intArray();
//        createIntArrayWithLoopVar();
//        createIntArrayWithLoopVarx2();
        notMiddle();
    } //main

    public static void createArray123() {
        int[] arr123 = {1, 2, 3};
        for (int i = 0; i < arr123.length; i++)
        System.out.println(arr123[i]);
    }//createArray123()

    public static void midPoint() {
        int[] intList = {13, 5, 7, 68, 2};
        int listLength = (intList.length);
        int index = listLength/2;
        System.out.println(intList[index]);
    }//midPoint()

    public static void colorStrings() {
        String[] arr = {"red", "green", "blue", "yellow"};
        System.out.println(arr.length);
        String[] arrClone = arr.clone();
        //sout-ing with Arrays.toString(targetArray);
        System.out.println(Arrays.toString(arrClone));
//      sout-ing with an enhanced for
        for (String s : arrClone) {
            System.out.println(s);
        }//enhanced for
    }//colorStrings()

    public static void intArray() {
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
//Printing out array to check values.
//        for (int answer  : arr) {
//            System.out.println(answer);
//        }//enhanced for
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        //throws out of bounds exception
//        System.out.println(arr[arr.length]);

        //out of bounds, improper assignment
        arr[5] = 600;
    }//intArray()

    public static void createIntArrayWithLoopVar() {
        int[] arr = new int[5];
        int num = 1;
        int i = 0;

        while(i <5) {
            arr[i] = num;
            i++;
            num++;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }//createIntArrayWithLoopVar()

    public static void createIntArrayWithLoopVarx2() {
        int[] arr = new int[5];
        int num = 1;
        int i = 0;

        while(i <5) {
            arr[i] = num*2;
            i++;
            num++;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }//createIntArrayWithLoopVarx2()

    public static void notMiddle() {
        String[] arr = {"print", "print", "NOT!", "print", "print"};
        for (String s : arr) {
            if(s != "NOT!" ) {
                System.out.println(s);
            }//nested if
        }//enhanced for
    }//notMiddle()

    public static void

}//Main
