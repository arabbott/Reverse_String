/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import javax.swing.JOptionPane;

/**
 *
 * @author Adam
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Please enter the word or sentence you would like to be reversed:");
        String reversedInput = Reverse(input);
        JOptionPane.showMessageDialog(null, reversedInput);
            
 
    }
    
    public static String Reverse(String input){
        String reversedString = null;
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1=input1.reverse(); 
        for (int i=0;i<input1.length();i++){
            input1.charAt(i);
            reversedString = input1.toString();
        }
        return reversedString;
    }
    
}
