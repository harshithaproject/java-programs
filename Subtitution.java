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
public class Subtitution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the encrypted text:");
        String encrypt=sc.nextLine();
        char encrypted[]=encrypt.toCharArray();
        for(int i=0;i<encrypted.length;i++){
            encrypted[i]=(char)(7+(int)encrypted[i]);
        }
                for(int i=0;i<encrypted.length;i++){
        System.out.println("Decrypted text:"+encrypted[i]);
                }
    }
}
