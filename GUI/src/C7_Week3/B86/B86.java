package C7_Week3.B86;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class B86 extends JFrame {

    private static final long serialVersionUID = 1L;
    Timer timer;
    private int pos = 1;

    public B86(String title) {
        super(title);
        timer = new Timer(500, null);
    }

    public void doShow() {
        setSize(500, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addControl();
        setVisible(true);
    }

    public void addControl() {
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");
        pnNorth.add(btnStart);
        pnNorth.add(btnStop);
        pnBorder.add(pnNorth, BorderLayout.NORTH);
        final JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new CardLayout());
        pnBorder.add(pnCenter, BorderLayout.CENTER);
        pnCenter.setBackground(Color.RED);
        JPanel[] pnArr = new JPanel[10];
        addImage(pnCenter, pnArr);
        showImage(pnCenter, "card1");
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                timer.start();
                timer.addActionListener(new TimerPanel(pnCenter));
            }
        });
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                timer.stop();
            }
        });
        Container con = getContentPane();
        con.add(pnBorder);
    }

    private void addImage(JPanel pnCenter, JPanel[] pnArr) {
        for (int i = 0; i < pnArr.length; i++) {
            pnArr[i] = new JPanel();
            JLabel lbl = new JLabel();
            ImageIcon icon = new ImageIcon("src\\C7_Week3\\B86\\Image\\" + i + ".JPG");
            lbl.setIcon(icon);
            pnArr[i].add(lbl);
            pnCenter.add(pnArr[i], "card" + i);
        }
    }

    public void showImage(JPanel pn, String cardName) {
        CardLayout cl = (CardLayout) pn.getLayout();
        cl.show(pn, cardName);
    }

    private class TimerPanel implements ActionListener {

        JPanel pn = null;

        public TimerPanel(JPanel pn) {
            this.pn = pn;
        }

        public void actionPerformed(ActionEvent arg0) {
            showImage(pn, "card" + pos);
            pos++;
            if (pos >= 10) {
                pos = 1;
            }
        }
    }

    public static void main(String[] args) {;
        B86 imgUi = new B86("Image	Animation!");
        imgUi.doShow();
    }
}
 