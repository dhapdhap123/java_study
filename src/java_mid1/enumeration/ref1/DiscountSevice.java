
package java_mid1.enumeration.ref1;


public class DiscountSevice {

    public int discount(ClassGrade classGrade, int price){
        return price * classGrade.getDiscountPercent() / 100;
    }
}
