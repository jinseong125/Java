package chap02_multi_dimention;

public class MultiDimentionEx {

  public static void main(String[] args) {
    
    // 2차원 배열이란? - String[][]
    // 1차원 배열이 여러 개 존재하는 경우 이 1차원 배열을 합치는 것을 의미합니다.
    
    // 2차원 배열 선언
    String[][] seats;
    
    // 2차원 배열 생성 (1차원 배열을 만드는 작업)
    seats = new String[3][];  //----- 1차원 배열이 3개입니다.
    
    // 1차원 배열 생성 (1차원 배열의 길이를 만드는 작업)
    seats[0] = new String[2];  //----- 첫 번째 1차원 배열의 길이는 2입니다. seats[0]이 1차원 배열의 이름
    seats[1] = new String[5];  //----- 두 번째 1차원 배열의 길이는 5입니다.
    seats[2] = new String[4];  //----- 세 번째 1차원 배열의 길이는 4입니다.
    
    // 2차원 배열 요소 사용 (인덱스를 2개 사용 : 몇 번째 1차원 배열인가? 1차원 배열 내 몇 번째 요소인가?)
    seats[0][0] = "이동욱";
    seats[0][1] = "신성수";
    
    seats[1][0] = "이유천";
    seats[1][1] = "조기완";
    seats[1][2] = "최미영";
    seats[1][3] = "박진성";
    seats[1][4] = "김민석";
    
    seats[2][0] = "유비";
    seats[2][1] = "이창민";
    seats[2][2] = "권형택";
    seats[2][3] = "김경진";
    
    // 2차원 배열 순회 1 (일반 for문)
    for (int i = 0; i < seats.length; i++) {  //---------- 각 1차원 배열 찾아가기
      for (int j = 0; j < seats[i].length; j++) {  //----- 찾아간 1차원 배열 요소 순회하기
        System.out.print(seats[i][j] + ",");
      }
      System.out.println();
    }
    
    
    // 2차원 배열 순회 2 (향상 for문)
    for (String[] lines : seats) {  // 2차원 배열이 가지고 있는 건 1차원 배열입니다.
      for (String seat : lines) {
       System.out.print(seat + ","); 
      }
      System.out.println();
    }
    
    /*
     * [Stack] -> 지역 변수(일반 변수, 참조 변수)가 저장되는 곳
     * |
     * |                     Reference(참조값)
     * +-------------------+
     * | seats    : 0x100  |
     * +-------------------+
     *
     * 
     * [Heap] -> new를 이용해 생성한 객체나 배열이 저장되는 곳 
     * |               
     * +-------------------+
     * | seats[0] : 0xAAA  | 0x100
     * +-------------------+
     * | seats[1] : 0xBBB  | 0x104 (참조 변수 크기를 4바이트로 가정한 상황)
     * +-------------------+
     * | seats[2] : 0xCCC  | 0x108
     * +-------------------+
     * | ...               |
     * +-------------------+
     * |                   |                      [String Constant Pool] -> 문자열 리터럴("")로 생성한 문자열이 저장되는 곳
     * +-------------------+                      +--------+
     * | seats[0][0] : 0x1 | 0xAAA                | 이동욱 | 0x1
     * +-------------------+                      +--------+
     * | seats[0][1] : 0x2 |                      | 신성수 | 0x2
     * +-------------------+                      +--------+
     * | ...               |
     * +-------------------+                      +--------+
     * | seats[1][0] : 0x3 | 0xBBB                | 이유천 | 0x3
     * +-------------------+                      +--------+
     * | seats[1][1] : 0x4 |                      | 조기완 | 0x4
     * +-------------------+                      +--------+
     * | seats[1][2] : 0x5 |                      | 최미영 | 0x5
     * +-------------------+                      +--------+
     * | seats[1][3] : 0x6 |                      | 박진성 | 0x6
     * +-------------------+                      +--------+
     * | seats[1][4] : 0x7 |                      | 김민석 | 0x7
     * +-------------------+                      +--------+
     * | ...               |
     * +-------------------+                      +--------+
     * | seats[2][0] : 0x8 | 0xCCC                | 유  비 | 0x8
     * +-------------------+                      +--------+
     * | seats[2][1] : 0x9 |                      | 이창민 | 0x9
     * +-------------------+                      +--------+
     * | seats[2][2] : 0xA |                      | 권형택 | 0xA
     * +-------------------+                      +--------+
     * | seats[2][3] : 0xB |                      | 김경진 | 0xB
     * +-------------------+                      +--------+
     * | ...               |
     * +-------------------+
Stack(스택)

지역 변수(스칼라 값, 참조 변수 등)가 저장되는 곳.
seats라는 참조 변수 자체는 스택에 위치하며, 그 값(참조값)은 0x100을 가리켜.

[Stack]
seats : 0x100   // seats가 가리키는 힙(배열)의 시작 주소

Heap(힙)
new 연산자로 생성된 객체나 배열이 저장되는 곳.

seats = new String[3][] → 힙에는 길이가 3인 1차원 참조 배열이 할당되어,
각 요소(seats[0], seats[1], seats[2])에 또 다른 배열의 주소(0xAAA, 0xBBB, 0xCCC)가 들어있어.

그 다음, 각 1차원 배열(seats[0], seats[1], seats[2])이 또 힙에 생성되어 있고,
내부에는 다시 문자열 참조값(0x1,0x2,…,0xB)이 들어있지.
[Heap]
0x100 ──> [ 0xAAA, 0xBBB, 0xCCC ]      // seats 참조 배열
          ↳ 0xAAA ──> ["이동욱", "신성수", …]
          ↳ 0xBBB ──> ["이유천", "조기완", …, "김민석"]
          ↳ 0xCCC ──> ["유  비", "이창민", …, "김경진"]
String Constant Pool(문자열 상수 풀)

소스 코드에 직접 "" 리터럴로 쓰인 문자열들이 저장되는 영역.

"이동욱", "신성수" 등 각 문자열 리터럴은 풀에 한 번만 생성되고, 참조값(0x1, 0x2, …)만 힙 배열에 저장돼.

[String Constant Pool]
0x1: "이동욱"
0x2: "신성수"
…  
0xB: "김경진"
요약
스택: seats 변수(참조값)를 담고 있다.

힙: 1) 참조 배열(String[][] seats) 2) 각 1차원 배열(String[]) 3) 배열 내부에 저장된 참조값들.

문자열 상수 풀: 리터럴 문자열들 자체는 여기 한 곳에만 존재하고, 배열 안에는 참조값만 저장된다.

    */
    
    
    
  }
}
