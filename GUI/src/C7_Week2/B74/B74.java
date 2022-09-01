/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week2.B74;

import com.sun.jdi.event.EventQueue;
import static com.sun.tools.attach.VirtualMachine.list;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.nio.file.Files.list;
import static java.util.Collections.list;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Akalis
 */
public class B74 {
    private JFrame frame;
    private JTextField txtInput;
    
    private void initialize()
    {
        frame = new JFrame();
        frame.setBounds(100,100,450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0,0));
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.WEST);
        
        JPanel panel_1=new JPanel();
        frame.getContentPane().add(panel_1, BorderLayout.CENTER);
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel,panel_1);
        
        JLabel lblNewLabel = new JLabel("Input Name");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10,11,85,20);
        panel_1.add(lblNewLabel);
        
        
        txtInput = new JTextField();
        txtInput.setBounds(97,14,178,20);
        panel_1.add(txtInput);
        txtInput.setColumns(10);
        
        
        //Hàm Button Add Item
        JButton btAdd = new JButton("Add Item");
        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = txtInput.getText();
                demoList.addElement(s);
            }
        });
        btAdd.setBounds(10,48,89,23);
        panel_1.add(btAdd);
        
        //Hàm Button Remove
        JButton btRemoveItem = new JButton("Remove Item");
        btRemoveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        btRemoveItem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if (indexOf != -1) {
                    demoList.remove(indexOf);
                    indexOf = -1;
                }
            }
        });
        btRemoveItem.setBounds(107,48,106,23);
        panel_1.add(btRemoveItem);
        JButton btEditItem = new JButton("Edit Item");
        btEditItem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if (indexOf !=-1) {
                    demoList.remove(indexOf);
                    demoList.add(indexOf, txtInput.getText());
                }
            }
        });
        btEditItem.setBounds(228,48,89,23);
        panel_1.add(btEditItem);
        Dimension minimumSize = new Dimension(100,100);
        panel.setMaximumSize(minimumSize);
        panel.setLayout(new BorderLayout(0,0));
        demoList = new DefaultListModel<String>();
        list = new JList(demoList);
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0){
                if (list.getSelectedIndex()!=-1) {
                    indexOf = list.getSelectedIndex();
                    txtInput.setText(demoList.elementAt(indexOf));
                }
            }
        });
         
        panel.add(list,BorderLayout.CENTER);
        frame.getContentPane().add(sp);
    
    }
    int indexOf;
    DefaultListModel<String>demoList;
    JList list;
    
    public B74(){
        initialize();
    }
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    B74 window = new B74();
                    window.frame.setVisible(true);
                    window.frame.setLocationRelativeTo(null);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
