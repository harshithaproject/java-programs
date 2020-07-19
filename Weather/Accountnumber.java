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
public class Accountnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account number:");
        long accno=sc.nextLong();
        System.out.println("Enter the available amount in the account:");
        double availamount=sc.nextDouble();
        Accountclass ac1=new Accountclass(accno,availamount);
        System.out.println("Enter the amount to be deposited:");
        double deposit=sc.nextDouble();
        ac1.deposit(deposit);
        System.out.println("Enter the amount to be withdrawn:");
        double withdraw=sc.nextDouble();
        ac1.withdraw(withdraw);

    }
    
}
