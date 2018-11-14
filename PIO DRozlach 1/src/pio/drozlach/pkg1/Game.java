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
public class Game {
    protected Player player;
    protected Random rand = new Random();
    /**
     * 
     * @param p 
     */
    public void addPlayer(Player p){
       this.player = p;
    }
    /**
     * 
     */
    public void play(){
        int kosc;
        int guess;
        do{       
            kosc = rand.nextInt(6)+1;
            System.out.println("Gracz 1 rzucił kością. Liczba oczek wynosi: " + kosc );

            guess = player.guess();
            System.out.println("Gracz " + player.getName() + " obstawia liczbę: " + guess);
            
            if(guess!=kosc){
                System.out.println("Gracz " + player.getName() + " nie odgadnął liczby na kostce");
            }
        }while(guess!=kosc);
        
        System.out.println("Gracz " +player.getName()+ " odgadnął liczbę oczek na kostce!");
    }
    
}
