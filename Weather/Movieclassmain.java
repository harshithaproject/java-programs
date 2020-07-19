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
public class Movieclassmain {
    public static Movieclass getMovieDetails(){
        Movieclass m=new Movieclass();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the movie name:");
        m.setMovieName(sc.nextLine());
        System.out.println("Enter the movie category:");
        m.setMovieCategory(sc.nextLine());
        return m;
    }
    public static String getCircle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the circle");
        String circle=sc.next();
        return circle;
    }
        public static void main(String args[]){
        int res;
        Movieclass m1=getMovieDetails();
        String cir=getCircle();
        System.out.println("Movie name = "+m1.getMovieName());
        System.out.println("Movie category = "+m1.getMovieCategory());
        res=m1.calculateTicketCost(cir);
                if(res==0){
                    System.out.println("The ticket cost is ="+m1.getTicketCost());
                }
                else if(res==-1){
                    System.out.println("Sorry there is no"+m1.getMovieCategory()+"type of category in theater");
                }
                else  if(res==-2){
                    System.out.println("Sorry!!! Circle is Invalid.");
                }
                else if(res==-3){
                    System.out.println("Sorry !!!Both circle and category are invalid");
                }
    }
         
    
    
        
        
//        System.out.println("Movie name = "+m.getMovieName());
//        System.out.println("Movie category = "+m.getMovieCategory());
//        System.out.println("The ticket cost is ="+m.getTicketCost());
    }
    

