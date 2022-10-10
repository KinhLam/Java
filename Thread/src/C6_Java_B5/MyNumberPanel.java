package C6_Java_B5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class MyNumberPanel extends JPanel implements MouseListener  {
    private boolean isFinished = false;
    ArrayList<MyNumber> arr = new ArrayList<>();

    public boolean isFinished() {
        return isFinished;
    }

    public void addNumber(MyNumber number){
        arr.add(number);
    }

    //Tạo hàm thêm giá trị và vị trí hình
    public void addNumbers(int num){
        arr.clear();
        Random ran = new Random();
        for (int i = 0; i<num; i++){
            MyNumber number = new MyNumber(ran.nextInt(100), getGraphics());
            number.setX(i*MyNumber.YSIZE);
            number.setY(getBounds().getHeight()/2 - MyNumber.YSIZE);
            addNumber(number);
        }
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 =  (Graphics2D) g;
        for (int i=0;i<arr.size();i++) {
            MyNumber number = arr.get(i);
            number.setGrap(g2);
            number.draw();
        }
    }

    //Xuất ra vị trí hiện tại của giá trị
    public void printInfor(){
        for (MyNumber number : arr){
            System.out.println(number.getNum()+ "(x: "+number.getX()+",y: "+number.getY()+" ) ");
        }
    }

    //Hàm sắp xếp hình tròn
    public synchronized void moveControl(MyNumber number1, MyNumber number2){
        printInfor();
        //Khai báo vị trí của hình
        double x1 = number1.getX();
        double y1 = number1.getY();
        double x2 = number2.getX();
        double y2 = number2.getY();
        try{
            //Dùng vòng lặp cho hình đi lên
            for (int k = 0; k <50; k++){
                number1.setY(y1+k);
                number2.setY(y2-k);
                Thread.sleep(10);
                repaint();//Cập nhật lại vị trí
            }
            int k = 0;

            //Dùng vong lặp cho hình đi ngang
            while (number1.getX() <= x2-1){
                k++;
                number1.setX(x1+ k);
                number2.setX(x2 - k);
                Thread.sleep(10);
                repaint();
            }
            y1 = number1.getY();
            y2 = number2.getY();

            //Dùng vòng lặp cho hình đi xuống
            for (k=1;k<50;k++){
                number1.setY(y1-k);
                number2.setY(y2+k);
                Thread.sleep(10);
                repaint();
            }
        }catch(InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    //Tạo hàm đồng bộ
    //Tạo hàm sắp xêp các giá trị từ nhỏ đến lớn
    public synchronized void boBubbleSort(){
        try{
            isFinished = false;
            //Dùng vòng lặp lồng nhau để ktra giá trị
            for (int i = 0; i<arr.size();i++){
                for (int j = i+1;i<arr.size();j++){
                    MyNumber number1 = arr.get(i);
                    MyNumber number2 = arr.get(j);
                    if (number1.getNum() > number2.getNum()){
                        //Gọi hàm moveControl để thay đổi vị trí của hình
                        moveControl(number1,number2);
                        MyNumber nt1 = number1;
                        number1 = number2;
                        number1 = nt1;
                        arr.set(i, number1);
                        arr.set(j, number2);
                    }
                }
            }
            isFinished = true;
            System.out.println("----------");
            printInfor();
            MyNumber.COLOR1 = Color.BLUE;
            repaint();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public synchronized void doSelectionSort(){
        try{
            isFinished = false;
            //Duyệt từ 1 đến size -1
            for (int i = 0; i<arr.size() -1;i++){
                //Set min tại vị trí ban đầu
                int min_id = i;
                //Vòng lặp từ i +1 đến size
                for (int j = i+1;i<arr.size();j++){
                    //Ktra nếu
                    if (arr.get(min_id).getNum() > arr.get(j).getNum()){
                        min_id = j;
                    }
                }
                //Nếu min_id khác i thì thay đổi vị trí của hình
                //swap
                if (min_id != i){
                    MyNumber number1 = arr.get(min_id);
                    MyNumber number2 = arr.get(i);

                    moveControl(number2, number1);
                    MyNumber nt1 = number1;
                    number1 = number2;
                    number2 = nt1;
                    arr.set(min_id, number1);
                    arr.set(i, number2);
                }
            }
            isFinished = true;
            System.out.println("----------");
            printInfor();
            MyNumber.COLOR1 = Color.BLUE;
            repaint();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public synchronized void doInsertionSort(){
        try{
            isFinished = false;
            //Duyệt từ 1 đến size -1
            for (int i = 0; i<arr.size();i++){
                int j = i -1;

                while (j >= 0 && arr.get(j).getNum()>arr.get(j+1).getNum()){
                    MyNumber number1 = arr.get(j);
                    MyNumber number2 = arr.get(j+1);

                    moveControl(number2, number1);
                    MyNumber nt1 = number1;
                    number1 = number2;
                    number2 = nt1;
                    arr.set(j, number1);
                    arr.set(j+1, number2);
                    j--;
                }
            }
            isFinished = true;
            System.out.println("----------");
            printInfor();
            MyNumber.COLOR1 = Color.BLUE;
            repaint();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public synchronized void doQuickSort(){
        try{
            isFinished = false;

            quickSort(arr, 0, arr.size()-1);

            isFinished = true;
            System.out.println("----------");
            printInfor();
            MyNumber.COLOR1 = Color.BLUE;
            repaint();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private synchronized void quickSort(ArrayList<MyNumber> arr, int low, int high) {
        if (low <high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    private synchronized int partition(ArrayList<MyNumber> arr, int low, int high) {
        MyNumber pivot = arr.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr.get(j).getNum() < pivot.getNum()) {
                i++;
                MyNumber num1 = arr.get(i);
                MyNumber num2 = arr.get(j);
                if (num1.getNum() != num2.getNum()) {
                    System.out.println(num1.getNum() + " <-> " + num2.getNum());
                    moveControl(num1, num2);
                    arr.set(i, num2);
                    arr.set(j, num1);
                }
            }
        }
        MyNumber num1 = arr.get(i+1);
        MyNumber num2 = arr.get(high);
        if (num1.getNum() != num2.getNum()){
            moveControl(num1, num2);
            arr.set(i + 1, num2);
            arr.set(high, num1);
        }
        return i +1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (MyNumber number:arr){
            boolean b = number.getFace().contains(e.getPoint().getX(), e.getPoint().getY());
            if (b==true){
                System.out.println(b+ " - "+number);
                Graphics2D g =(Graphics2D) number.getGrap();
                g.setColor(Color.YELLOW);
                g.fill(number.getFace());
                this.repaint(number.getFace().getBounds());
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
