/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Write a program to find if the given numbers are Amicable.
For two numbers to be amicable, the sum of the proper factors of first number is equal to the 
second number and sum of the proper factors of second number is equal to the first number.

For e.g., the factors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 and there sum is 284. Where as for 284 the factors are 1, 2, 4, 71, 142 and there is 220. So the numbers 220 and 284 are amicable.
Note that although the number is factor of itself, we should not consider it while summing up.
 */
import java.util.*;
/**
 *
 * @author activ
 */
public class Amicable {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<number1-1;i++){
            if(number1%i==0){
//                System.out.println(i);
                sum1+=i;
            }
        }
        for(int i=1;i<number2-1;i++){
            if(number2%i==0){
//                System.out.println(i);
                sum2+=i;
            }
        }
        if(sum1==number2 && sum2==number1){
            System.out.println("Amicable");
        }else{
            System.out.println("Not Amicable");
        }
    }
}
