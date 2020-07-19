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
public class Daisylocknumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number;
        int second=0;
        int revnumber=0;
        System.out.println("Enter the first number");
        number=sc.nextInt();
        if(number==8888 ||number<0 || number==0000){
            System.out.println("Invalid Input");
        }
        else{
        while(number!=0){
        revnumber=revnumber*10+number%10;
        number=number/10;
        if(number%2==0 ){
               if(number==2){
            System.out.println("4");
                    }
        else if(number==4){
                        System.out.println("6");
        }
               else if(number==6){
                        System.out.println("8");
        }
               else if(number==8){
                        System.out.println("0");
        }
               else{
                   System.out.println("Invalid Input");
               }
    }
        else{
            if(number%2!=0 &&number==1){
                                        System.out.println("3");
            }
            else if(number==3){
                        System.out.println("5");
        }
            else if(number==5){
                        System.out.println("7");
        }
            else if(number==7){
                        System.out.println("9");
        }
            else if(number==9){
                        System.out.println("0");
        }
            else{
                System.out.println("Invalid Input");
            }
        }
        }
        System.out.println("The second number is:"+second);
        }
    }
    
}
