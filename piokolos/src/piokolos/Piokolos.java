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
public class Piokolos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Storage storage = new Storage();
        Movie movie;
        
        storage.addMovie(new Movie("Deadpool",3072));
        storage.addMovie(new Movie("Deadpool 2",3072));
        storage.addMovie(new Movie("Avengers 3",5021));
        storage.addMovie(new Movie("Deadpool 2",3072));
        storage.addMovie(new Movie("Deadpool 2",3072));
        
        try{
            storage.addMovie(null);
            storage.addMovie(new Movie("Avengers",-4));
            storage.addMovie(new Movie("",21232));
        }
        catch(IllegalArgumentException e){
            System.err.print("Proszę wprowadzić właściwy film");
        }
        
        storage.print();
        System.out.println(storage.total());
        
        storage.removeMovie("Deadpool 2");
        
        storage.print();
        System.out.println(storage.total());
        
        
        
    }
    
}
