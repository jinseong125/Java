package chap02_exception_propagation;

public class Main {

  public static void main(String[] args) {

    try {
      
      String x = "1.5";
      String y = "0.5";
      
      System.out.println(calculator.add(x, y));
      System.out.println(calculator.sub(x, y));
      System.out.println(calculator.mul(x, y));
      System.out.println(calculator.div(x, y));
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }

}
