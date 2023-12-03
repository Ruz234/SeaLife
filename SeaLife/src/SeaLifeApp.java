/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ruzel
 */
import javax.swing.JOptionPane;
public class SeaLifeApp {//start class
    public static void main(String[] args){//start main
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SeaLifeGUI gui = new SeaLifeGUI();
                gui.setVisible(true);
            }
        });*/
        
        
        
        
        SeaLifeUI ui = new SeaLifeUI();
        String restart;
        
       
        do{//start do
            ui.mainMenu();
            restart = JOptionPane.showInputDialog(null, "Enter yes to go back");
        }//end do
        while(restart.equalsIgnoreCase("yes"));
                
                
    }//end main
    
}//end class
