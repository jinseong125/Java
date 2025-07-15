package Dowhile;

public class Main {

  public static void main(String[] args) {

    // 1 ~ 1000 누적하기
    int total = 0;
    int x = 1;  // 1부터 시작하니까
    do {
      total += x++;
    } while (x <= 2000);
    System.out.println(total);
    
  }
}
