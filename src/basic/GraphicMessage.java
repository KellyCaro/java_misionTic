/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class GraphicMessage {
    
    public static float readInt(String message) {
        String input =JOptionPane.showInputDialog(message);
        return Float.parseFloat(input);
    }
    
}
