package chap02_method_parameter;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // 클래스 parameter 타입의 객체 parameter 생성
    Parameter parameter = new Parameter();
    
    // 객체 parameter를 이용해서 메소드를 호출합니다
    parameter.methodA();  // 매개변수(파라미터)가 없으므로 인자(Argument)를 전달하지 않습니다.
    parameter.methodB(15); // 인자 14가 매개변수 x로 전달됩니다.
    
    int[] items = {1, 2, 3};
    parameter.methodC(items);
    
    parameter.methodD();  //매개변수 int... 타입은 가변 인자 타입이므로 전달하는 인자의 개수를 마음대로 조정할 수 있다.
    parameter.methodD(1);
    parameter.methodD(1, 2); 
    
    parameter.methodE(1);
    parameter.methodE(0, 1);
    
    int number = 0;
    int[] numbers = new int[3]; // 참조 타입은 null로 초기화가 가능합니다.
    parameter.methodF(number, numbers);
    System.out.println("기본 타입 number:" + number);
    System.out.println("참조 타입 numbers:" + Arrays.toString(numbers));
    
    Car car = new Car();
    parameter.methodG(car, "서울");
    parameter.methodG(car, "경주");
    parameter.methodG(car, "인천");    
    
    
  }

}
