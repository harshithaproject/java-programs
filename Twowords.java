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
public class Twowords {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String s1 ="";
        String s2 ="";
        for(int i=0;i<a.length();i++){
            if(!s1.contains(Character.toString(a.charAt(i)))){
                s1=s1+Character.toString(a.charAt(i));
            }
        }
        for(int i=0;i<b.length();i++){
            if(!s2.contains(Character.toString(b.charAt(i)))){
                s2=s2+Character.toString(b.charAt(i));
            }
        }
//        char[] ch1=s1.toLowercase().toCharArray();
//        char[] ch2=s2.toCharArray();
        char[] ch1=s1.toLowerCase().toCharArray();
        char[] ch2=s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
         String str1=Arrays.toString(ch1);
         String str2=Arrays.toString(ch2);
         
         System.out.println(str1);
         System.out.println(str2);
        if(str1.equals(str2)){
            System.out.println("Same");   
        }
        else{
            System.out.println("DIFRENTF");
            
    }
    }  
}
