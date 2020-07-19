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
public class Lcm {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int lcm=0;
       lcm=(n1>n2)?n1:n2;
       while(true){
           if((lcm%n1==0)&&(lcm%n2==0)){
               System.out.println(lcm);
               break;
           }
           ++lcm;
       }
   }
            
}
