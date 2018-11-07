package pio.drozlach.pkg1;

import java.util.Random;
/**
 *
 * @author Student
 */
public class PIODRozlach1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Player player = new Player();
        player.setName("");
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