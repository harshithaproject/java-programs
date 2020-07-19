/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author activ
 */
public class Cardetails {
    public static void main(String args[]){
    String carname=null;
    int carno;
    double price;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the car name:");
    carname =sc.nextLine();
    System.out.println("Enter the car no:");
    carno =sc.nextInt();
    System.out.println("Enter the price:");
    price =sc.nextDouble();
    
    System.out.println("Carname:"+carname);
    System.out.println("Carno:" +carno);
    DecimalFormat df =new DecimalFormat("0.00");
    System.out.println("Carprice:"+df.format(price)+" rs only");
}
}
