package C6_Java_B5;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyNumber {
    //Khai bao kích thước hình tròn
    public static final int XSIZE = 50;
    public static final int YSIZE = 50;

    //Khai báo vị trí hình tròn
    private double x = 0;
    private double y = 0;

    //Khai báo giá trị trên hình
    private int num = 0;
    private Graphics grap = null;

    //Khai báo Ellipse2D dùng đẻ vẽ hình elip
    private Ellipse2D face;
    public Ellipse2D getShape(){
        //Khởi tạo Ellipse2D từ tọa độ xác định
        face = new Ellipse2D.Double(x,y,XSIZE,YSIZE);
        return face;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Graphics getGrap() {
        return grap;
    }

    public void setGrap(Graphics grap) {
        this.grap = grap;
    }

    public Ellipse2D getFace() {
        return face;
    }

    public void setFace(Ellipse2D face) {
        this.face = face;
    }

    public MyNumber(int num, Graphics grap){
        this.grap = grap;
        this.num = num;
    }

    //Khai báo màu cho hình
    public static Color COLOR1 = Color.BLACK;
    public static Color COLOR2 = Color.RED;

    //Tạo hàm draw set màu và gí trị cho hình
    public void draw(){
        if (grap !=null){
            Graphics2D g = (Graphics2D) grap;
            g.setColor(COLOR1);
            g.fill(face);

            Font font = new Font("arial",Font.ITALIC | Font.BOLD,15);
            g.setFont(font);
            g.setColor(COLOR2);
            g.drawString(num+"",(float) x+18,(float) y+30);
        }
    }

    public MyNumber(){
        this.num = 0;
        this.grap = null;
    }

    @Override
    public String toString(){
        return this.num+"";
    }
}
