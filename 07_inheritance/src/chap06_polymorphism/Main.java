package chap06_polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Chihuahua chihuahua = new Chihuahua("치와와");
		Husky husky = new Husky("허스키");
		
		Person person = new Person();
		person.feedFood("개껌", chihuahua);
		person.feedFood("고기", husky);
		
		
	}

}
