/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Akalis
 */
public class B72_JComboBox extends JFrame{
    JComboBox<String>cmd;
    JLabel lbl;
    
    private void addControls(){
        Container con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        //Tạo menu
        String []arr ={"Hình 1","Hình 2","Hình 3"};
        cmd = new JComboBox<>(arr);
        con.add(cmd);
        
        lbl = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\Users\\Akalis\\Documents\\GitHub\\Java\\GUI\\src\\Image\\nani.jpg");
        lbl.setIcon(icon);
        con.add(lbl);
    }
    
    //Thêm sự kiện cho menu
    private void addEvents(){
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = cmd.getSelectedIndex();
                if (i == 0) {
                    ImageIcon icon = new ImageIcon("C:\\Users\\Akalis\\Documents\\GitHub\\Java\\GUI\\src\\Image\\wow.jpg");
                    lbl.setIcon(icon);
                }
                else if (i == 1) {
                    ImageIcon icon = new ImageIcon("C:\\Users\\Akalis\\Documents\\GitHub\\Java\\GUI\\src\\Image\\Saurieng.jpg");
                    lbl.setIcon(icon);
                }
                else{
                    ImageIcon icon = new ImageIcon("C:\\Users\\Akalis\\Documents\\GitHub\\Java\\GUI\\src\\Image\\dao.jpg");
                    lbl.setIcon(icon);
                }
            }
        });
    }
    
    public B72_JComboBox(){
        super("Demo Windows");  
        addControls();
        addEvents();
        
    }
    public static void main(String[] args){
        B72_JComboBox ui = new B72_JComboBox();
        ui.setSize(500, 600);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
