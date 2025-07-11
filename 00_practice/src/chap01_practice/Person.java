package chap01_practice;

public abstract class Person extends Main {

  
  private String value;
  
  public Person(String value) {
    this.value = value;
}
  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
  
  public abstract String action(String input);
  
}
