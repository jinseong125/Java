package study;

public class ArrayList {

  private int[] arr; // 작은방
  private int index; // 들어갈 자리
  

  public boolean add(int i)  {

    if(!isExists()) {
      arr = new int[10];
    }
    if(isFull()) {
      sizeUp();
    }

    int old = index;
    arr[index++] = i;
    if(old + 1 == index) {
      return true;
    } else {
      return false; 
    }
  }
  
  public boolean isExists() {
    if(arr == null) return false;
    else return true;
  }

  public boolean isFull() {
    if(arr.length == index) {
      return true;
    }
    else return false;
  }

  public void sizeUp() {
    int[] newArr = new int [(int) (arr.length * 1.5)];
    for(int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];

    }
    arr = newArr; // 예) 로 주소변경
  }
  public int size() {
    return index;
  }
  
}
