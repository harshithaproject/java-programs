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
public class Sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rem=0;
        int sum=0;
        while(number!=0){
        rem=number%10;
        number=number/10;
         sum=sum+rem;
        }
        System.out.println(sum);
    }
}
