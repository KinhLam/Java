/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week2.B73;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import static java.awt.PageAttributes.MediaType.C;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Akalis
 */
public class Input extends JDialog{
    JTextField txt;
    JButton btOk, btThoat;
    
    private void addEvents(){
        btThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Test.model.addElement(txt.getText());
            }
        }); 
    }
    
    
    private void addControls(){
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        
        JPanel pnLeft = new JPanel();
        pnLeft.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel pnHinh = new JLabel();
        pnHinh.setIcon(new ImageIcon("C:\\Users\\Akalis\\Documents\\GitHub\\Java\\GUI\\src\\Image\\nani.jpg"));
        pnLeft.add(pnHinh);
        con.add(pnLeft);
        
        JPanel pnRight = new JPanel();
        pnRight.setLayout(new BoxLayout(pnRight, BoxLayout.Y_AXIS));
        JLabel lbl = new JLabel("Enter name: ");
        Font ft = new Font("Arial", Font.BOLD,24);
        lbl.setFont(ft);
        pnRight.add(lbl);
        txt = new JTextField(15);
        pnRight.add(txt);
        
        JPanel pnBut = new JPanel();
        pnBut.setLayout(new FlowLayout(FlowLayout.CENTER));
        btOk = new JButton("Ok");
        btThoat = new JButton("Thoat");
        pnBut.add(btOk);
        pnBut.add(btThoat);
        pnRight.add(pnBut);
        con.add(pnRight,BorderLayout.CENTER);
    }
    
    public void showWindow(){
        this.setSize(400, 150);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

   
    
    
    public Input(String title){
        this.setTitle(title);
        addControls();
        addEvents();
        
    }
}
