/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week2.B77;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akalis
 */
public class philosopher extends JFrame {

    JButton btThem, btXoa;
    static DefaultTableModel dtm;
    JTable tb;
    public static ArrayList<nguoi> ds = new ArrayList<>();

    private void addControls() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnTop = new JPanel();
        con.add(pnTop, BorderLayout.NORTH);
        btThem = new JButton("Add philosopher");
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnTop.add(btThem);

        btXoa = new JButton("Remove Selected Philosopher");
        pnTop.add(btXoa);

        //Tạo bảng và add các cột vào bảng
        JPanel pnMid = new JPanel();
        con.add(pnMid, BorderLayout.CENTER);
        dtm = new DefaultTableModel();
        dtm.addColumn("First Name");
        dtm.addColumn("Last Name");
        dtm.addColumn("Years");
        pnMid.setLayout(new BorderLayout());
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnMid.add(sc, BorderLayout.CENTER);
    }

    //Thêm một danh sách vào cuói trang
    protected static void loadData() {
        dtm.setRowCount(0);
        for (nguoi o : ds) {
            Vector<Object> vec = new Vector<>();
            vec.add(o.getFirstName());
            vec.add(o.getLastName());
            vec.add(o.getYears());

            dtm.addRow(vec);
        }
    }

    //Thêm sự kiện cho Button
    private void addEvents() {
        //Gọi cửa sổ philosopher
        btThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add a = new add();
                a.showWindown();
                loadData();
            }
        });

        btXoa.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int row = tb.getSelectedRow();
                if (row == -1) {
                    return;
                } else {
                    ds.remove(row);
                }
                loadData();
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

    public philosopher() {
        super("Test");
        addControls();
        addEvents();
    }

    public static void main(String[] args) {
        philosopher ui = new philosopher();
        ui.setSize(400, 350);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
