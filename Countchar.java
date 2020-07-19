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
public class Countchar {
//    public boolean isAlpha(String str){
//        return str.matches("[a-zA-Z]+");
//    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        int count=name.length();
        char ch='\0';
        char character[]=name.toCharArray();
        for(int i=0;i<character.length;i++){
            ch=character[i];
        }
        if(!(ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.println("Invalid input");
        } 
        else{
        System.out.println(name+" has "+count+" characers ");
        }
    }
}
