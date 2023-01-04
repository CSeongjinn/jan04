package animal;

public abstract class Animal { //추상클래스(p329)
	protected int age;
	protected String name;
	
//	public void sound() {
//		System.out.println("동물마다 다름");
//	}
	//추상메소드화
	public abstract void sound(); //바디 없음
//	public abstract void add(); //Animal을 상속받는 모든 객체에서 반드시 구현해야함
	
	public void eat() {
		System.out.println("eat");
	}
}
