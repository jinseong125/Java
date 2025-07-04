package chap08_abstract;

public class Main {

  public static void main(String[] args) {
    
    Animal animal;
    
    // 미완성된 메소드 animal = new Animal();  추상 클래스 객체는 생성할 수 없습니다.
    
    // 호출할땐 animal 실행할때는 Lion이 됨.
    animal = new Lion(); animal.move();
    
    animal = new Shark(); animal.move();
    
    animal = new Eagle(); animal.move();

  }

}
