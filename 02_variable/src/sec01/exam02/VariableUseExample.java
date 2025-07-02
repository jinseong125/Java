package sec01.exam02;

public class VariableUseExample {

  public static void main(String[] args) {
   
    int hour = 3;
    int minute = 5;
    System.out.println(hour + "시간" + minute + "분");

    int totalMinute = (hour * 60) + minute;
    System.out.println(totalMinute + "분");
    
    int x = 10;
    int y = 20;
    System.out.println("x:" + x +"," + "y:" + y);
    
    // temp - 변수 값 교환
    int temp = x;
    x = y;
    y = temp;
    System.out.println("x:" + x + "," + "y:" + y);
    
    int var1 = 0b1011; // 2진수
    int var2 = 0206;   // 8진수
    int var3 = 365;    // 10진수
    int var4 = 0xB3;   // 16진수
    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var3);
    System.out.println(var4);
    
    String name = "박진성";
    String age  = "28";
    System.out.println(name);
    System.out.println(age);
    
    String str = "나는 \n자바\n를 좋아합니다.";
    System.out.println(str);

    
  }
   

}
