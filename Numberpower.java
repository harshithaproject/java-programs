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
public class Numberpower {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int power=number;
        if(number<0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("Enter the digit");
        int digit=sc.nextInt();
        if(digit<0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        for(int i=1;i<digit;i++){
            power=power*number;
        }
        System.out.println(power);
    }
}
