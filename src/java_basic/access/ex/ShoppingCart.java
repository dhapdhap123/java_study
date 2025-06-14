package java_basic.access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count = 0;

    public void addItem(Item item){
        if (!isLessThanMax()){
            System.out.println("상품 최대 개수 초과");
            return;
        }

        items[count] = item;
        System.out.println("장바구니에 상품 추가 되었습니다.");
        count++;
    }
    public void displayItems(){
        for (int i = 0; i < count; i++) {
            String name = items[i].getName();
            int totalPrice = items[i].getTotalPrice();
            System.out.println("상품명: " + name + " 총 가격: " + totalPrice);
        }
    }
    public int calculateTotalPrice(){
        int totalPrice = 0;
        for (int i = 0; i < count; i++){
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }

    private boolean isLessThanMax(){
        return count < items.length;
    }
}
