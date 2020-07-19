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
public class Movieclass {
    private String movieName;
    private String movieCategory;
    private int ticketCost;
    public String getMovieName(){
        return movieName;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public String getMovieCategory(){
        return movieCategory;
    }
    public void setMovieCategory(String movieCategory){
        this.movieCategory=movieCategory;
    }
    public int getTicketCost(){
        return ticketCost;
    }
    public void setTicketCost(int ticketCost){
        this.ticketCost=ticketCost;
    }
    public Movieclass(){
        
    }
    public int calculateTicketCost(String circle){
        if(circle.equalsIgnoreCase("gold") && movieCategory.equalsIgnoreCase("2D")){
            setTicketCost(300);
//       System.out.println("The ticket cost is ="+ticketCost);
        }
        else if(circle.equalsIgnoreCase("gold") && movieCategory.equalsIgnoreCase("3D")){
             setTicketCost(500);
//            System.out.println("The ticket cost is ="+ticketCost);
        }
        else if(circle.equalsIgnoreCase("silver") && movieCategory.equalsIgnoreCase("2D")){
            
                        setTicketCost(250);

//            System.out.println("The ticket cost is ="+ticketCost);
        }
        else if(circle.equalsIgnoreCase("silver") && movieCategory.equalsIgnoreCase("3D")){
            
                        setTicketCost(450);

//            System.out.println("The ticket cost is ="+ticketCost);
        }
        
        return 0;
        
    
//    if(!circle.equalsIgnoreCase("gold")|| !circle.equalsIgnoreCase("silver")){
//            return -2;
//        }
        
    
    }
}
