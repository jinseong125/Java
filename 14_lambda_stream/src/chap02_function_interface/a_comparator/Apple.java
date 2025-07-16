package chap02_function_interface.a_comparator;

public class Apple {

  private double weigth;

  public Apple(double weigth) {
    super();
    this.weigth = weigth;
  }

  public double getWeigth() {
    return weigth;
  }

  public void setWeigth(double weigth) {
    this.weigth = weigth;
  }

  @Override
  public String toString() {
    return "Apple [weigth=" + weigth + "]";
  }
  
}
