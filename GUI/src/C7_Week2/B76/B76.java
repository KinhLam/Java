/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week2.B76;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author Akalis
 */
public class B76 {
    private JFrame frame;
    JPanel panel;
    JLabel label_1,label,label_2;
    JSlider slider_1, slider_2,slider;
    
    private void initialize(){
        frame = new JFrame();
        frame.setBounds(100,100,450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        //Dòng chỉnh màu thứ 1
        slider = new JSlider();
        slider.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent arg0){
                label_2.setText("Red"+slider.getValue());
                panel.setBackground(new Color(slider.getValue(),slider_1.getValue(),slider_2.getValue()));
            }
        });
        slider.setMaximum(250);
        slider.setBounds(10,32,200,26);
        frame.getContentPane().add(slider);
        
        //Dòng chỉnh màu thứ 2
        slider_1=new JSlider();
        slider_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e){
                label.setText("Blue"+slider_1.getValue());
                panel.setBackground(new Color(slider.getValue(),slider_1.getValue(),slider_2.getValue()));
            }
        });
        slider_1.setBounds(10,112,200,26);
        frame.getContentPane().add(slider_1);
        
        //Dòng chỉnh màu thứ 3
        slider_2= new JSlider();
        slider_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e){
                label_1.setText("Green" + slider_2.getValue());
                panel.setBackground(new Color(slider.getValue(),slider_1.getValue(),slider_2.getValue()));
            }
        });
        slider_2.setBounds(10,198,200,26);
        frame.getContentPane().add(slider_2);
        
        panel = new JPanel();
        panel.setBounds(194,50,130,130);
        frame.getContentPane().add(panel);
        
        label_2=new JLabel("Red");
        label_2.setBounds(10,11,93,20);
        frame.getContentPane().add(label_2);
        
        label=new JLabel("Blue");
        label.setBounds(10,83,93,20);
        frame.getContentPane().add(label);
        
        label_1=new JLabel("Green");
        label_1.setBounds(10,163,96,20);
        frame.getContentPane().add(label_1);
        
        panel.setBackground(new Color(slider.getValue(),slider_1.getValue(),slider_2.getValue()));
    }
    
    public B76(){
        initialize();
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    B76 window = new B76();
                    window.frame.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
