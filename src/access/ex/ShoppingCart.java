package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    //나머지 코드를 완성하라

    public void addItem(Item item) {
        if(itemCount > items.length) {
            System.out.println("장바구나가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i<itemCount; i++){
            Item item = items[i];
            System.out.println("상품명:"+item.getName()+", 합계:"+item.getPrice());
        }
        System.out.println("전체 가격 합: "+totalPrice());
    }

    private int totalPrice(){
        int totalPrice = 0;
        for(int i = 0; i<itemCount; i++){
            Item item = items[i];
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }


}
