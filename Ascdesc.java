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
public class Ascdesc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        char prevchar=' ';
        String temp="";
        for(int i=0;i<name.length();i++)
                if(prevchar!=name.charAt(i)){
                    temp=temp+name.charAt(i);
                 prevchar=name.charAt(i);      
        }
        System.out.println(temp);
    }
}
