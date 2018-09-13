/*
 * Blake Hadaway
 * Septmeber 11th, 2018
 * This program is to detect if a word is a palindrome or not.
 */

package palindrome;
import javax.swing.*;

/**
 *
 * @author blhad3491
 */

public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String word = JOptionPane.showInputDialog("If a word is the "
               + "same forward and backward, it is called a palindrome. \n"
       +"This program is made to detect if a word is a palindrome.\n \n"+ 
               "Please enter a word to be checked."); // This is to get the users input
       String backwardsWord = "";
        for (int pos= word.length()-1; pos >=0; pos--){ //this is grabbing the word inputed  
           backwardsWord += word.charAt(pos); //setting backwordsWord to the backwards word that the user inputs
        }if (word.equalsIgnoreCase(backwardsWord)){ // if the word is spelled the smae backwords, then excute
           // word is a palindrome
           JOptionPane.showMessageDialog(null, word + " "+ "in reverse is"+ " "+ backwardsWord +"\n"+"It IS a palindrome.");
        }else if(word != backwardsWord){ // if it isn't spelled the same backwords, excute
           JOptionPane.showMessageDialog(null, word + " "+ "in reverse is"+ " "+ backwardsWord +"\n"+"It IS NOT a palindrome.");    
           // not a palindome
        }
    }  
}
