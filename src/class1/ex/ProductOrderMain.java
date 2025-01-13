package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {

        ProductorOrder[] products = new ProductorOrder[3];

        ProductorOrder product1 = new ProductorOrder();
        product1.productName ="두부";
        product1.price = 2000;
        product1.quantity=2;
        products[0] = product1;

        ProductorOrder product2 = new ProductorOrder();
        product2.productName ="김치";
        product2.price = 5000;
        product2.quantity=1;
        products[1] = product2;

        ProductorOrder product3 = new ProductorOrder();
        product3.productName ="콜라";
        product3.price = 1500;
        product3.quantity=2;
        products[2] = product3;

        for (ProductorOrder product : products) {
            System.out.println("상품명:" + product.productName + " 가격:"+product.price+" 수량:" + product.quantity);
        }

        int sum =0;
        for (int i =0; i<products.length;i++) {
            int total = products[i].price * products[i].quantity;
            sum += total;
        }
        System.out.println("최종금액: "+ sum);


    }
}
