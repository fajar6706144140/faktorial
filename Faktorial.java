/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Faktorial {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan angka: ");
        int baris=input.nextInt();;
        for (int i = 0; i < baris; i++) {
            
            for (int j = baris; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = baris; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < baris; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = baris; j > i; j--) {
                System.out.print("*");
            }
            for (int j = baris; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
            
            
        }
        
    }
    
}
