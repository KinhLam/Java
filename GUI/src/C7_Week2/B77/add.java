/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week2.B77;

import static C7_Week2.B77.philosopher.ds;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Akalis
 */
public class add extends JDialog{
    JTextField txt1,txt2,txt3;
    JLabel lbl1,lbl2,lbl3;
    JButton btn;
    
    private void Controls(){
        Container con = getContentPane();
        con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
        lbl1 = new JLabel("First Name");
        lbl2 = new JLabel("Last Name");
        lbl3 = new JLabel("Years");
        txt1= new JTextField(15);
        txt2= new JTextField(15);
        txt3= new JTextField(15);
        btn= new JButton("Thêm");
        con.add(lbl1);
        con.add(txt1);
        con.add(lbl2);
        con.add(txt2);
        con.add(lbl3);
        con.add(txt3);
        con.add(btn);
    }
    
    //Thêm sự kiện cho button
    private void addEvents(){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nguoi o = new nguoi();
                o.setFirstName(txt1.getText());
                o.setLastName(txt2.getText());
                o.setYears(txt3.getText());
                ds.add(o);
                philosopher.loadData();
                dispose();
            }
        });
    }
    
    public void showWindown(){
        this.setSize(400,350);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public add(){
        this.setTitle("Thêm");
        Controls();
        addEvents();
    }
}
