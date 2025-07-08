package chap05_instance_array_throws;

import javax.swing.JOptionPane;

public class Cart {

  // 필드
  private Product[] products; //----- Product[] 배열 선언 (배열의 생성이 아직 필요합니다.), 이 한 줄은 Java 클래스 내부에 Product 객체를 담을 수 있는 배열을 선언하는 구문
  private int count;  //------------- Products 배열에 저장된 Product 개수
  private final int LIMIT = 100; //- Products 배열의 최대 길이 (final 상수 : 값을 바꿀 수 없습니다. 반드시 초기화가 필요합니다. 관례상 대문자로 작성합니다.
  // LIMIT - 상수 배열의 길이
  
  // 생성자
  public Cart() {
  // new Cart() 실행 시 products 배열이 생성됩니다.
    products = new Product[LIMIT];
  }

  // 메소드
  public Product[] getProducts() {
    return products;
  }

  public void setProducts(Product[] products) {
    this.products = products;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
  
  public void addProduct(Product product) { //throws new RuntimeException 생략
    // 예외 발생후 예외 회피
    if (product == null) {
      throw new RuntimeException("전달된 Product이 없습니다.");
    }
    if (count == LIMIT) {
      throw new RuntimeException("더 이상 Cart에 담을 수 없습니다.");
    }
    products[count++] = product;
  }
    
  public Product removeProduct(int idx) {  //throws new RuntimeException 생략
    // 예외 발생 후 예외 회피(예외 회피 시 null 반환)
    if (count == 0) {
      throw new RuntimeException("Cart가 비어있습니다.");
    }
    if (idx < 0 || idx > count) {
      throw new RuntimeException(idx + "는 없는 인덱스입니다.");
    }
    Product removed = products[idx]; //----- 삭제된 요소 (현재는 삭제될 요소이지만...)
    System.arraycopy(products, idx + 1, products, idx, count - idx - 1);           
    products[--count]= null;
    return removed; //--------------------- 삭제된 요소 변환
  }
  
}
