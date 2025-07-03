package chap12_Book_Publisher;

// 문제. Book 객체를 만들고 Setter를 호출하여 적절한 정보를 저장하세요.
//       정보 저장 뒤 Getter를 호출하여 해당 정보를 확인하세요.

public class Main {

  public static void main(String[] args) {
    
    Book book = new Book();
    
    book.setTitle("혼자 공부하는 자바");

    Publisher publisher = new Publisher();
    publisher.setName("출판사:" + "한빛미디어");
    publisher.setLocation("출판사위치:" + "인천");
    
    Contact contact = new Contact();
    contact.setTel("전화번호:" + "010-1234-5678");
    contact.setFax("팩스번호:" + "1234");
    
    publisher.setContact(contact);
    
    System.out.println(book.getTitle()
        + publisher.getName() +
        publisher.getLocation() +
        contact.getFax() +
        contact.getTel());
  }

}
