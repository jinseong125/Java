package chap07_instance_array;

import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
 
    // 제품(Product) 진열하기
    Map<String, Object> product1 = Map.of("name", "양파1.5kg",        "price", 3000);
    Map<String, Object> product2 = Map.of("name", "고등어1손",        "price", 5000);
    Map<String, Object> product3 = Map.of("name", "한돈앞다리1kg",    "price", 15000);
    Map<String, Object> product4 = Map.of("name", "블랙앵거스살치살", "price", 20000);
    Map<String, Object> product5 = Map.of("name", "꼬마돈까스",       "price", 9000);
    /*Product product1 = new Product("양파1.5kg", 3000);
    Product product2 = new Product("고등어1손", 5000);
    Product product3 = new Product("한돈앞다리1kg", 15000);
    Product product4 = new Product("블랙앵거스살치살", 20000);
    Product product5 = new Product("꼬마돈까스", 9000); */
    
    // Cart 진열하기
    Cart cart1 = new Cart();
    Cart cart2 = new Cart();
    
    // Customer 입장
    Customer customer = new Customer(500000);
    
    // Customer가 Cart 취득
    customer.setCart(cart1);
    
    // 쇼핑    
    customer.addToCart(product1);
    customer.addToCart(product2); 
    customer.addToCart(product3);
    customer.addToCart(product4);
    customer.addToCart(product5);
    
    customer.removeFromCart(0);
    
    // 구매
    String receipt = customer.purchase();
    
    // 구매내역 확인
    if (receipt != null) {
      JOptionPane.showMessageDialog(null, receipt);// 구매 Product 목록 + 총 구매금액
      JOptionPane.showMessageDialog(null, "남은 돈:" + customer.getMoney());
    }
  }
}

