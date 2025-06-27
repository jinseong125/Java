package chap03_compare;

public class ComparisonEx {

  public static void main(String[] args) {
    
    // Comparison : 비교 연산
    
    int x = 10;
    int y = 20;
    
    System.out.println(x > y);   //----- greater than               (gt)
    System.out.println(x >= y);  //----- greater than or equal to   (ge)
    System.out.println(x < y);   //----- less than                  (lt)
    System.out.println(x <= y);  //----- less than or equal to      (le)
    System.out.println(x == y);  //----- equal to                   (eq)
    System.out.println(x != y);  //----- not equal to               (ne)

    // 문자열의 비교 : ==, !=, 를 사용하지 않습니다.
    String s1 = "abc";
    String s2 = "abc";
    String s3 = new String("abc"); //-- 객체 생성 코드로 인해서 새로운 "abc"가 저장됩니다.
    System.out.println(s1 == s2); //--- "abc"가 저장된 참조값 비교
    System.out.println(s1 == s3); //--- s1의 참조값과 s3의 참조값은 서로 다르므로 false
    System.out.println(s1.equals(s3)); // 문자열의 비교 코드 (나중에 배우니 참고만 해도 됨)
  }

}