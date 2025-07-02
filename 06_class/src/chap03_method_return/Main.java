package chap03_method_return;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Return ret = new Return();
    ret.methodA(-1);
    ret.methodA(0);
    
    int sum =ret.methodB(1, 2);
    //System.out.println(ret.methodB(1 ,2));
    System.out.println("methodB's return:" + sum);
    System.out.println("methodB's return:" + ret.methodB(3,4));
  

    int[] numbers = ret.methodC(3);
    // ret 객체의 methodC 메소드를 호출하여
    // 길이가 3인 int 배열을 생성하거나 데이터를 처리한 결과를 반환받아
    // numbers 변수에 저장합니다.
    
    System.out.println(Arrays.toString(numbers));
    // Arrays.toString(numbers)를 통해 배열의 요소들을
    // “[요소1, 요소2, 요소3]” 형태의 문자열로 변환.
  
    String carInfo = ret.methodD();
    System.out.println("methodD's return:" + carInfo );
  }
  
}