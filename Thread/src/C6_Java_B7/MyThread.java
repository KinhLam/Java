package C6_Java_B7;

public class MyThread implements Runnable{
    int start;
    int end;
    int []arr;

    public MyThread(int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    @Override
    public void run(){
        print();
        sort();
        print();
    }

    protected void sort(){
        for (int i = start; i <end; i++){
            for (int j = i+1;j<end;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    protected void print(){
        String str="";
        for (int i = start;i<end;i++){
            str+=arr[i]+" ";
        }
        System.out.println(str);
    }
}
