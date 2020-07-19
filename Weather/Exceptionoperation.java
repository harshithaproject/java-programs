/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weather;

/**
 *
 * @author activ
 */
public class Exceptionoperation {
    private int number1;
    private int number2;
    private char operation;
    public int getNumber1(){
        return number1;
    }
    public void setNumber1(int number1){
        this.number1=number1;
    }
    public int getNumber2(){
        return number1;
    }
    public void setNumber2(int number2){
        this.number2=number2;
    }
    public char getOperation(){
        return operation;
    }
    public void setOperation(char operation){
        this.operation=operation;
    }
    public int calculation(){
        int result=0;
        char op=this.getOperation();
        if(op=='+'){
            result=number1+number2;
            System.out.println(result);
        }
        return result;
    }
}
