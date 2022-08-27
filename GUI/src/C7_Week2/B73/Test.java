/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week2.B73;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Akalis
 */
public class Test extends JFrame{
    public static DefaultListModel<String>model;
    JList<String> lst;
    JButton btThem, btXoa;
    
    private void addControls(){
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        
        //Thêm button chức năng
        JPanel pnTop = new JPanel();
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        btThem = new JButton("Add Philosopher");
        pnTop.add(btThem);
        btXoa = new JButton("Remove Selected Philosopher");
        pnTop.add(btXoa);
        con.add(pnTop, BorderLayout.NORTH);
        
        
        //Tạo danh sách
        model = new DefaultListModel<>();
        model.addElement("Plato");
        model.addElement("Arisotle");
        lst = new JList<>(model);
        lst.setVisibleRowCount(5);
        lst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane sc = new JScrollPane(lst, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        con.add(sc,BorderLayout.CENTER);
    }
    
    //Thêm sự kiện Button
    private void addEvents(){
        //Xóa mục tiêu được chỉ định
        btXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k = lst.getSelectedIndex();
                if (k!=-1) {
                    ((DefaultListModel) lst.getModel()).remove(k);
                }
            }
        });
        
        //Mở bằng input
        btThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Input ui = new Input("Input");
                ui.showWindow();
            }
        });
    }
    
    public Test(){
        super("test");
        addControls();
        addEvents();
    }
    
    public static void main(String[] args){
        Test ui = new Test();
        ui.setSize(400,300);
       ui.setLocationRelativeTo(null);
       ui.setVisible(true);
    }
}
