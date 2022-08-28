/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.*;

/**
 *
 * @author Akalis
 */
public class B66 extends JFrame{
    JCheckBox chBold,chItalic;
    JTextField txtInput;
    
    
    //Khai báo và add các Controls
    private void addControls()
    {
        
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pn = new JPanel();
        pn.setLayout(new FlowLayout(FlowLayout.CENTER));
        txtInput = new JTextField(15);
        pn.add(txtInput);
        con.add(pn,BorderLayout.CENTER);
        JPanel pnBot = new JPanel();
        chBold = new JCheckBox("Bold");
        chItalic = new JCheckBox("Italic");
        pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnBot.add(chBold);
        pnBot.add(chItalic);
        con.add(pnBot, BorderLayout.SOUTH);
    }
    
    //Thêm sự kiện cho các Controls
    private void addEvents(){
        //Thêm sự kiện cho chBold
        chBold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chBold.isSelected()){
                    if (chItalic.isSelected()) {
                        Font f = new Font("Arial", Font.BOLD|Font.ITALIC,14);
                        txtInput.setFont(f);
                    }
                    else{
                        Font f = new Font("Arial",Font.BOLD,14);
                        txtInput.setFont(f);
                    }
                }
                else{
                    if (chItalic.isSelected()) {
                        Font f = new Font("Arial", Font.ITALIC,14);
                        txtInput.setFont(f);
                    }
                    else{
                        Font f = new Font("Arial", Font.PLAIN, 14);
                    }
                }
            }
        });
        
        //Thêm sự kiện cho chItalic
        chItalic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chBold.isSelected()){
                    if (chItalic.isSelected()) {
                        Font f = new Font("Arial", Font.BOLD|Font.ITALIC,14);
                        txtInput.setFont(f);
                    }
                    else{
                        Font f = new Font("Arial",Font.BOLD,14);
                        txtInput.setFont(f);
                    }
                }
                else{
                    if (chItalic.isSelected()) {
                        Font f = new Font("Arial", Font.ITALIC,14);
                        txtInput.setFont(f);
                    }
                    else{
                        Font f = new Font("Arial", Font.PLAIN, 14);
                    }
                }
            }
        });
    }
    
    
    public B66(){
        super("B66");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addControls();
        addEvents();
        
        
//        JTextField textField = new JTextField();
//        textField.setText("This is a text");
//        textField.setColumns(20);
        
        
    }
    public static void main(String[] args){
        B66 ui = new B66();
        ui.setSize(400, 100);
//        JPanel panel = new JPanel();
        // khoi tao JTextField
//        JTextField jTextField = new JTextField(10);
//
//        JTextField jTextField1 = new JTextField(20);
//
//        panel.add(jTextField);
//        panel.add(jTextField1);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);

}
}