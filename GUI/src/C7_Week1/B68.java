/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Akalis
 */
public class B68 extends JFrame{
    JTextField txtA,txtB,txtC,txtKQ;
    JButton btGiai,btXoa,btThoat;
    private void addControl(){
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnTop = new JPanel();
        JLabel lbltitle = new JLabel("Giải phương trình bậc 2");
        Font ft = new Font("Arial", Font.BOLD,25);
        lbltitle.setFont(ft);
        lbltitle.setForeground(Color.BLACK);
        pnTop.setBackground(Color.GRAY);
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnTop.add(lbltitle);
        con.add(pnTop, BorderLayout.NORTH);
        JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
        con.add(pnCenter,BorderLayout.CENTER);
        
        //Định dạng cho txtA
        JPanel pnA = new JPanel();
        pnA.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblA = new JLabel("A: ");
        Font ftlabel = new Font("Arial",Font.BOLD, 14);
        lblA.setFont(ftlabel);
        txtA = new JTextField(20);
        pnA.add(lblA);
        pnA.add(txtA);
        pnCenter.add(pnA);
        
        //Định dạng cho txtB
        
        
    }
    
    
    
    public B68(){
        super("Demo Windows");  

        
    }
    public static void main(String[] args){
        B68 ui = new B68();
        ui.setSize(400, 100);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
