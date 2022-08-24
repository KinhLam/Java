/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Akalis
 */
public class B65 extends JFrame{
    public B65(){
        super("Dem Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        
        //Chỉnh màu phía trên
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.RED);
            pnBorder.add(pnNorth,BorderLayout.NORTH);
        
        //Chỉnh màu phía dưới
        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.RED);
            pnBorder.add(pnSouth,BorderLayout.SOUTH);
        
        //Chỉnh màu bên Trái
        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.BLUE);
            pnBorder.add(pnWest,BorderLayout.WEST);
        
        //Chỉnh màu bên Phải
        JPanel pnEast = new JPanel();
        pnEast.setBackground(Color.BLUE);
            pnBorder.add(pnEast, BorderLayout.EAST);
        
        //Chỉnh màu Trung tâm
        JPanel pnCenter = new JPanel();
        pnCenter.setBackground(Color.YELLOW);
            pnBorder.add(pnCenter,BorderLayout.CENTER);
        
        
        getContentPane().add(pnBorder);
        
        
    }
    public static void main(String[] args){
        B65 ui = new B65();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
}}
