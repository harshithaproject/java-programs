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
public class Sumofseries2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
      int nth=sc.nextInt();
        int result=0;
        int product=1;
        int sum=0;
//        for(int i=0;i<nth;i++){
//        sum=sum+(first*(first+1)*(first+2));
//        first++;
//        System.out.println(sum);
//        }
        
        for(int i=0;i<nth;i++){
           result=first+i;
           product=product*result;
           sum=sum+product;
           first++;      
           System.out.println(product);
           System.out.println(sum);
//       System.out.println(result);
      }
        
           
            
        }
        }
        
    }
    
}
