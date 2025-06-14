package java_basic.access.ex;

public class MaxCounterMain {

    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(5);

        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.getCount();
    }
}
