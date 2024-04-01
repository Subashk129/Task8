package javaBasic.Task8;

import java.util.Scanner;

public class Q9Senior {
    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter your Age:");// AGE FROM USER

        int age = scanner.nextInt();

        if (age>=60){

            System.out.println("your a senior citizen");
        }
        else {

            System.out.println("your Not senior citizen"); 
        }
    }
}
