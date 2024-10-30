/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingexample;

import com.formdev.flatlaf.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author thorstenstueker
 */
public class SwingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            
            // TODO code application logic here
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SwingExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingForm.main(null);
        //here writing start code
    }
    
}
