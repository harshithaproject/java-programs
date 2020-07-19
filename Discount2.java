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
public class Discount2 {
    public static BusTicket2 getTicketDetails(){
        Scanner sc=new Scanner(System.in);
        BusTicket2 bs=new BusTicket2();
        System.out.println("Enter ticket no:");
        bs.setTicketNo(sc.nextInt());
        System.out.println("Enter ticketprice:");
        bs.setTicketPrice(sc.nextFloat());
        return bs;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Person2 p=new Person2();
        System.out.println("Enter the passenger name:");
        p.setName(sc.nextLine());
        System.out.println("Enter the gender:");
        p.setGender(sc.next().charAt(0));
        System.out.println("Enter the age:");
        p.setAge(sc.nextInt());
        BusTicket2 bt=Discount2.getTicketDetails();   
        System.out.println("Passenger name:"+p.getName());
        System.out.println("Enter gender:"+p.getGender());
        System.out.println("Enter Age:"+p.getAge());
        bt.calculateTotal();
    }
}
