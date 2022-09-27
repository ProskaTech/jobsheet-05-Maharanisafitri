/*
 created by 21343008_Maharani Safitri
 */
package jobsheet5;

import javax.swing.JOptionPane;

public class tugas2 {
    public static void main(String[] args){
        String word1 = "", word2 = "", word3 = "";
        
        word1 = JOptionPane.showInputDialog("Enter word1 : ");
        word2 = JOptionPane.showInputDialog("Enter word2 : ");
        word3 = JOptionPane.showInputDialog("Enter word3 : ");
        
        String msg = word1+ " " +word2+ " " +word3;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(word1+word2);
        
    }
    
}

