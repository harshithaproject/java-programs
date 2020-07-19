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
public class Countvalley {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int countdown=0;
        int countup=0;
        int count=0;
        String s=sc.next();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='D'){
                count++;
            }else if(ch[i]=='U'){
                count--;
            }
            if(count == 0 && ch[i] == 'U'){
                count++;
            }
        }
        System.out.println(count);
        
    }
    
}
