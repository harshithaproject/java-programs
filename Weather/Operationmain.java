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
public class Operationmain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Exceptionoperation e=new Exceptionoperation();
        System.out.println("Enter no1:");
        e.setNumber1(sc.nextInt());
        System.out.println("Enter no2:");
        e.setNumber2(sc.nextInt());
        System.out.println("Enter the operation");
        String op=sc.next();
        e.setOperation(op.charAt(0));
        int res;
        res=e.calculation();
        System.out.println(res);
    }
    
}
