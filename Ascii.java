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
public class Ascii {
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int a=sc.nextInt();
        int ascii=(int)c;
        int ascii1=(int)c;
        if(c>='A' && c<='Z'){
        char ch=(char)((ascii-a-65)%26+65);
        System.out.println(ch);
        }
        else if(c>='a' && c<='z'){
         char ch1=(char)((ascii1-a-97)%26+97);
        System.out.println(ch1);
        }
    }
}
