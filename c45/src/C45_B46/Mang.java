package C45_B46;

import java.util.Random;
import java.util.Scanner;

public class Mang {
    int[] arr;
    public Mang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So Phan Tu");

        //Khai báo và nhập số phần tử có trong mạng
        int n;
        n=sc.nextInt();
        arr= new int[n];

        //Khai báo biến Random
        Random rd = new Random();

        for (int i = 0; i < n; i++){
            //Gán vị trí thứ i từ 1 đến 100
            arr[i] = rd.nextInt(100)+1;
            System.out.println(arr[i]+"\t");
        }
    }

    //Hàm sắp xếp tăng dần
    public void sapxepnho(){
        for (int i = 0; i<arr.length-2;i++){
            for (int j=i+1;j<arr.length-1;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    //Hàm sắp xếp giảm dần
    public void sapxeplon(){
        for (int i = 0; i<arr.length-2;i++){
            for (int j=i+1;j<arr.length-1;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public int gtNho(){
        return arr[0];
    }

    //Hàm xuất mảng
    public void xuatMang(){
        for (int i = 0;i<arr.length-1;i++){
            System.out.println(arr[i]+"\t");
        }
    }
}
