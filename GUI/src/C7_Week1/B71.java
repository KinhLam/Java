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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
/**
 *
 * @author Akalis
 */
public class B71 extends JFrame{
    DefaultListModel modelTen, modelOut;
    JList<String> lst;
    JList<String> lst1;
    JButton btC;
    
    private void addControls(){
        Container con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        //Tạo danh sách
        modelTen = new DefaultListModel<>();
        modelTen.addElement("Black");
        modelTen.addElement("Blue");
        modelTen.addElement("Dark");
        
        lst = new JList<>(modelTen);
        
        //Tạo thành kéo
        JScrollPane sc = new JScrollPane(lst, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        lst.setVisibleRowCount(5);
        lst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        btC = new JButton("Coppy>>");
        Font ft = new Font("Arial", Font.BOLD,20);
        btC.setFont(ft);
        modelOut = new DefaultListModel<>();
        String[]arr=docTextFile("data");
        if (arr!=null) {
            for (int i = 0; i < arr.length; i++) {
                modelOut.addElement(arr[i]);
            }
        }
        
        lst1 = new JList<>(modelOut);
        lst1.setVisibleRowCount(5);
        JScrollPane sc1 = new JScrollPane(lst, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        con.add(sc);
        con.add(btC);
        con.add(sc1);
    }
    
    private void addEvents(){
        btC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] arr = lst.getSelectedValues();
                for (Object data: arr) {
                    modelOut.addElement(data);
                }
                lst1.setModel(modelOut);
                String data="";
                for(int i = 0; i < lst1.getModel().getSize(); i++) {
                    data+=String.valueOf(lst1.getModel().getElementAt(i))+";";
                }
               luuTextFile("data",data);
            }
        });
    }
    
    //Lưu file text sang danh sách mới và xuất ra màn hình
    void luuTextFile(String filename, String data){
        try{
            FileOutputStream fOut = new FileOutputStream(filename);
            PrintWriter print = new PrintWriter(fOut, true);
            print.println(data);
            print.close();
            fOut.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    //Đọc các dự liệu từ danh sách cũ sáng danh sách mới
    String[] docTextFile(String filename){
        try{
            FileInputStream fIn = new FileInputStream(filename);
            Scanner sc = new Scanner(fIn);
            String[] data= null;
            while (sc.hasNextLine()){
                String s = sc.nextLine();
                data = s.split(";");
            }
            fIn.close();
            sc.close();
            return data;
        }
        
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    
    
    
    public B71(){
        super("Demo Windows");  
        addControls();
        addEvents();
        
    }
    public static void main(String[] args){
        B71 ui = new B71();
        ui.setSize(400, 150);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
