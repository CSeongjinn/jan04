package dog;

import java.util.HashSet;
import java.util.Set;

import animal.Animal;
import animal.Human;

public class Dog extends Animal {
	
	//1~45 숫자 6개를 뽑아주는 개
	public Set<Integer> lotto(){
		Set<Integer> lotto = new HashSet<Integer>(); //중복제거
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		return lotto;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal ani = new Animal();  //추상클래스가 되어 에러
//		ani.sound();
		
		Dog dog = new Dog();
		dog.age=10;
		
		Human human =new Human();
		human.setSsn("000101");
		System.out.println(human.getSsn());
		
		Set<Integer> lotto = dog.lotto();
		System.out.println(lotto);
		System.out.println(dog.lotto());
		
	}
	
	@Override
	public void sound() {
		System.out.println("[dog sound]");
	}

}
