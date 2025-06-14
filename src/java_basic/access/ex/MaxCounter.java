package java_basic.access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if (isLowerThanMax()){
            count += 1;
        } else {
            System.out.println("카운트보다 작지 않습니다. 현재 카운트 : " + count);
        }
    }
    public int getCount(){
        return count;
    }

    private boolean isLowerThanMax(){
        return count < max;
    }
}
