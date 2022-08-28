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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

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
        JLabel lbltitle = new JLabel("Giai phuong trinh bac 2");
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
        JPanel pnB = new JPanel();
        pnB.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblB = new JLabel("B: ");
        lblB.setFont(ftlabel);
        txtB = new JTextField(20);
        pnB.add(lblB);
        pnB.add(txtB);
        pnCenter.add(pnB);
        
        //Định dạng cho txtC
        JPanel pnC = new JPanel();
        pnC.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblC = new JLabel("C: ");
        lblC.setFont(ftlabel);
        txtC = new JTextField(20);
        pnC.add(lblC);
        pnC.add(txtC);
        pnCenter.add(pnC);
        
        //Tạo Jpanel chứa kết quả
        JPanel pnKQ = new JPanel();
        pnKQ.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblKQ = new JLabel("Ket Qua");
        lblKQ.setFont(ftlabel);
        pnKQ.add(lblKQ);
        JPanel pnOutput = new JPanel();
        txtKQ = new JTextField(22);
        txtKQ.setEnabled(false);
        txtKQ.setHorizontalAlignment(SwingConstants.CENTER);
        pnOutput.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnOutput.add(txtKQ);
        pnCenter.add(pnOutput);
        
        //Hàm tạo đường viền xung quanh ba biến a,b,c
        TitledBorder borderCenter = new TitledBorder(BorderFactory.createLineBorder(Color.RED), "Nhap a,b,c");
        JPanel pnBot = new JPanel();
        pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
        btGiai = new JButton("Giai");
        btThoat = new JButton("Thoat");
        btXoa = new JButton("Xoa");
        pnBot.add(btGiai);
        pnBot.add(btThoat);
        pnBot.add(btXoa);
        TitledBorder borderBot = new TitledBorder(BorderFactory.createLineBorder(Color.yellow), "Chon Thao Tac");
        pnBot.setBorder(borderBot);
        pnCenter.setBorder(borderCenter);
        con.add(pnBot,BorderLayout.SOUTH);
    }
    
    //Thêm các sự kiện cho Button
    private void addEvents()
    {
        btThoat.addMouseListener(new MouseListener() {
            //Hàm gọi khi nút chuột được click
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(1);
            }

            //Hàm gọi khi nút chuột được nhấn trên một thành phần
            @Override
            public void mousePressed(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            //Hàm gọi khu nút chuột được nhả ra trên một thành phần
            @Override
            public void mouseReleased(MouseEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            //Hàm gọi ra khi chuột nhập vào một thành phần
            @Override
            public void mouseEntered(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            //Hàm gọi ra khi thoát chuột khỏi một thành phần
            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        btXoa.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtKQ.setText("");
                txtA.setText("");
                txtB.setText("");
                txtC.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        
        btGiai.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    double c = Double.parseDouble(txtC.getText());
                    double delta = b*b-4*a*c;
                    double x1,x2;
                    //Tính nghiệm
                    if (delta>0) {
                        x1=(double)((-b+ Math.sqrt(delta))/(2*a));
                        x2=(double)((-b- Math.sqrt(delta))/(2*a));
                        txtKQ.setText("x1= "+x1 + "và x2= "+x2);
                    }
                    else if (delta ==0) {
                        x1=(-b/(2*a));
                        txtKQ.setText("x1=x2"+x1);
                    }
                    else{
                        txtKQ.setText("Phuong trinh vo nghiem");
                    }
                }catch(Exception e2){
                    JOptionPane.showMessageDialog(null, "Input khong hop le");
                }
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
    
    
    public B68(){
        super("B68");  
        addControl();
        addEvents();
        
    }
    public static void main(String[] args){
        B68 ui = new B68();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
