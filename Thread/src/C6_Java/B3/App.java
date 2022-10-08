package C6_Java.B3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App {
    JFrame frame;
    Thread thread;
    JProgressBar pb;
    Random rd;

    private void addControls(){
        Container con = frame.getContentPane();
        con.setLayout(new FlowLayout());
        pb = new JProgressBar();
        pb.setStringPainted(true);
        con.add(pb);
        JButton btn = new JButton("Start");
        //Tạo sự kiện click
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Khai báo Thread và truyền vào class ProgressBar
                Thread th = new Thread(new Progressbar(pb));
                th.start();
            }
        });
        con.add(btn);
    }
    public App(){
        rd = new Random();
        frame = new JFrame("JProgressBar Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,100);
        frame.setLocationRelativeTo(null);
        addControls();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        App app = new App();
    }
}
