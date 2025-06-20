package java_mid1.lang.immutable.address;

public class ImmutableAddress {

    private final String value; // final 없어도 불변객체. setValue가 없음

    public ImmutableAddress(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
