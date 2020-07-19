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
public class CinemaTicket {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no_of_tickets=0;
        double totalcost=0;
        String circle;
        String yes_no;
        System.out.println("Enter the no of tickets:");
        no_of_tickets=sc.nextInt();
        System.out.println("Do you want refreshments:");
        yes_no=sc.next(); 
        if(no_of_tickets>=5 && no_of_tickets<=40){
            if(circle=='k'){
                totalcost=no_of_tickets*75;
                        }
            if(no_of_tickets>=20){
                
                
            }
            
        }
        else{
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
    }
  
}
