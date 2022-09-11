/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week3.B83;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Akalis
 */
public class B83 {

    private JFrame frame;
    private JTextField txtMa, txtTen;

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 561, 504);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.WEST);

        JPanel panel_1 = new JPanel();
        frame.getContentPane().add(panel_1, BorderLayout.CENTER);

        Dimension minimumSize = new Dimension(200, 100);
        panel.setMinimumSize(minimumSize);
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel, panel_1);
        panel_1.setLayout(null);

        JLabel lblN = new JLabel("Mã SV");
        Font f = new Font("Tahoma", Font.BOLD, 13);
        lblN.setFont(f);
        lblN.setBounds(10, 11, 92, 28);
        panel_1.add(lblN);
        txtMa = new JTextField();
        txtMa.setFont(f);
        txtMa.setBounds(112, 11, 216, 28);
        panel_1.add(txtMa);
        txtMa.setColumns(10);

        JLabel lblHT = new JLabel("Họ tên");
        lblHT.setFont(f);
        lblHT.setBounds(10, 55, 92, 28);
        panel_1.add(lblHT);
        txtTen = new JTextField();
        txtTen.setFont(f);
        txtTen.setBounds(112, 55, 216, 28);
        txtTen.setColumns(10);
        panel_1.add(txtTen);

        JLabel lblGT = new JLabel("Giới tính");
        lblGT.setFont(f);
        lblGT.setBounds(10, 94, 92, 28);
        panel_1.add(lblGT);
        JCheckBox chkB = new JCheckBox("Nam");
        chkB.setFont(f);
        chkB.setBounds(112, 90, 97, 32);
        panel_1.add(chkB);

        //Tạo lớp Jtree để hiện thị dữ liệu có cấu trúc cây và dự liệu phân cấp
        JTree tree = new JTree();

        //Tạo button và thêm sự kiện cho Button
        JButton btT = new JButton("Thêm");
        btT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                SinhVien sv = new SinhVien();
                sv.setMa(txtMa.getText());
                sv.setTen(txtTen.getText());
                if (chkB.isSelected()) {
                    sv.setGt("Nam");
                } else {
                    sv.setGt("Nữ");
                }
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(sv);
                selectedNode.add(newNode);
                DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
                model.reload();
            }
        });
        btT.setFont(f);
        btT.setBounds(39, 145, 89, 43);
        panel_1.add(btT);

        //Tạo button Xóa
        JButton btXoa = new JButton("Xóa");
        btXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
                if (selectedNode != tree.getModel().getRoot()) {
                    DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
                    model.removeNodeFromParent(selectedNode);
                    model.reload();
                }
            }
        });
        btXoa.setFont(f);
        btXoa.setBounds(168, 145, 89, 43);
        panel_1.add(btXoa);
        panel.setLayout(new BorderLayout(0, 0));

        tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Tree")));
        panel.add(tree, BorderLayout.CENTER);
        frame.getContentPane().add(sp);
    }

    public B83() {
        initialize();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                try {
                    B83 ui = new B83();
                    ui.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
