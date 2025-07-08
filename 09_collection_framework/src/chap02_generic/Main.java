package chap02_generic;

public class Main {

  public static void main(String[] args) {
    // Integer 저장용 Container
    Container<Integer> container1 = new Container<Integer>();
    container1.setItem(9);
    System.out.println(container1.getItem());
    
    // Double 저장용 Container
    Container<Double> container2 = new Container<Double>();
    container2.setItem(1.4);
    System.out.println(container2.getItem());
    
    // String 저장용 Container
    Container<String> container3 = new Container<String>();
    container3.setItem("박진성");
    System.out.println(container3.getItem());

  }

}
