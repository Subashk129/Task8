package javaBasic.Task8;

public class Q6Factorial {
    
    public static void main(String[] args) {
        
        int num= 6; //6*5*4*3*2*1

        int fact=1;

        for(int i=1; i<=num; i++){
            fact= fact*i;
        }

        System.out.println("Factortial: "+fact);
    }
}
