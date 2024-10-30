/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scritturafile;

/**
 *
 * @author alessandrobistocchi
 */
import java.io.*;
public class ScritturaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
WriteLines cp = new WriteLines(args[0]);
}
catch(IOException ex) { System.out.println("Errore di I/O.");
System.exit(1);
}
}

}
    

