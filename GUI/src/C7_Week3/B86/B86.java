/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week3.B86;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;



/**
 *
 * @author Akalis
 */
public class B86  extends JFrame{
    private static final long serialVersionUID=1L;
    private int pos = 1;
    Timer timer;
    
//    //Thêm hình vào mảng
//    private void addImage(JPanel pnCenter,JPanel[] pnArr){
//        for (int i = 0; i < pnArr.length; i++) {
//            pnArr[i]= new JPanel();
//            JLabel lbl = new JLabel();
//            ImageIcon icon = new ImageIcon("D:\\"+i+"png");
//            lbl.setIcon(icon);
//            pnArr[i].add(lbl);
//            pnCenter.add(pnArr[i],"card"+1);
//        }
//    }
    
    //Hiện thị hình ra màn hình
//    private void showImage(JPanel pnCenter, String string){
//        CardLayout cl = (CardLayout) pnCenter.getLayout();
//        cl.show(pnCenter, string);
//    }

    private void addImage(JLabel pnCenter, JPanel[] pnArr) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                for (int i = 0; i < pnArr.length; i++) {
            pnArr[i]= new JPanel();
            JLabel lbl = new JLabel();
            ImageIcon icon = new ImageIcon("C:\\Users\\Akalis\\Documents\\GitHub\\Java\\GUI\\src\\C7_Week3\\B86\\Image\\"+i+".png");
            lbl.setIcon(icon);
            pnArr[i].add(lbl);
            pnCenter.add(pnArr[i],"card"+1);
        }
    }

    private void showImage(JLabel pnCenter, String card) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                CardLayout cl = (CardLayout) pnCenter.getLayout();
        cl.show(pnCenter, card);
    }
    
    //Tạo slide Chuyển hình 
    private class TimerPanel implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            showImage(pn,"card"+pos);
            pos++;
            if (pos>=10) {
                pos=1;
            }
        }
        JPanel pn = null;
        public TimerPanel(JPanel pn){
            this.pn = pn;
        }

        private void showImage(JPanel pn, String string) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }


        
    }
    private void addControls(){
        JPanel pnBoder = new JPanel();
        pnBoder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        JButton btStart = new JButton("Start");
        JButton btStop = new JButton("Stop");
        pnNorth.add(btStart);
        pnNorth.add(btStop);
        pnBoder.add(pnNorth,BorderLayout.NORTH);
        
        final JLabel pnCenter = new JLabel();
        pnCenter.setLayout(new CardLayout());
        pnBoder.add(pnCenter,BorderLayout.CENTER);
        pnCenter.setBackground(Color.red);
        JPanel[] pnArr = new JPanel[10];
        addImage(pnCenter, pnArr);
        showImage(pnCenter, "card");
        
        btStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                timer.start();
                timer.addActionListener(new TimerPanel(pnBoder));
            }
        });
        btStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ///throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                timer.stop();
            }
        });
        Container con = getContentPane();
        con.add(pnBoder);
    }
    
    public B86(String title){
        super(title);
        timer = new Timer(500, null);
    }
    
    public void doShow(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addControls();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        B86 ui=new B86("Image animation!");
        ui.doShow();
    }

}



