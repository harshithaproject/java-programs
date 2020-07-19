/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weather;
import java.util.*;
/**
 *
 * @author activ
 */
public class WeatherInfo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String location[]={"Delhi","Mumbai","Chennai","Kolkata"};
        String weather[]={"SUNNY","RAINING","WINDY","SUNNY"};
        float temp[]={45,29.6F,32,35};
        for(int i=0;i<location.length;i++){
            for(int j=0;j<weather.length;j++){
                for(int k=0;k<temp.length;k++){
                if((i==j)&& (j==k))
                {
                System.out.println("The weather in "+location[i]+"  is "+weather[j]+" normal "+" at "+temp[k]);
                }
            }
            }
        }
    }
    
}
