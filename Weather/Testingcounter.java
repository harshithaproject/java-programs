/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weather;
import java.util.*;
/**
 *
 * @author activ
 */
public class Testingcounter {
     static int tokenNo;
     int counterno;
     String serviceType;
        public Testingcounter(String serviceType){
            this.serviceType=serviceType;
            tokenNo++;
            System.out.println("Your Token number is:"+tokenNo);
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the service type for first customer:");
            String s=sc.next();
            Testingcounter t1=new Testingcounter(s);
                   System.out.println("Enter the service type for next customer:");
                    String s1=sc.next();
                   Testingcounter t2=new Testingcounter(s1);
       
    }
}
