/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author activ
 */
public class Switchclass {
    final static short a=2;
    public static int b=0;
    public static void main(String args[]){
       
        for(int c=0;c<4;c++){
        switch(c){
            case a:System.out.print("a");
        
            default:System.out.print("d");
            case a-1:System.out.print("a-1");
            break;
            case a-2:System.out.print("a-2");
        
//       
        }
    }
    }
}
