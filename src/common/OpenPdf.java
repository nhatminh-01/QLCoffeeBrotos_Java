/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author aDMIN
 */
public class OpenPdf {
    public static void openById(String id) {
        try {
            if((new File("C:\\Users\\aDMIN\\OneDrive\\Documents\\NetBeansProjects\\Login\\Bill" + id + ".pdf")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\aDMIN\\OneDrive\\Documents\\NetBeansProjects\\Login\\Bill"+id + ".pdf");
            } else 
                JOptionPane.showMessageDialog(null, "File is not Exists");
            }
            catch(Exception e) {
        JOptionPane.showMessageDialog (null, e);
        }
    }
}