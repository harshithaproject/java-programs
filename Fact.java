/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author activ
 */
public class Fact {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        int sum=0;
        int fact=1;
      for(int i=1;i<=num;i++){
            fact=fact*i;
            sum=sum+fact;
      }
        System.out.println("Factorial:"+fact);
//                System.out.println("Factorial:"+sum);

      
    }
}
