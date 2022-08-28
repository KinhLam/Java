/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week2.B78;

import com.sun.jdi.event.EventQueue;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akalis
 */
public class B78 {
    private JFrame frame;
    private JTextField txt1,txt2,txt3;
    DefaultTableModel dtm;
    JTable tb;
    public static ArrayList<nguoi> ds = new ArrayList<>();
    
    //Thêm 1 dòng mới vào bảng
    protected void loadData(){
        dtm.setRowCount(0);
        for (nguoi o:ds) {
            Vector<Object> vec = new Vector<>();
            vec.add(o.getFirstName());
            vec.add(o.getLastName());
            vec.add(o.getYears());
            
            dtm.addRow(vec);
        }
    }
    
    private void initialize(){
        frame = new JFrame();
        frame.setBounds(100,100,450,515);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel  = new JLabel("Account Number");
        lblNewLabel.setBounds(10,11,144,26);
        frame.getContentPane().add(lblNewLabel);
        
        //Tạo thanh nhập account Number
        txt1 = new JTextField();
        txt1.setBounds(164,11,260,23);
        txt1.setColumns(10);
        frame.getContentPane().add(txt1);
        
        JLabel lblAcountName = new JLabel("Account Name");
        lblAcountName.setBounds(10,48,144,26);
        frame.getContentPane().add(lblAcountName);
        
        //Tạo thanh nhập account Name
        txt2 = new JTextField();
        txt2.setColumns(10);
        txt2.setBounds(164, 48, 260, 23);
        frame.getContentPane().add(txt2);
        
        JLabel lblAccountMoney = new JLabel("Account Money");
        lblAccountMoney.setBounds(10,85,144,26);
        frame.getContentPane().add(lblAccountMoney);
        
        //Tạo thanh nhập account Money
        txt3 = new JTextField();
        txt3.setColumns(10);
        txt3.setBounds(164,85,260,23);
        frame.getContentPane().add(txt3);
        
        JPanel panel = new JPanel();
        panel.setBounds(10,122,414,284);
        panel.setLayout(new BorderLayout());
        
        //Tạo bảng và thêm cột vào bảng
        dtm = new DefaultTableModel();
        dtm.addColumn("Acc Name");
        dtm.addColumn("Acc Number");
        dtm.addColumn("Acc Money");
        tb = new JTable(dtm);
        
        //Tạo thanh trược cho bảng
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add((sc),BorderLayout.CENTER);
        frame.getContentPane().add(panel);
        
        //Thêm sự kiện và đặt tên cho button
        JButton btNewButton = new JButton("Add");
        btNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                nguoi o = new nguoi();
                o.setFirstName(txt1.getText());
                o.setLastName(txt2.getText());
                o.setYears(txt3.getText());
                ds.add(o);
                loadData();
            }
        });
        
        btNewButton.setBounds(82,417,89,48);
        frame.getContentPane().add(btNewButton);
        
        JButton btClear = new JButton("Clear");
        btClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int row = tb.getSelectedRow();
                if (row == -1) {
                    return;
                }
                else{
                    ds.remove(row);
                }
                loadData();
            }
        });
        
        btClear.setBounds(181,417,89,48);
        frame.getContentPane().add(btClear);
        
        JButton btExit = new JButton("Exit");
        btExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.exit(0);
            }
        });
        
        btExit.setBounds(280,417,89,48);
        frame.getContentPane().add(btExit);
    }
    
    public B78(){
        initialize();
    }
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                try{
                    B78 ui = new B78();
                    ui.frame.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
