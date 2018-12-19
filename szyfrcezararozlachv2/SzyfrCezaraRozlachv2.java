/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szyfrcezararozlachv2;

/**
 *
 * @author Student
 */
public class SzyfrCezaraRozlachv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //long t0 = System.currentTimeMillis(); <- Pomiar czasu UNIX w ms
        //StringBuilder sb = new StringBuilder(); <-Szybsze od konkatenacji
        
        String alfabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        String tekst = "Tekst do szyfrowania";
        String kod = "";
        int offset = 1;
        int len = alfabet.length();
        offset %= len;

        for (int i = 0; i < tekst.length(); i++) {
            char ch = tekst.charAt(i);
            int idx = alfabet.indexOf(ch);
            idx = (idx + offset + len) % len;
            ch = alfabet.charAt(idx);
            kod += ch;
        }
        System.out.println(tekst + " : " + kod);
    }

}
