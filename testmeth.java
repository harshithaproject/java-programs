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
public class testmeth
{

public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter the string: ");
 String name=sc.next();
 String temp="";
 int count=0;
 int x=name.length()/2;
 char ch[]=name.toCharArray();
 for(int i=0;i<ch.length;i++){
     if(!(ch[i]>='a' && ch[i]<='z')&& !(ch[i]>='A' && ch[i]<='Z')){
         temp=temp+ch[i];
         count++;
     }
      
 }
 if(name.length()<3){
     System.out.println("The string "+name+" is too short");
     System.exit(0);
    
 }
 else if(count>0){
     System.out.println("The string should not have "+temp);
 }
        else{
 System.out.println("Middle characters: ");
 for(int i=0;i<ch.length;i++){
    
 }
}
}
}