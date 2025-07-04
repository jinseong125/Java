package chap09_interface.e_marker_interface;

public class Hamburger implements Food, FavoriteFood{

  @Override
  public void howToEat() {
    // TODO Auto-generated method stub
    System.out.println("햄버거 먹기");
  }
  
}
