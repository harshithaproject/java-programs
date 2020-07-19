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
public class TestMain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Person p=new Person();
        BusTicket b=new BusTicket();
        System.out.println("Enter the passenger name:");
        p.setName(sc.nextLine());
        System.out.println("Enter the gender(M or F / m or f):");
        p.setGender(sc.next().charAt(0));
        System.out.println("Enter the age:");
        p.setAge(sc.nextInt());
        System.out.println("Enter the ticket no:");
        b.setTicketNo(sc.nextInt());
        System.out.println("Enter the ticket price:");
        b.setTicketPrice(sc.nextFloat());
        b.calculateTotal();
        b.setPersonObj(p);
        System.out.println("Ticket no:"+b.getTicketNo());
        System.out.println("Passenger Name:"+p.getName());
        System.out.println("Price of a ticket:"+b.getTicketPrice());
        System.out.println("Total Amount :"+b.getTotalAmount());
    }
    
}
