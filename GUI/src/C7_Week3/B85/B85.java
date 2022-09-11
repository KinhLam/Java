/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week3.B85;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;

/**
 *
 * @author Akalis
 */
public class B85 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        
        //Tạo thanh JToolBar chứa các Button
        JToolBar toolbar = new JToolBar();
        
        //Tạo Button
        JButton bt1 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\Opened Folder.png"));
        //Làm trong suốt viền xung quanh button
        bt1.setBorderPainted(false);
        bt1.setContentAreaFilled(false);
        toolbar.add(bt1);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt2 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\save.png"));
        //Làm trong suốt viền xung quanh button
        bt2.setBorderPainted(false);
        bt2.setContentAreaFilled(false);
        toolbar.add(bt2);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt3 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\save_as.png"));
        //Làm trong suốt viền xung quanh button
        bt3.setBorderPainted(false);
        bt3.setContentAreaFilled(false);
        toolbar.add(bt3);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt4 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\print.png"));
        //Làm trong suốt viền xung quanh button
        bt4.setBorderPainted(false);
        bt4.setContentAreaFilled(false);
        toolbar.add(bt4);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt5 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\image.png"));
        //Làm trong suốt viền xung quanh button
        bt5.setBorderPainted(false);
        bt5.setContentAreaFilled(false);
        toolbar.add(bt5);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt6 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\Facebook.png"));
        //Làm trong suốt viền xung quanh button
        bt6.setBorderPainted(false);
        bt6.setContentAreaFilled(false);
        toolbar.add(bt6);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt7 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\computer.png"));
        //Làm trong suốt viền xung quanh button
        bt7.setBorderPainted(false);
        bt7.setContentAreaFilled(false);
        toolbar.add(bt7);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt8 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\hand.png"));
        //Làm trong suốt viền xung quanh button
        bt8.setBorderPainted(false);
        bt8.setContentAreaFilled(false);
        toolbar.add(bt8);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt9 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\search.png"));
        //Làm trong suốt viền xung quanh button
        bt9.setBorderPainted(false);
        bt9.setContentAreaFilled(false);
        toolbar.add(bt9);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt10 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\cursor.png"));
        //Làm trong suốt viền xung quanh button
        bt10.setBorderPainted(false);
        bt10.setContentAreaFilled(false);
        toolbar.add(bt10);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt11 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\check_all.png"));
        //Làm trong suốt viền xung quanh button
        bt11.setBorderPainted(false);
        bt11.setContentAreaFilled(false);
        toolbar.add(bt11);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt12 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\Camera.png"));
        //Làm trong suốt viền xung quanh button
        bt12.setBorderPainted(false);
        bt12.setContentAreaFilled(false);
        toolbar.add(bt12);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt13 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\microsoft_forms_2019.png"));
        //Làm trong suốt viền xung quanh button
        bt13.setBorderPainted(false);
        bt13.setContentAreaFilled(false);
        toolbar.add(bt13);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        
        JButton bt14 = new JButton(new ImageIcon("src\\C7_Week3\\B85\\Image\\pencil.png"));
        //Làm trong suốt viền xung quanh button
        bt14.setBorderPainted(false);
        bt14.setContentAreaFilled(false);
        toolbar.add(bt14);
        //Thêm sự kiện cho button khi click vào button thì xuất thông báo
        bt14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                f.setTitle("File");
            }
        });
        f.add(toolbar);
        f.setSize(900,100);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
