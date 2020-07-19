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
public class BusTicket2 {
    private int ticketNo;
    private float ticketprice;
    private float totalamt;
    private Person person;
    public BusTicket2(){
        
    }
    public int getTicketNo(){
        return ticketNo;
    }
    public void setTicketNo(int ticketNo){
        this.ticketNo=ticketNo;
    }
    public float getTicketprice(){
        return ticketprice;
    }
    public void setTicketPrice(float ticketprice){
        this.ticketprice=ticketprice;
    }
    public float getTotalamt(){
        return totalamt;
    }
    public void setTotalamt(float totalamt){
        this.totalamt=totalamt;
    }
    public Person getPerson(){
        return person;
    }
    public void setPerson(Person person){
        this.person=person;
    }
    public void calculateTotal(){
        Person p=new Person();
        int age1=p.getAge();
        if(age1<16){
            setTotalamt(getTicketprice()-getTicketprice()*50/100);
            System.out.println("Total amount is:"+getTotalamt());
        }
    }
}
