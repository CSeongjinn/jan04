package inter;
//인터페이스
/*
 * 인터페이스 : 다른 언어에서 찾아보기 힘든 고급 기능
 * 
 * 인터페이스란?
 * 추상 클래스다 = 추상화
 * 추상 클래스는 추상 메소드를 가지고 있다
 * 일반 메소드를 가지고있다.
 * 인터페이스는 오직 추상 메소드만 가지고 있다
 * 
 * 인터페이스 내에 존재하는 메소드는 무조건 추상 메소드
 * 인터페이스 내에 존재하는 변수는 무조건 상수
 * 
 * 인터페이스 속 메소드는 public abstract 메소드명으로 선언
 * 변수는 static final로 선언
 * 
 * 인터페이스 다중상속이 가능
 * 
 * interface AAA{
 * 		static final int NUMBER = 100;
 * 		public abstract void print();
 * }
 * 
 * class Cat implements AAA{
 * 		AAA에 미구현된 내용을 구현한다
 * 		@override
 * 		public void print(){
 * 			System.out.println("owo");
 * 		}
 * }
 * 
 * 특징: 인터페이스는 객체로 만들 수 없다
 * 주의할 점
 * 클래스에 인터페이스 상속시 인터페이스 내
 * 모든 추상 메소드를 구현해야한다(override)
 * 
 * 상속과 인터페이스의 차이점
 * 상속 : class A extends B{}
 * 		B라는 클래스를 상속받아 A에 더한다
 * 		순수상속 : 부모로부터 모든 권한/능력을 가져오기
 * 인터페이스 : class A implements B{}
 *		B라는 인터페이스의 기능을 A에 구현한다
 *		권한상속 : 인터페이스만 가져오기
 *					비어있는 것을 가져와서 속을 만들기
 */
interface SayHi{
	public void sayHi();
	public void sayBye(); //추상메소드, 몸통이 없다
}

class Start implements SayHi{

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("HI");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("BYE");
	} //인터페이스와연결
	
}
public class Inter01 {

}
