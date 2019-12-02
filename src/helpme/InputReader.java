/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antonis
 */
public class InputReader {
    
    public void readInput() {
    
        try {
            File file =
                    new File("Documents/adventinput.txt");
            Scanner sc = new Scanner(file);
            
            while (sc.hasNextLine()) 
                System.out.println(sc.nextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
