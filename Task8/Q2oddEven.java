package javaBasic.Task8;

import java.util.Scanner;

public class Q2oddEven {

    public static void main(String[] args) {
        
    int num;
 
    System.out.println("Enter the Number to check:");
    Scanner x = new Scanner(System.in);

    num = x.nextInt();

    if(num %2 == 0){

        System.out.println("This is Even Number");
    }
    else{

        System.out.println("This is Odd Number");
    }
}
}
