package java_mid1.lang.immutable.ex;

public class MyDate {

    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate withYear(int year) {
        return new MyDate(year, month, day);
    }

    public MyDate withMonth(int month) {
        return new MyDate(year, month, day);
    }

    public MyDate withDay(int day) {
        return new MyDate(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
