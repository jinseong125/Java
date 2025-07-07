package chap03_custom_exception;

import java.nio.file.attribute.AclEntry;

public class Main {

  public static void customException() throws MyException {  // customException() 메소드를 호출한 곳으로 마이인셉션 예외
  throw new MyException("예외 메시지입니다.");
  }
  
  // 직접 예외 처리하기 (권장함)
  
  public static void main(String[] args) {
    try {
      
  customException();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
 }
}
