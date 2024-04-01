package javaBasic.Task8;

public class Q5Prime {

    public static void main(String[] args) {
        
        int number = 18; // 18 is Example number
        System.out.println("Your given Number is " +number);
        int count = 0; 
        for(int i=1;i<=number;i++){

            if(number%i==0){
                count++;
            }
        }
         if(count==2){

            System.out.println("The Given number" +number+ " is prime");
         }
         else{

            System.out.println("The Given number" +number+ " is Not prime");
         }   
        
    }
    
}
