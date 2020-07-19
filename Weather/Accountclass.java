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
public class Accountclass {
    private long accountNumber;
    private double balanceAmount;
    public Accountclass(long accountNumber,double balanceAmount){
        this.accountNumber=accountNumber;
        this.balanceAmount=balanceAmount;
    }
    public double withdraw(double withdrawamt){
        if(balanceAmount>withdrawamt){
            balanceAmount=balanceAmount-withdrawamt;
            System.out.println("Available balance is:"+balanceAmount);
            return 1;
        }
        else {
            System.out.println("Insufficient Balance");
            System.out.println("Available balance is:"+balanceAmount);
            return -1;
        }
       
    }
    public void deposit(double depositAmount){
        balanceAmount=balanceAmount+depositAmount;
        System.out.println("Available balance is:"+balanceAmount);
    }
    
    public double getBalanceAmount(double balanceAmount){
        return balanceAmount;
    }
}
