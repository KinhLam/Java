/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week3.B81;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akalis
 */
public class B81 {
    private JFrame frame;
    DefaultTableModel dtm;
    ArrayList<SinhVien> dsSv = new ArrayList<>();
    JTable tbl;
    private JTextField txtMa,txtTen,txt1,txt2,txtKQ,txtTB,txtLop;
    
    //Thêm một sinh mới vào cuối bảng
    protected void loadSV(){
        dtm.setRowCount(0);
        for (SinhVien sv:dsSv) {
            Vector<Object> vec = new Vector<>();
            vec.add(sv.getMa());
            vec.add(sv.getTen());
            vec.add(sv.getLop());
            vec.add(sv.getDiem1());
            vec.add(sv.getDiem2());
            vec.add(txtTB.getText());
            vec.add(txtKQ.getText());
            dtm.addRow(vec);
        }
    }
    private void initialize(){
        frame = new JFrame();
        frame.setBounds(100,100,730,571);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0,0));
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel,BorderLayout.WEST);
        
        Dimension minimumSize = new Dimension(200,100);
        panel.setMinimumSize(minimumSize);
        JPanel panel_1 = new JPanel();
        frame.getContentPane().add(panel_1,BorderLayout.CENTER);
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel,panel_1);
        
        JLabel lbl1 = new JLabel("Mã sinh viên");
        lbl1.setBounds(10,11,76,21);
        panel.add(lbl1);
        txtMa = new JTextField();
        txtMa.setBounds(10,43,180,20);
        txtMa.setColumns(10);
        panel.add(txtMa);
        
        JLabel lbl2 = new JLabel("Họ tên");
        lbl2.setBounds(10,74,76,21);
        panel.add(lbl2);
        txtTen = new JTextField();
        txtTen.setBounds(10,74,76,21);
        txtTen.setColumns(10);
        panel.add(txtTen);
        
        JLabel lbl3 = new JLabel("Mã lớp");
        lbl1.setBounds(10,11,76,21);
        panel.add(lbl3);
        txtLop = new JTextField();
        txtLop.setBounds(10,169,180,20);
        txtLop.setColumns(10);
        panel.add(txtLop);
        
        JLabel lbl4 = new JLabel("Điêm 1");
        lbl1.setBounds(10,200,76,21);
        panel.add(lbl4);
        txt1 = new JTextField();
        txt1.setBounds(10,232,180,20);
        txt1.setColumns(10);
        panel.add(txt1);
        
        JLabel lbl5 = new JLabel("Điêm 2");
        lbl1.setBounds(10,263,76,21);
        panel.add(lbl5);
        txt2 = new JTextField();
        txt2.setColumns(10);
        txt2.setBounds(10,295,180,20);
        panel.add(txt2);
        
        JLabel lbl6 = new JLabel("Điểm trung bình");
        lbl1.setBounds(10,333,76,21);
        panel.add(lbl6);
        txtTB = new JTextField();
        txtTB.setEditable(false);
        txtTB.setEnabled(false);
        txtTB.setColumns(10);
        txtTB.setBounds(10,365,180,20);
        panel.add(txtTB);
        
        JLabel lbl7 = new JLabel("Kết quả");
        lbl1.setBounds(10,396,76,21);
        panel.add(lbl7);
        txtKQ = new JTextField();
        txtKQ.setEditable(false);
        txtKQ.setEnabled(false);
        txtKQ.setColumns(10);
        txtKQ.setBounds(10,428,180,20);
        panel.add(txtKQ);
        
        //Taọ button "Kết quả" và thêm sự kiện
        JButton btKQ = new JButton("Kết quả");
        btKQ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if (!txt1.getText().isEmpty() && !txt2.getText().isEmpty()) {
                    txtTB.setText(String.valueOf(Double.parseDouble(txt1.getText())+Double.parseDouble(txt2.getText())/2));
                    if (Double.parseDouble(txtTB.getText())>=5) {
                        txtKQ.setText("Đậu");
                    }
                    else{
                        txtKQ.setText("Rớt");
                    }
                }
            }
        });
        btKQ.setBounds(10,459,89,23);
        panel.add(btKQ);
        
        JButton btThem = new JButton("Thêm");
        btThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                SinhVien sv = new SinhVien();
                sv.setMa(txtMa.getText());
                sv.setTen(txtTen.getText());
                sv.setLop(txtMa.getText());
                sv.setDiem1(Double.parseDouble(txt1.getText()));
                sv.setDiem2(Double.parseDouble(txt2.getText()));
                dsSv.add(sv);
                loadSV();
            }
        });
        btThem.setBounds(109,459,89,23);
        panel.add(btThem);
        
        JButton btXoa = new JButton("Xóa");
        btXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int row = tbl.getSelectedRow();
                if (row ==-1) {
                    return;
                }
                else{
                    dsSv.remove(row);
                }
                loadSV();
            }
        });
        btXoa.setBounds(52,496,89,23);
        panel.add(btXoa);
        
        //Tạo bảng và thêm cột mới vào bảng
        panel_1.setLayout(new BorderLayout());
        frame.getContentPane().add(sp);
        dtm = new DefaultTableModel();
        dtm.addColumn("Mã SV");
        dtm.addColumn("Tên SV");
        dtm.addColumn("Mã lớp");
        dtm.addColumn("Điểm 1");
        dtm.addColumn("Điểm 2");
        dtm.addColumn("Điểm TB");
        tbl = new JTable(dtm);
        tbl.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int row = tbl.getSelectedRow();
                if (row == -1) {
                    return;
                }
                else{
                    txtMa.setText((String)tbl.getValueAt(row, 0));
                    txtTen.setText((String)tbl.getValueAt(row, 1));
                    txtLop.setText((String)tbl.getValueAt(row, 2));
                    txt1.setText(String.valueOf((double) tbl.getValueAt(row, 3)));
                    txt1.setText(String.valueOf((double) tbl.getValueAt(row, 4)));
                    txtKQ.setText(String.valueOf(((Double.parseDouble(txt1.getText())+Double.parseDouble(txt2.getText())/2))));
                    if (Double.parseDouble(txtKQ.getText())>=5) {
                        txtKQ.setText("Đậu");
                    }
                    else{
                        txtKQ.setText("Rớt");
                    }
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
        JScrollPane sc = new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel_1.add(sc,BorderLayout.CENTER);
    }
    
    public B81(){
        initialize();
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    try{
                        B81 ui = new B81();
                        ui.frame.setVisible(true);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            
        });
    }
    
}
