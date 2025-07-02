package chap05_field;

public class Car {
  
  /*
   * 필드(Field)
   * 
   * 1. 클래스에서 선언한 변수입니다. 일반 지역변수와 구분해서 필드라고 부릅니다.
   * 2. 객체(인스턴스)가 가지는 값입니다.
   * 3. 클래스에 포함된 모든 메소드는 필드를 사용할 수 있습니다.
   * 4. 일반 지역변수와 달리 선언만 하면 자동으로 초기화됩니다. (숫자는 0, true, false는 false로, null등)
   * 매개변수에 있으면 지역변수, 
   */
  
  // 이 model, price는 클래스 Car에서 선언했으므로 필드입니다.
  String model; //----- String model = null;
  int price;   //----- int price = 0;
  
  // 매개변수 model, price는 메소드 setInfo에서 선언했으므로 지역변수입니다.
  void setInfo(String model, int price) {
    
    // this
    //  - (주로, 매개변수 이름하고 필드이름이 동일할 때 이를 구분하기위해 필드앞에 this를 사용.)
    // this 가 있으면 필드, 아니면 매개변수.
    // setInfo 메소드를 호출하는 객체(인스턴스)를 의미합니다. (참조 값)
    
    this.model = model; // car1.model(필드) = "Sorento"(필드 값);
    this.price = price; // car1.model = 4000;

  }

  // 매개변수가 없으니 this 미사용
  void printInfo() {
    System.out.println(model + "," + price);
  }
  
  
  
  
  
  

}
