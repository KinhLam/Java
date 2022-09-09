/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week3.B80;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akalis
 */
public class B80 {

    private JFrame frame;
    String danhmucSelected = "";
    ArrayList<SanPham> lst;
    DefaultTableModel dtm;
    JTable tbl;
    JList list;
    private JTextField txtID, txtQ, txtName, txtPrice;
    SanPham sp3;
    private JTextField txtTxtD;

    @SuppressWarnings({"unchecked", "rawtypes"})
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 772, 591);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Tạo menu số
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu mnMenu = new JMenu("File");
        menuBar.add(mnMenu);

        JMenu mnMenu_1 = new JMenu("Write Data toDisk");
        mnMenu.add(mnMenu_1);

        JMenu mnMenu_2 = new JMenu("Open Data from Disk");
        mnMenu.add(mnMenu_2);

        mnMenu.add(new JSeparator());

        JMenu mnMenu_3 = new JMenu("Exit");
        mnMenu_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                System.exit(0);
            }
        });
        mnMenu.add(mnMenu_3);
        frame.getContentPane().setLayout(null);

        //Tạo title cho cửa sổ
        JLabel lblNew = new JLabel("Quản lý sản phẩm");
        lblNew.setForeground(Color.BLUE);
        lblNew.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNew.setHorizontalAlignment(SwingConstants.CENTER);
        lblNew.setBounds(10, 11, 736, 45);
        frame.getContentPane().add(lblNew);

        JPanel panel = new JPanel();
        panel.setBounds(10, 52, 736, 479);
        frame.getContentPane().add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        JPanel panel_1 = new JPanel();
        panel.add(panel_1, BorderLayout.WEST);
        LineBorder lineBorder = new LineBorder(Color.RED);
        panel_1.setBorder(BorderFactory.createTitledBorder(lineBorder, "Danh mục sản phẩm"));

        JPanel panel_2 = new JPanel();
        panel.add(panel_2, BorderLayout.CENTER);

        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel_1, panel_2);
        panel_2.setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setBounds(10, 11, 509, 169);

        panel_2.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));

        //Tạo bảng và thêm cột mới vào bảng
        JLabel lblNew_1 = new JLabel("Thông tin chi tiết");
        lblNew_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNew_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(lblNew_1, BorderLayout.NORTH);
        dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Name");
        dtm.addColumn("UnitPrice");
        dtm.addColumn("Quantity");
        dtm.addColumn("Description");
        tbl = new JTable(dtm);
        JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        tbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int row = tbl.getSelectedRow();
                if (row == -1) {
                    return;
                } else {
                    sp3 = new SanPham();
                    sp3.setID((String) tbl.getValueAt(row, 0));
                    sp3.setName((String) tbl.getValueAt(row, 1));
                    sp3.setPrice((int) tbl.getValueAt(row, 2));
                    sp3.setQuantity((int) tbl.getValueAt(row, 3));
                    sp3.setDesciption((String) tbl.getValueAt(row, 4));

                    txtID.setText(sp3.getID());
                    txtName.setText(sp3.getName());
                    txtPrice.setText(String.valueOf(sp3.getPrice()));
                    txtQ.setText(String.valueOf(sp3.getQuantity()));
                    txtTxtD.setText(sp3.getDesciption());

                }
            }
        });
        panel_3.add(sc, BorderLayout.CENTER);

        JLabel lblNew_2 = new JLabel("Category: ");
        lblNew_2.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNew_2.setBounds(111, 191, 98, 20);
        panel_2.add(lblNew_2);

        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Mặt hàng điện tử", "Mặt hàng hóa chất", "Mặt hàng gia dụng", "Hang hàng"}));
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
        comboBox.setBounds(258, 191, 207, 20);
        panel_2.add(comboBox);

        JLabel lblID = new JLabel("ID");
        lblID.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblID.setBounds(111, 222, 98, 20);
        panel_2.add(lblID);

        txtID = new JTextField();
        txtID.setFont(new Font("Tahoma", Font.BOLD, 13));
        txtID.setBounds(258, 222, 207, 20);
        panel_2.add(txtID);
        txtID.setColumns(10);

        txtName = new JTextField();
        txtName.setFont(new Font("Tahoma", Font.BOLD, 13));
        txtName.setBounds(258, 253, 207, 20);
        txtName.setColumns(10);
        panel_2.add(txtName);

        JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblName.setBounds(111, 253, 98, 20);
        panel_2.add(lblName);

        txtPrice = new JTextField();
        txtPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
        txtPrice.setColumns(10);
        txtPrice.setBounds(258, 284, 207, 20);
        panel_2.add(txtPrice);

        JLabel lblPrice = new JLabel("Unit Price");
        lblPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPrice.setBounds(111, 284, 98, 20);
        panel_2.add(lblPrice);

        txtQ = new JTextField();
        txtQ.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtQ.setColumns(10);
        txtQ.setBounds(258, 315, 207, 20);
        panel_2.add(txtQ);

        JLabel lblQuantity = new JLabel("Quantity");
        lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblQuantity.setBounds(111, 315, 98, 20);
        panel_2.add(lblQuantity);

        JLabel lblDescription = new JLabel("Description");
        lblDescription.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblDescription.setBounds(111, 365, 98, 37);
        panel_2.add(lblDescription);
        txtTxtD = new JTextField();
        txtTxtD.setFont(new Font("Tahoma", Font.BOLD, 13));
        txtTxtD.setBounds(258, 346, 207, 74);
        txtTxtD.setColumns(10);
        panel_2.add(txtTxtD);

        //Tạo button "New" và thêm sự kiện cho button
        JButton btNew = new JButton("New");
        btNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                SanPham sp = new SanPham();
                sp.setDanhmuc((String) comboBox.getSelectedItem());
                sp.setID(txtID.getText());
                sp.setName(txtName.getText());
                sp.setPrice(Integer.parseInt(txtPrice.getText()));
                sp.setQuantity(Integer.parseInt(txtQ.getText()));
                sp.setDesciption(txtTxtD.getText());
                lst.add(sp);
                for (SanPham sp1 : lst) {
                    if (sp1.getDanhmuc().equals((String) list.getSelectedValue())) {
                        Vector<Object> vec = new Vector<>();
                        vec.add(sp1.getID());
                        vec.add(sp1.getName());
                        vec.add(sp1.getPrice());
                        vec.add(sp1.getQuantity());
                        vec.add(sp1.getDesciption());
                        dtm.addRow(vec);
                    }
                }
            }
        });
        btNew.setFont(new Font("Tahoma", Font.BOLD, 13));
        btNew.setBounds(93, 437, 89, 29);
        panel_2.add(btNew);

        //Tạo button "Save" và thêm sự kiện cho buttonn
        JButton btSave = new JButton("Save");
        btSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                dtm.setRowCount(0);
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getID().equals(sp3.getID()) && lst.get(i).getName().equals(sp3.getName())) {
                        lst.remove(i);
                        break;
                    }
                }
                sp3.setDanhmuc((String) comboBox.getSelectedItem());
                sp3.setID(txtID.getText());
                sp3.setName(txtName.getText());
                sp3.setPrice(Integer.parseInt(txtPrice.getText()));
                sp3.setQuantity(Integer.parseInt(txtQ.getText()));
                sp3.setDesciption(txtTxtD.getText());
                lst.add(sp3);
                for (SanPham sp1 : lst) {
                    if (sp1.getDanhmuc().equals((String) list.getSelectedValue())) {
                        Vector<Object> vec = new Vector<>();
                        vec.add(sp1.getID());
                        vec.add(sp1.getName());
                        vec.add(sp1.getPrice());
                        vec.add(sp1.getQuantity());
                        vec.add(sp1.getDesciption());
                        dtm.addRow(vec);
                    }
                }
            }
        });
        btSave.setFont(new Font("Tahoma", Font.BOLD, 13));
        btSave.setBounds(208, 437, 89, 29);
        panel_2.add(btSave);

        JButton btRemove = new JButton("Remove");
        btRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int row = tbl.getSelectedRow();
                if (row == -1) {
                    return;
                } else {
                    SanPham sp = new SanPham();
                    sp.setID((String) tbl.getValueAt(row, 0));
                    sp.setName((String) tbl.getValueAt(row, 1));
                    for (int i = 0; i < lst.size(); i++) {
                        if (lst.get(i).getID().equals(sp.getID()) && lst.get(i).getName().equals(sp.getName())) {
                            lst.remove(i);
                            break;
                        }
                    }
                    dtm.setRowCount(0);
                    for (SanPham sp1 : lst) {
                        if (sp1.getDanhmuc().equals((String) list.getSelectedValue())) {
                            Vector<Object> vec = new Vector<>();
                            vec.add(sp1.getID());
                            vec.add(sp1.getName());
                            vec.add(sp1.getPrice());
                            vec.add(sp1.getQuantity());
                            vec.add(sp1.getDesciption());
                            dtm.addRow(vec);
                        }
                    }
                }
            }
        });
        btRemove.setFont(new Font("Tahoma", Font.BOLD, 13));
        btRemove.setBounds(334, 437, 89, 29);
        panel_2.add(btRemove);
        Dimension minimumSize = new Dimension(200, 100);
        panel_1.setMinimumSize(minimumSize);
        panel_1.setLayout(new BorderLayout(0, 0));

        //Thêm một danh sách vào cuối bảng
        list = new JList();
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                dtm.setRowCount(0);
                for (SanPham sp : lst) {
                    Vector<Object> vec = new Vector<>();
                    vec.add(sp.getID());
                    vec.add(sp.getName());
                    vec.add(sp.getPrice());
                    vec.add(sp.getQuantity());
                    vec.add(sp.getDesciption());
                    dtm.addRow(vec);
                }
            }
        });
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setFont(new Font("Tahoma", Font.BOLD, 13));
        list.setModel(new AbstractListModel() {
            String[] values = new String[]{"Mặt hàng điện tử", "Mặt hàng hóa chất", "Mặt hàng gia dụng", "Mặt hang hang"};

            @Override
            public int getSize() {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                return values.length;
            }

            @Override
            public Object getElementAt(int index) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                return values[index];
            }
        });
        panel_1.add(list, BorderLayout.CENTER);
        panel.add(sp);
        lst = new ArrayList<>();
    }

    public B80() {
        initialize();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
//            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                try {
                    B80 ui = new B80();
                    ui.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
