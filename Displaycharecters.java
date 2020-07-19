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
public class Displaycharecters {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int digit1,digit2,digit3,digit4;
        char letter1,letter2,letter3,letter4;
        System.out.println("Enter the digits:");
        digit1=sc.nextInt();
        digit2=sc.nextInt();
        digit3=sc.nextInt();
        digit4=sc.nextInt();

        
        //for(int i=1;i<=5;i++){
        //digit=digit+i;
        //System.out.println(digit1);
        //System.out.println(digit2);
        //System.out.println(digit3);
        //System.out.println(digit4);
        letter1=((char)digit1);
        letter2=((char)digit2);
        letter3=((char)digit3);
        letter4=((char)digit4);
        System.out.println(digit1+"-"+letter1);
        System.out.println(digit2+"-"+letter2);
        System.out.println(digit3+"-"+letter3);
        System.out.println(digit4+"-"+letter4);

            
        }
    }
    
    
}
