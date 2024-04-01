package javaBasic.Task8;

import java.util.Scanner;

public class Q4Swap {
    
    public static void main(String[] args) {
        
    int a,b,x;
 
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the numbers to swap a & b :");
    
    a = sc.nextInt(); 
    b = sc.nextInt();

    System.out.println("Befor swapping numbers"+a+" "+b);

    //swaping 

    x = a;
    a = b;
    b = x;

    System.out.println("After swapping:"+a+" "+b);
    System.out.println();
    }

}
