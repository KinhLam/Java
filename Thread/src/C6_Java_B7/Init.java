package C6_Java_B7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Init {
    int []arr;
    public Init(){
        //Khoi tao
        arr = new int[10000];
        //Dùng vòng lặp thêm giá trị vào mảng
        for (int i = 0; i<arr.length;i++){
            arr[i]=i;
        }

        //Thay đổi vị trí giá trị trong mảng
        Random rd = ThreadLocalRandom.current();
        for (int i = arr.length-1;i>0;i--){
            int index = rd.nextInt(i+1);
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
        System.out.println("Init complete");

    }
}
