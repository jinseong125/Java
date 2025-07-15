package chap02_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * java.sql.PreparedStatement
 * 
 * 1. 자바에서 데이터베이스 쿼리문을 실행하기 위해 사용하는 인터페이스입니다.
 * 2. PreparedStatement 객체를 생성하기 전에 미리 쿼리문이 완성되어 있어야 합니다. (Statement를 쿼리문이라고 해석)
 * 3. 주요 특징
 *    1) 파라미터 바인딩 : 쿼리문에서 값이 들어갈 자리에 "?" (Placeholder)를 사용하고, 실행 전 값을 바인딩합니다.
 *    2) SQL Injection 방지 : 파라미터 바인딩을 통해 입력되는 값이 자동으로 이스케이프 처리되기 때문에 SQL Injection을 예방합니다.
 */

public class Main {
  
  public static void insert() throws Exception {
    
    //----- DB 접속
    Connection con = DBConnection.getConnection();
    
    //----- 쿼리문
    String sql = "INSERT INTO tbl_board(uid, title, content) VALUES(?, ?, ?)";
    
    //----- PreparedStatement 객체 생성 (쿼리문 실행 객체)
    PreparedStatement ps = con.prepareStatement(sql);
    
    //----- tbl_board 테이블에 저장할 값 입력 받기
    Scanner sc = new Scanner(System.in);
    System.out.print("사용자 아이디(1,2,3) 입력 >>> "); int uid = sc.nextInt();
    System.out.print("게시글 제목 입력 >>> "); String title = sc.next();
    sc.nextLine();
    System.out.print("게시글 내용 입력 >>> "); String content = sc.nextLine();
    sc.close();
    
    //----- 입력 받는 값으로 파라미터 바인딩
    ps.setInt(1, uid);  //-------- 1번째 ?에 uid 바인딩
    ps.setString(2, title); //---- 2번째 ?에 title 바인딩
    ps.setString(3, content); //-- 3번째 ?에 content 바인딩
    
    //----- 쿼리문 실행 (DML은 executeUpdate() 메소드를 호출합니다.)
    int count = ps.executeUpdate(); //----- 쿼리문 실행이 성공한 행(Row)의 개수를 반환합니다. (성공 시 1 반환, 실패 시 0 반환)

    //----- 결과 확인
    System.out.println(count + "행이 삽입되었습니다.");
    
    //----- 자원 해제
    ps.close();
    con.close();
    
  }
  
  public static void update() throws Exception {
    
    // bid, title, content 입력 받기.
    // 해당 행의 title, content, modified_at 수정하기.
    
    Connection con = DBConnection.getConnection();
    String sql = "UPDATE tbl_board SET title = ?, content = ?, modified_at = NOW() WHERE bid= ?";
    
    PreparedStatement ps = con.prepareStatement(sql);
    Scanner sc = new Scanner(System.in);
    System.out.println("비드 번호 입력 >>>"); int bid = sc.nextInt();
    System.out.println("게시글 제목 입력 >>>"); String title = sc.next();
    sc.nextLine();
    System.out.println("게시글 내용 입력 >>>"); String content = sc.nextLine();
    sc.close();
    ps.setString(1, title);
    ps.setString(2, content);
    ps.setInt(3, bid);
    int count = ps.executeUpdate();
    System.out.println(count + "행이 수정되었습니다.");
    ps.close();
    con.close();
    
  }
  
  public static void delete() throws Exception {
    
    Connection con = DBConnection.getConnection();
    String sql = "DELETE FROM tbl_board WHERE bid= ?";
    
    PreparedStatement ps = con.prepareStatement(sql);
    Scanner sc = new Scanner(System.in);
    System.out.println("비드 번호 입력 >>>"); int bid = sc.nextInt();
    ps.setInt(1, bid);
    int count = ps.executeUpdate();
    System.out.println(count + "행이 삭제되었습니다.");
    ps.close();
    con.close();
    sc.close();
  }

  public static void main(String[] args) {
    
    try {
     // insert();
     // update();
      delete();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
