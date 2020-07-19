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
public class Token {
    private static int tokenNumber;
    private int counterNumber;
    private String serviceType;
    public Token(String serviceType){
        this.serviceType=serviceType;
                tokenNumber++;
    }
    public static int getTokenNumber(){
        return tokenNumber;
    }
    public int getCounterNumber(){
        if(serviceType.equals("Cheque")){
            counterNumber=1;
        }
        else if(serviceType.equals("Withdraw")){
            counterNumber=2;
        }
        else if(serviceType.equals("Deposit")){
            counterNumber=3;
        }
        else{
            counterNumber=4;
        }
        return counterNumber;
    }
    public void setCounterNumber(int counterNumber){
        this.counterNumber=counterNumber;
    }
    public String getServiceType(){
        return serviceType;
    }
    public void setServiceType(String serviceType){
        this.serviceType=serviceType;
    }
    
}
