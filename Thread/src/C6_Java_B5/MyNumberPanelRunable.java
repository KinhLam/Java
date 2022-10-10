package C6_Java_B5;

public class MyNumberPanelRunable implements Runnable{
    private MyNumberPanel numberPanel = null;
    private boolean isFinished = false;

    public MyNumberPanelRunable(MyNumberPanel pn){
        this.numberPanel = pn;
    }

    @Override
    public void run(){
        try {
            while (!Thread.currentThread().isInterrupted() && isFinished == false){
                //Dùng switch case chọn chức năng
                switch (MyNumberFrame.SortType){
                    case BUBBLE_SORT:
                        numberPanel.boBubbleSort();
                        break;
                    case SELECTION_SORT:
                        numberPanel.doInsertionSort();
                        break;
                    case INSERTION_SORT:
                        numberPanel.doInsertionSort();
                        break;
                    case QUICK_SORT:
                        numberPanel.doQuickSort();
                        break;
                }
                Thread.sleep(1000);
                isFinished = numberPanel.isFinished();
            }
        }catch (Exception e){

        }
    }
}
