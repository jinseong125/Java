package chap01_is_a;

public class Main {

	public static void main(String[] args) {
		
		//----- Student
		Student student = new Student();
		student.eat();
		student.sleep();
		student.study();
		System.out.println();
		
		//
		Worker worker = new Worker();
		worker.eat();
		worker.sleep();
		worker.startWork();
		worker.finishWork();
		System.out.println();
		
		Developer developer = new Developer();
		developer.eat();
		developer.sleep();
		System.out.println();
		
		Designer designer = new Designer();
		designer.eat();
		designer.sleep();
		System.out.println();
		
		
		
		

	}

}
