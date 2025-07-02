  package chap01_class_instance;

public class Main {

  public static void main(String[] args) {
    
    // 클래스 Book 타입의 객체 선언 (참조 변수 선언)
    Book book1;

    // book1 객체 생성(인스턴스화를 통해서 인스턴스가 생성됩니다.)
    // new 연산자로 Book 객체를 힙(heap)에 생성하고
    //    그 주소(참조값)를 book1에 저장(할당)
    book1 = new Book();
    // book1 객체 정보 확인
    // book1이 참조하는 Book 객체의 toString() 결과를 출력
    //    → 클래스명@해시코드 형식의 문자열이 출력됨
    System.out.println(book1);
    
    // 클래스 book 타입의 객체 선언과 생성과 확인
    // Book 타입의 참조 변수 선언과 객체 생성을 한 번에 처리
    //    → 변수 선언과 동시에 new로 객체를 생성해서 참조값을 대입
    Book book2 = new Book();
    
    System.out.println(book2);

  }

}
