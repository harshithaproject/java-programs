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
public class Repeating {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count[]=new int[256];
        char charstr[]=new char[str.length()];
        for (int i = 0; i<str.length(); i++) 
            count[str.charAt(i)]++; 
        for(int i=0;i<str.length();i++){
           charstr[i] = str.charAt(i);
           int find=0;
        for(int j=0;j<=i;j++){
            if(str.charAt(i)==charstr[j]){
                find++;
            }
        }
        if (find == 1)  
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);         
//        System.out.println(find);
        }
        for(int i: count){
            System.out.print(i);
        }
        Arrays.sort(count);
        System.out.println(" Minimum number = " + count[0]);
//        System.out.print(count);
        
        }
    
}
