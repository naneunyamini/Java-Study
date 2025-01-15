package ref;


import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력한 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n]; //배열에 저장

        for (int i =0; i <orders.length;i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요: ");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName,price,quantity); //배열에 저장

        }

        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println(totalAmount);



    }

    //createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
    //**ProductOrder**는 이 메서드가 ProductOrder 객체를 반환
    static ProductOrder createOrder(String productName , int price , int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    //printOrder()를 사용해서 상품 주문 정보 출력
    //**void**는 이 메서드가 아무것도 반환하지 않는다는 의미
    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명:" + order.productName + " 가격:"+order.price+" 수량:" + order.quantity);
        }

    }
    //getTotalAmount()를 사용해서 총 결제 금액 계산
    public static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.quantity * order.price;
        }
        return totalAmount;
    }
    //총 결제 금액 출력

}
