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
public class BusTicket {
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person personObj=new Person();
     public BusTicket(){
         
     }
     public int getTicketNo(){
         return ticketNo;
     }
     public void setTicketNo(int ticketNo){
         this.ticketNo=ticketNo;
     }
     public float getTicketPrice(){
         return ticketPrice;
     }
     public void setTicketPrice(float ticketPrice){
         this.ticketPrice=ticketPrice;
     }
     public float getTotalAmount(){
         return totalAmount;
     }
     public void setTotalAmount(float totalAmount){
         this.totalAmount=totalAmount;
     }
     public Person getPersonObj(){
         return personObj;
     }
     public void setPersonObj(Person personObj){
         this.personObj=personObj;
     }
     public void calculateTotal(){
         int age1=personObj.getAge();
         if(age1<16){
            setTotalAmount(ticketPrice-(float)(ticketPrice*0.5));
         }
         else if(age1<25){
            setTotalAmount(ticketPrice-(float)(ticketPrice*0.25));
         }
         else if(age1>=61){
            setTotalAmount(ticketPrice-(float)(ticketPrice*0.1));
         }
         else{
             setTotalAmount(ticketPrice);
         }
     }
    
}
