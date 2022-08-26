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
 * @author LHUser
 */
public class B69 extends JFrame{
    JTextField txtA,txtB,txtKQ;
    JRadioButton rdC,rdT,rdN,rdChia;
    JButton btGiai,btXoa,btThoat;
    
    private void addControl(){
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        
        //Đặt title cho bảng 
        JPanel pnTop = new JPanel();
        JLabel lblTitle = new JLabel("Cộng trừ nhân chia");
        Font ft = new Font("Arial", Font.BOLD,24);
        lblTitle.setFont(ft);
        lblTitle.setForeground(Color.BLUE);
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnTop.add(lblTitle);
        
        con.add(pnTop, BorderLayout.NORTH);
        JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new BorderLayout());
        
        //Đặt tên và sắp xép các thành phần bên trái
        JPanel pnLeft = new JPanel();
        pnLeft.setLayout(new GridLayout(7,3));
        
        btGiai = new JButton("Giai");
        btThoat = new JButton("Thoat");
        btXoa = new JButton("Xoa");
        
        btXoa.setPreferredSize(btThoat.getPreferredSize());
        btGiai.setPreferredSize(btThoat.getPreferredSize());
        
        
        //Định dạng cho Button Giải
        JPanel pn1= new JPanel();
        pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
        pn1.add(btGiai);
        pn1.setBackground(new Color(220, 220, 220));
        pnLeft.add(pn1);
        
        
        JPanel pn2 = new JPanel();
        pn2.setLayout(new FlowLayout(FlowLayout.CENTER));
        pn2.add(btThoat);
        pn2.setBackground(new Color(220, 220, 220));
        pnLeft.add(pn2);
        
        JPanel pn3 = new JPanel();
        pn3.add(btXoa);
        pn3.setBackground(new Color(220,220,220));
        pnLeft.add(pn3);
        
        //Tạo viền xung quanh Title
        TitledBorder borderLeft = new TitledBorder(BorderFactory.createLineBorder(Color.red),"Chon thao tac");
        pnLeft.setBorder(borderLeft);
        pnCenter.add(pnLeft,BorderLayout.WEST);
        
        //Đặt tên à sắp xếp các thành phần bên phải
        JPanel pnRight= new JPanel();
        pnRight.setLayout(new BoxLayout(pnRight, BoxLayout.Y_AXIS));
        
        JPanel pnA = new JPanel();
        pnA.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblA = new JLabel("Nhap a: ");
        txtA = new JTextField(15);
        pnA.add(lblA);
        pnA.add(txtA);
        pnRight.add(pnA);
        
        JPanel pnB= new JPanel();
        pnB.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblB = new JLabel("Nhap b: ");
        txtB = new JTextField(15);
        pnB.add(lblB);
        pnB.add(txtB);
        pnRight.add(pnB);
        
        ButtonGroup group = new ButtonGroup();
        
        JPanel pnGroup = new JPanel();
        pnGroup.setLayout(new BoxLayout(pnGroup,BoxLayout.Y_AXIS));
        pnGroup.setSize(new Dimension(100,300));
        JPanel pnHang1 = new JPanel();
        pnHang1.setLayout(new FlowLayout(FlowLayout.CENTER));
        rdC = new JRadioButton("Cộng");
        rdT = new JRadioButton("Trừ");
        rdN = new JRadioButton("Nhân");
        rdChia = new JRadioButton("Chia");
        group.add(rdC);
        group.add(rdT);
        group.add(rdN);
        group.add(rdChia);
        
        pnHang1.add(rdC);
        pnHang1.add(rdT);
        pnGroup.add(pnHang1);
        
        JPanel pnHang2 = new JPanel();
        pnHang2.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnHang2.add(rdN);
        pnHang2.add(rdChia);
        pnGroup.add(pnHang2);
        TitledBorder borderRight = new TitledBorder(BorderFactory.createLineBorder(Color.red), "Chọn phép toán");
        pnRight.add(pnGroup);
        
        //Hàm phần kết quả
        JPanel pnKQ = new JPanel();
        pnKQ.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblKQ = new JLabel("Kêt quả");
        txtKQ =new JTextField(15);
        pnKQ.add(lblKQ);
        pnKQ.add(txtKQ);
        pnRight.add(pnKQ);
        txtKQ.setEditable(false);
        
        TitledBorder border1 = new TitledBorder(BorderFactory.createLineBorder(Color.BLUE),"Nhập a và b");
        pnRight.setBorder(border1);
        pnGroup.setBorder(borderRight);
        pnCenter.add(pnRight,BorderLayout.CENTER);
        
        con.add(pnLeft,BorderLayout.WEST);
        con.add(pnRight,BorderLayout.CENTER);
    }
    
    //Thêm sự kiện cho Button
    private void addEvents(){
        
        //Sự kiện Button Thoát
        btThoat.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(1);
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
        
        
        //Sự kiện cho Button Xóa
        btXoa.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtA.setText("");
                txtB.setText("");
                txtKQ.setText("");
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
        
        //Sự kiện cho Button Giải
        btGiai.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double soA=0,soB=0;
                if (rdC.isSelected()) {
                    if (txtA.getText().isEmpty()) {
                        soA=0;
                        if (txtB.getText().isEmpty()) {
                            soB=0;
                        }
                        else{
                            soB = Double.parseDouble(txtB.getText());
                        }
                    }
                    else{
                        soA=Double.parseDouble(txtA.getText());
                        if (txtB.getText().isEmpty()) {
                            soB = 0;
                        }
                        else{
                            soB=Double.parseDouble(txtB.getText());
                        }
                    }
                    txtKQ.setText(String.valueOf(soA + soB));
                }
                
                else if (rdT.isSelected()) {
                    if (txtA.getText().isEmpty()) {
                        soA=0;
                        if (txtB.getText().isEmpty()) {
                            soB = 0;
                        }
                        else{
                            soB=Double.parseDouble(txtB.getText());
                        }
                    }
                    else{
                        soA=Double.parseDouble(txtA.getText());
                        if (txtB.getText().isEmpty()) {
                            soB=0;
                        }
                        else{
                            soB=Double.parseDouble(txtB.getText());
                        }
                    }
                    txtKQ.setText(String.valueOf(soA - soB));
                    
                    
                }else if (rdN.isSelected()) {
                    if (txtA.getText().isEmpty()) {
                        soA=0;
                        if (txtB.getText().isEmpty()) {
                            soB=0;
                        }
                        else{
                            soB= Double.parseDouble(txtB.getText());
                        }
                    }
                    else{
                        soA = Double.parseDouble(txtA.getText());
                        if (txtB.getText().isEmpty()) {
                            soB=0;
                        }
                        else{
                            soB=Double.parseDouble(txtB.getText());
                        }
                    }
                    txtKQ.setText(String.valueOf(soA*soB));
                }
                
                else if (rdChia.isSelected()) {
                    if (txtA.getText().isEmpty()) {
                        soA=0;
                        if (txtB.getText().isEmpty()) {
                            soB=0;
                        }
                        else{
                            soB= Double.parseDouble(txtB.getText());
                        }
                    }
                    else{
                        soA = Double.parseDouble(txtA.getText());
                        if (txtB.getText().isEmpty()) {
                            soB=0;
                        }
                        else{
                            soB=Double.parseDouble(txtB.getText());
                        }
                    }
                    txtKQ.setText(String.valueOf(soA/soB));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Chưa chọn phép tính");
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

    
    public B69(){
        super("Demo Windows");  
        addControl();
        addEvents();
        
    }
    public static void main(String[] args){
        B69 ui = new B69();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
