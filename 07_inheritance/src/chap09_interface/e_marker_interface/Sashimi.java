package chap09_interface.e_marker_interface;

public class Sashimi implements Food, FavoriteFood{
  @Override
  public void howToEat() {
    // TODO Auto-generated method stub
   System.out.println("회 먹기"); 
  }
}
