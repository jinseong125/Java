package chap01_practice;

public class Player extends Person {

  public Player(String value) {
    super(value);
    // TODO Auto-generated constructor stub
  }

  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String action(String input) {
    // TODO Auto-generated method stub
    return null;
  }
}
