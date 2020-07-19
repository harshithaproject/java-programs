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
public class Category {
    private int categoryId;
    private String categoryName;
    public Category(){
        
    }
    public int getCategoryId(){
        return categoryId;
    }
    public void setCategoryId(int catgoryId){
        this.categoryId=categoryId;
    }
    public String getCategoryName(){
        return categoryName;
    }
    public void setCategoryName(String categoryName){
        this.categoryName=categoryName;
    }
    
}
