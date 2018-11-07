/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pio.drozlach.pkg1;
import java.util.Random;
/**
 *
 * @author Student
 */
public class Player {
    private Random rand = new Random();
    private String name = "Domyślny Janusz";
    
    public void setName(String name){
        if(name != null && !name.isEmpty() /*name.length()>=1*/ ){
            this.name = name;
        }
    }
    
    public String getName(){
        return name;
    }
    public int guess(){
        return rand.nextInt(6)+1;
    }
}
