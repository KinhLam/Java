/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C7_Week1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author LHUser
 */
public class B63 extends JFrame{
    public B63(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.pink);
        JButton btn1=new JButton("FlowLayout");
        JButton btn2=new JButton("Thêm các điều khuyển");
        JButton btn3=new JButton("Kính Lâm");
        JButton btn4=new JButton("20CT111");
        JButton btn5=new JButton("Thi xuong dong");
        pnFlow.add(btn1);pnFlow.add(btn2);
        pnFlow.add(btn3);pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con = getContentPane();
        con.add(pnFlow);
        
    }
    public static void main(String[] args){
        B63 ui = new B63();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
//        JPanel pnFlow = new JPanel();
//        pnFlow.setLayout(new FlowLayout());
//        pnFlow.setBackground(Color.pink);
//        JButton btn1=new JButton("FlowLayout");
//        JButton btn2=new JButton("add cac control");
//        JButton btn3=new JButton("Tren 1 dong");
//        JButton btn4=new JButton("Het cho chua");
//        JButton btn5=new JButton("Thi xuong dong");
//        pnFlow.add(btn1);pnFlow.add(btn2);
//        pnFlow.add(btn3);pnFlow.add(btn4);
//        pnFlow.add(btn5);
//        Container con = getContentPane();
//        con.add(pnFlow);
    }
}
