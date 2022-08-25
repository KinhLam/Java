/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
//import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Akalis
 */

public class B67 extends JFrame{
    
    JRadioButton rdPlain, rdBold, rdItalic, rdBoldAndItalic;
    JTextField txtInput;
    
    private void addControl()
    {
        Container con = getContentPane();
        con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
        JPanel pn = new JPanel();
        pn.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        //Hàm nhập
        txtInput = new JTextField(30);
        pn.add(txtInput);
        con.add(pn);
        
        JPanel pnBot = new JPanel();
        pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
        ButtonGroup btGroup = new ButtonGroup();
        
        //Hàm tạo phông chữ Plain
        rdPlain = new JRadioButton("Plain");
        btGroup.add(rdPlain);
        pnBot.add(rdPlain);
        
        //Hàm tạo phông chữ Bold
        rdBold = new JRadioButton("Bold");
        btGroup.add(rdBold);
        pnBot.add(rdBold);
        
        //Hàm tạo phông chữ Italic
        rdItalic = new JRadioButton("Italic");
        btGroup.add(rdItalic);
        pnBot.add(rdItalic);
        
        //Hàm tạo phông chữ Bold and Italic
        rdBoldAndItalic = new JRadioButton("Bold/Italic");
        btGroup.add(rdBoldAndItalic);
        pnBot.add(rdBoldAndItalic);
        
        //End 
        con.add(pnBot);//*Phải có dòng này dữ liệu mới chạy được*//
    }
    
    //Hàm dành cho sự kiện (Events)
    private void Events(){
        rdPlain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("Arial", Font.PLAIN, 14);
                txtInput.setFont(f);
            }
        });
        
        rdBold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("Arial", Font.BOLD, 14);
                txtInput.setFont(f);
            }
        });
        
        rdItalic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("Arial", Font.ITALIC, 14);
                txtInput.setFont(f);
            }
        });
                
        rdBoldAndItalic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("Arial", Font.BOLD|Font.ITALIC, 14);
                txtInput.setFont(f);
            }
        });
    }
    
    public B67(){
        super("Demo Windows");  
        addControl();
        Events();
        
    }
    public static void main(String[] args){
        B67 ui = new B67();
        ui.setSize(400, 100);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
