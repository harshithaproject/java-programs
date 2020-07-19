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
public class Age {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age==0 || age<0){
            System.out.println("Invalid age");
            System.exit(0);
        }
        int coins=age*age*age;
        System.out.println("Meenu gets "+coins+" coins");
    }
}
