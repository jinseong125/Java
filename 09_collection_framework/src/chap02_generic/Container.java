package chap02_generic;

/*
 * Generic
 * 
 * 1. 클래스, 인터페이스, 메소드에서 사용할 데이터 타입을 외부에서 지정하는 개념입니다.
 * 2. 특정 타입에 의존하지 않습니다.
 * 3. 타입 안정성을 보장합니다. (잘못된 타입의 값이 전달되면 컴파일 오류 발생)
 * 4. 참조타입(Reference Type)만 사용할 있다.
 *    기본타입의 값이 사용되려면 Wrapper Class 타입으로 바꿔서 사용해야 합니다.
 */

//----- generic Class

public class Container<T> {  // Container <Integer>, Container <Double> . . .
  
  // <T> : 타입 파라미터(임의의 참조타입, 관례적으로 T, E, K, V등을 주로 사용

  private T item;
  public T getItem() {
    return item;
  }
  public void setItem(T item) {
    this.item = item;
  }
  
  
  
  }
  

