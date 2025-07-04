package chap12_Book_Publisher;

// 문제. Book 객체를 만들고 Setter를 호출하여 적절한 정보를 저장하세요.
//       정보 저장 뒤 Getter를 호출하여 해당 정보를 확인하세요.

public class Main {

  public static void main(String[] args) {
    
    Book book = new Book();
    
    book.setTitle("혼자 공부하는 자바");

    Publisher publisher = new Publisher();
    publisher.setName("한빛미디어");
    publisher.setLocation("서울시 서대문구 연희로2길 62");
    
    Contact contact = new Contact();
    contact.setTel( "02-325-5544");
    contact.setFax("02-336-7124");
    
    publisher.setContact(contact);
    
    System.out.println(
        "제목     : " + book.getTitle()         + "\n" +
        "출판사   : " + publisher.getName()     + "\n" +
        "위치     : " + publisher.getLocation() + "\n" +
        "전화번호 : " + contact.getTel()        + "\n" +
        "팩스번호 : " + contact.getFax()
    );

  }

}
