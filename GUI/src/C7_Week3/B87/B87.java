/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week3.B87;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Akalis
 */
public class B87 extends JFrame {

    private static final long serialVersionUID = 1L;
    Timer timer;
    private int pos = 0;

    private void addControls() {
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        JButton btBrower = new JButton("Brower");
        JButton btStart = new JButton("Start");
        JButton btStop = new JButton("Stop");
        pnNorth.add(btBrower);
        pnNorth.add(btStart);
        pnNorth.add(btStop);
        pnBorder.add(pnNorth, BorderLayout.NORTH);

        final JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new CardLayout());
        pnBorder.add(pnCenter, BorderLayout.CENTER);
        pnCenter.setBackground(Color.red);

        btStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                timer.start();
                timer.addActionListener(new TimerPanel(pnCenter));
            }
        });
        btStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                timer.stop();
            }
        });
        btBrower.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                //Tạo JFileChooser hiển thị một hộp thoại cho người dùng để chọn một file hay thư muc
                JFileChooser jfc = new JFileChooser();
                jfc.setMultiSelectionEnabled(true);
                if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File[] files = jfc.getSelectedFiles();
                    for (int i = 0; i < files.length; i++) {
                        File f = files[i];
                        ImageIcon icon = new ImageIcon(f.getPath());
                        JPanel pn = new JPanel();
                        JLabel lbl = new JLabel(icon);
                        pn.add(lbl);
                        pnCenter.add(pn, "card" + i);
                    }
                    showImage(pnCenter, "card0");
                }
            }
        });
        Container con = getContentPane();
        con.add(pnBorder);
    }

    //Hiện hình lên cửa sổ
    private void showImage(JPanel pnCenter, String string) {
        CardLayout cl = (CardLayout) pnCenter.getLayout();
        cl.show(pnCenter, string);
    }

    //Tạo slide chuyển hình
    private class TimerPanel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            showImage(pn, "card" + pos);
            pos++;
            if (pos >= 10) {
                pos = 1;
            }
        }
        JPanel pn = null;

        public TimerPanel(JPanel pn) {
            this.pn = pn;
        }

    }
    
    public B87(String title){
        super(title);
        timer = new Timer(599, null);
    }
    
    public void doShow(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addControls();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        B87 i = new B87("Image animation!");
        i.doShow();
    }
}
