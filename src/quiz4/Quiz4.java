/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz4;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {String Sentence = 
        JOptionPane.showInputDialog("Enter a sentence: ");
        int Lenght = Sentence.length();
        
        while (Lenght > 0) {
            int counter = 1;
            String s = Sentence, s2 = s, input;
            char i;
            
            input = JOptionPane.showInputDialog("The sentence is:  "+ Sentence + "\n"  +   "Y to remove the last word or N if no:   " + "\n");
            i = input.charAt(0);

            if (i == 'Y' || i == 'y') {
                Lenght = Lenght - 1;
                char ch = Sentence.charAt(Lenght);
                
                while (ch != ' ') {
                    counter++;
                    Lenght = Lenght - 1;
                    ch = Sentence.charAt(Lenght);
                }
                
                Sentence = Sentence.substring(0, Sentence.length() - counter);
                JOptionPane.showMessageDialog(null, "Full sentence: \n" + s + "\nLast word removed:   \n" + Sentence);
            }
            
            else {
                JOptionPane.showMessageDialog(null, "SEE YOU SOON");
                return;
            }
        }
    }
}
