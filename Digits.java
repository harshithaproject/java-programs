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
public class Digits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        if(number==0){
            count=1;
        }
        
            while(number>0){
                count+=1;
                number=number/10;
            }
    
    System.out.println(count);
}
}
