/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week1;

import javax.swing.JFrame;

/**
 *
 * @author LHUser
 */
public class BT62 extends JFrame{
    public BT62(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args){
        BT62 ui = new BT62();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
