/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piokolos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Student
 */
public class Storage {
    
    private List <Movie> list = new ArrayList();
    
    public void addMovie(Movie m){
        if(m == null){
            throw new IllegalArgumentException("Tytuł nie może być NULL");
        }
        else{
            list.add(m);
        }
        
    }
    
    public int total(){
        int suma = 0;
        
        for(Movie m : list){
            suma += m.getSize();
        }
        return suma;
    }
    
    public void print (){
        for(Movie m : list){
            System.out.println("Nazwa: " + m.getTitle() + " Rozmiar: " + m.getSize() +"MB");
        }
    }
    
    public void removeMovie(String title){
        Iterator<Movie> iter = list.iterator();

        while(iter.hasNext()){
            if(iter.next().getTitle().equals(title)){
                iter.remove();
            }
        }
    }
}
