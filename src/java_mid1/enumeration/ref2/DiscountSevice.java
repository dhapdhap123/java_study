
package java_mid1.enumeration.ref2;



public class DiscountSevice {

    public int discount(Grade grade, int price){
        return price * grade.getDiscountPercent() / 100;
    }
}
