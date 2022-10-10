package C6_Java_B5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum SORTTYPE{BUBBLE_SORT, SELECTION_SORT, INSERTION_SORT, QUICK_SORT};
public class MyNumberFrame extends JFrame {
    public static SORTTYPE SortType = SORTTYPE.BUBBLE_SORT;
    MyNumberPanel pnCenter = null;
    JTextField txtNumber = null;
    public void drawControl(){
        int num = Integer.parseInt(txtNumber.getText());
        MyNumber.COLOR1 = Color.BLACK;
        pnCenter.addNumbers(num);
        pnCenter.repaint();
    }

    //Tạo hàm addControl
    public void addControl(){
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        con.add(pnNorth,BorderLayout.NORTH);
        JPanel pnNorthBorder = new JPanel();
        pnNorthBorder.setLayout(new BoxLayout(pnNorthBorder,BoxLayout.Y_AXIS));
        JPanel pnNorthBorderLine1 = new JPanel();
        JLabel lblNumber = new JLabel("Number of: ");
        txtNumber = new JTextField(3);
        JButton btnDraw = new JButton("Draw");
        pnNorthBorderLine1.add(lblNumber);
        pnNorthBorderLine1.add(txtNumber);
        pnNorthBorderLine1.add(btnDraw);

        JPanel pnNorthBorderLine2 = new JPanel();
        pnNorthBorderLine2.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnNorthBorderLine1.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel lblAlgorithm = new JLabel("Algorithm: ");
        final JComboBox cboAlgorithm = new JComboBox(new String[]{"Bubble sort","Selection sort","Insertion sort","Quick sort"});
        JButton btnSort = new JButton("Start Sort");
        pnNorthBorderLine2.add(lblAlgorithm);
        pnNorthBorderLine2.add(cboAlgorithm);
        pnNorthBorderLine2.add(btnSort);

        pnNorthBorder.add(pnNorthBorderLine1);
        pnNorthBorder.add(pnNorthBorderLine2);

        pnNorthBorderLine1.setBackground(Color.LIGHT_GRAY);
        pnNorthBorderLine2.setBackground(Color.LIGHT_GRAY);

        con.add(pnNorthBorder,BorderLayout.NORTH);
        pnCenter = new MyNumberPanel();
        con.add(pnCenter,BorderLayout.CENTER);

        //Thêm sự kiện button
        btnDraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawControl();
            }
        });
        btnSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = cboAlgorithm.getSelectedIndex();
                switch (n){
                    case 0:
                        SortType = SORTTYPE.BUBBLE_SORT;
                        break;
                    case 1:
                        SortType = SORTTYPE.SELECTION_SORT;
                        break;
                    case 2:
                        SortType = SORTTYPE.INSERTION_SORT;
                        break;
                    case 3:
                        SortType = SORTTYPE.QUICK_SORT;
                        break;
                }
                System.out.println(n);
                MyNumberPanelRunable run = new MyNumberPanelRunable(pnCenter);
                Thread th = new Thread(run);
                th.start();
            }
        });
    }

    public MyNumberFrame(){
        addControl();
        setSize(800,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
