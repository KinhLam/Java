/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author LHUser
 */
public class B64 extends JFrame{
    public B64(){
        super("B64");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        Icon BoxLayout;
        JButton btn1 = new JButton("BoxLayout");
        btn1.setForeground(Color.red);
        Font font = new Font("Arial", Font.BOLD | Font.ITALIC,25);
        btn1.setFont(font);pnBox.add(btn1);
        JButton btn2 = new JButton("X_AXIS");
        btn2.setForeground(Color.blue);
        btn2.setFont(font);pnBox.add(btn2);
        JButton btn3=new JButton("Y_AXIS");
        btn3.setForeground(Color.ORANGE);
        btn3.setFont(font);pnBox.add(btn3);
        
        Container con = getContentPane();
        con.add(pnBox);
        
    }
    public static void main(String[] args){
        B64 ui = new B64();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
}}
