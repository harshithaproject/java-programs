/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author activ
 */
import java.util.*;
import java.text.DecimalFormat;
public class Carrepair {
    public static void main(String args[]){
       int oldprice=0;
       int soldprice=0;
       int repairprice=0;
       int costprice=0;
       float gain=0;
       float gainpercent=0;
       Scanner sc =new Scanner(System.in);
       System.out.println("Price of old scooter:");
       oldprice =sc.nextInt();
       System.out.println("The amount spent for repair:");
       repairprice =sc.nextInt();
       System.out.println("Sold price:");
       soldprice=sc.nextInt();
       costprice=oldprice+repairprice;
       gain=(soldprice-costprice);
       if(oldprice<=0 && soldprice<=0){
           System.out.println("Incorrect inputs");
       }
       else if(soldprice<=costprice){
           System.out.println("Unable to calculate the gain percentage");
       
      
       gainpercent=(gain*100)/costprice;
       //Decimal bd=new Decimal(gainpercent).setScale(2,RoundingMode.HALF_UP);
        //double bd1=bd.doubleValue();
        System.out.println("Gain percentage is"+(String.format("%.2f",gainpercent)));
       //System.out.println("gainpercentage" +gainpercent);
    
}
