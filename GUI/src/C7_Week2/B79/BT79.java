/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week2.B79;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.HTML;

/**
 *
 * @author Akalis
 */
public class BT79 {
    private JTextField txt1,txt2,txtChuan,txtLuong;
    private JFrame frame;
    DefaultTableModel dtm;
    JTable tbl;
    public static ArrayList<NhanVien> ds = new ArrayList<>();
    
    protected void loadNV(){
        dtm.setRowCount(0);
        for(NhanVien o:ds){
            
            Vector<Object> vec = new Vector<>();//Khởi tạo 1 danh sách mảng trống
            vec.add(o.getMaNV());
            vec.add(o.getPhanXuong());
            vec.add(o.getSoSp());
            
            if (Integer.parseInt(txt2.getText())>Integer.parseInt(txtChuan.getText())); {
                vec.add(("X"));
            }
            dtm.addRow(vec);
        }
    }
    
    private void initialize(){
        frame = new JFrame();
        frame.setBounds(100,100,613,580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Mã nhân viên");
        lblNewLabel.setFont(new Font("Tahoma",Font.BOLD,14));
        lblNewLabel.setBounds(10,11,183,35);
        frame.getContentPane().add(lblNewLabel);
        
        //Tạo thanh nhập mã Nhân viên
        txt1 = new JTextField();
        txt1.setFont(new Font("Tahoma",Font.BOLD,14));
        txt1.setBounds(203,11,384,35);
        frame.getContentPane().add(txt1);
        txt1.setColumns(10);
        
        JLabel lblSSp = new JLabel("Số sản phẩm");
        lblSSp.setFont(new Font("Tahoma",Font.BOLD,14));
        lblSSp.setBounds(10,57,183,35);
        frame.getContentPane().add(lblSSp);
        
        //Tạo thanh nhập số sản phẩm
        txt2 = new JTextField();
        txt2.setFont(new Font("Tahoma",Font.BOLD,14));
        txt2.setBounds(203,57,384,35);
        frame.getContentPane().add(txt2);
        
        JLabel lblPX = new JLabel("Phân xưởng");
        lblPX.setFont(new Font("Tahoma",Font.BOLD,14));
        lblPX.setBounds(10,103,111,35);
        frame.getContentPane().add(lblPX);
        
        //Tạo menu phân xưởng
        JComboBox comboBox = new JComboBox();
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if (comboBox.getSelectedIndex()!=0) {
                    txtChuan.setText("500");
                }
                else{
                    txtChuan.setText("300");
                }
            }
        });
        comboBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e){
                
            }
        });
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"A","B","C","D"}));
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        comboBox.setBounds(116,103,111,29);
        frame.getContentPane().add(comboBox);
        
        JLabel lblSSPc = new JLabel("Số sản phẩm chuẩn");
        lblSSPc.setFont(new Font("Tahoma",Font.BOLD,14));
        lblSSPc.setBounds(247,103,183,35);
        frame.getContentPane().add(lblSSPc);
        
        txtChuan = new JTextField();
        txtChuan.setText("300");
        txtChuan.setFont(new Font("Tahoma",Font.BOLD,14));
        txtChuan.setColumns(10);
        txtChuan.setBounds(450,103,104,35);
        frame.getContentPane().add(txtChuan);
        
        JLabel lblTL = new JLabel("Tiền Lương");
        lblTL.setFont(new Font("Tahoma",Font.BOLD,14));
        lblTL.setBounds(10,149,183,35);
        frame.getContentPane().add(lblTL);
        
        //Tạo dòng xuất tiền lương
        txtLuong = new JTextField();
        txtLuong.setBackground(Color.CYAN);
        txtLuong.setHorizontalAlignment(SwingConstants.CENTER);
        txtLuong.setEnabled(false);
        txtLuong.setForeground(Color.CYAN);
        txtLuong.setFont(new Font("Tahoma",Font.BOLD,14));
        txtLuong.setColumns(10);
        txtLuong.setBounds(203,149,384,35);
        frame.getContentPane().add(txtLuong);
        
        //Tạo button tính lương vầ tính lương nhân viên
        JButton btNewButton = new JButton("Tính lương");
        btNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if (!txt2.getText().isEmpty()) {
                    if (Integer.parseInt(txt2.getText())<=Integer.parseInt(txtChuan.getText())) {
                        txtLuong.setText(String.valueOf(new DecimalFormat("#,###").format((30000*(Integer.parseInt(txt2.getText()))))));
                    }
                    else{
                        txtLuong.setText(String.valueOf(new DecimalFormat("#,###").format((20000*Integer.parseInt(txt2.getText())-Integer.parseInt(txtChuan.getText())+30000*(Integer.parseInt(txt2.getText()))))));
                    }
                }
            }
        });
        btNewButton.setFont(new Font("Tahoma",Font.BOLD,14));
        btNewButton.setBounds(10,198,111,47);
        frame.getContentPane().add(btNewButton);
        
        //Tạo button "Them"
        JButton btThm = new JButton("Thêm");
        btThm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if (!txt2.getText().isEmpty()) {
                    NhanVien nv = new NhanVien();
                    nv.setMaNV(txt1.getText());
                    nv.setPhanXuong((String) comboBox.getSelectedItem());
                    nv.setSoSp(Integer.parseInt(txt2.getText()));
                    ds.add(nv);
                    loadNV();
                }
            }
        });
        btThm.setFont(new Font("Tahoma",Font.BOLD,14));
        btThm.setBounds(131,198,111,47);
        frame.getContentPane().add(btThm);
        
        //Tạo button xóa
        JButton btXoa = new JButton("Xóa");
        btXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int row = tbl.getSelectedRow();
                if (row == -1) {
                    return;
                }else{
                    ds.remove(row);
                }
                loadNV();
            }
        });
        btXoa.setFont(new Font("Tahoma",Font.BOLD,14));
        btXoa.setBounds(373,198,111,47);
        frame.getContentPane().add(btXoa);
        
        //Tạo button sửa
        JButton btSua = new JButton("Sửa");
        btSua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int row = tbl.getSelectedRow();
                if (row == -1) {
                    return;
                }else{
                    NhanVien nv =new NhanVien();
                    nv.setMaNV(txt1.getText());
                    nv.setSoSp(Integer.parseInt(txt2.getText()));
                    nv.setPhanXuong((String) comboBox.getSelectedItem());
                    ds.add(row,nv);
                    ds.remove(row+1);
                }
                loadNV();
            }
        });
        btSua.setFont(new Font("Tahoma",Font.BOLD,14));
        btSua.setBounds(252,198,111,47);
        frame.getContentPane().add(btSua);
        
        //Tạo button đóng
        JButton btDg = new JButton("Dong");
        btDg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.exit(0);
            }
        });
        btDg.setFont(new Font("Tahoma",Font.BOLD,14));
        btDg.setBounds(486,198,101,47);
        frame.getContentPane().add(btDg);
        
        //Tạo bảng
        JPanel panel = new JPanel();
        panel.setBounds(10,256,577,274);
        panel.setLayout(new BorderLayout());
        dtm = new DefaultTableModel();
        dtm.addColumn("Mã nhân viên");
        dtm.addColumn("Phân Xưởng");
        dtm.addColumn("Số Sản Phẩm");
        dtm.addColumn("Vượt chuẩn");
        tbl = new JTable(dtm);
        panel.setLayout(new BorderLayout());
        JScrollPane sc = new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(sc,BorderLayout.CENTER);
        frame.getContentPane().add(panel);
    }
    
    public BT79(){
        initialize();
    }
    
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                try{
                    BT79 ui=new BT79();
                    ui.frame.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
    
}
