/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piokolos;

/**
 *
 * @author Student
 */
public class Movie {
    
    private String title;
    private  int size;
    
    Movie(String t, int s){
        setTitle(t);
        setSize(s);
    }
    
    
    void setTitle(String s){
        if(s != null && !s.equals("")){
            this.title = s;
        }
        else{
            throw new IllegalArgumentException();
        }
        
    }
    
    void setSize(int i){
        if(i>0){
            this.size = i;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
    String getTitle(){
        return title;
    }
    int getSize(){
        return size;
    }
}
