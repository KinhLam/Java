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
public class BT63 extends JFrame{
    public BT63(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.pink);
        JButton btn1=new JButton("FlowLayout");
        JButton btn2=new JButton("add cac control");
        JButton btn3=new JButton("Tren 1 dong");
        JButton btn4=new JButton("Het cho chua");
        JButton btn5=new JButton("Thi xuong dong");
        pnFlow.add(btn1);pnFlow.add(btn2);
        pnFlow.add(btn3);pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con = getContentPane();
        con.add(pnFlow);
        
    }
    public static void main(String[] args){
        BT63 ui = new BT63();
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
