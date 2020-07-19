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
public class Late {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int number=sc.nextInt();
        String time[]=new String[number];
        for(int i=0;i<time.length;i++){
            time[i]=sc.next();
        }
        for(int i=0;i<time.length;i++){
            if(time[i].charAt(0)>='9'){
                if(time[i].charAt(2)>='3'){
                    if(time[i].charAt(3)>'0'){
                        
                    
                count++;
                    }  
//                        System.out.println(count);
                }
                
            }
            else if(time[i].charAt(0)<='9'){
                System.out.println("All employee are on time.");
                System.exit(0);
            }
        }
        System.out.println(count+" emoloyees are late");
    }
}
