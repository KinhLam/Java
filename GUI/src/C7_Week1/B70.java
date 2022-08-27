/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
/**
 *
 * @author Akalis
 */
public class B70 extends JFrame{
    JList<String> lst;
    JLabel lbl;
    
    private void addEvents(){
        lst.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl.setText(String.valueOf(lst.getSelectedValue()));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
    private void addControl(){
        Container con= getContentPane();
        con.setLayout(new BorderLayout());
        lbl = new JLabel("Ngay");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        con.add(lbl,BorderLayout.NORTH);
        DefaultListModel ngayModel = new DefaultListModel<>();
        ngayModel.addElement("Monday");
        ngayModel.addElement("Tuesday");
        ngayModel.addElement("Wednesday");
        ngayModel.addElement("Thursday");
        ngayModel.addElement("Friday");
        ngayModel.addElement("Saturday");
        ngayModel.addElement("Sunday");
        
        lst = new JList<>(ngayModel);
        lst.setSelectedIndex(0);
        lst.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lbl.setText(String.valueOf(lst.getSelectedValue()));
        JScrollPane sc = new JScrollPane(lst, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        con.add(sc, BorderLayout.CENTER);
    }
    
    public B70(){
        super("Demo Windows");  
        addControl();
        addEvents();
        
    }
    public static void main(String[] args){
        B70 ui = new B70();
        ui.setSize(300, 150);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
