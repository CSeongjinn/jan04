package what;
//혹시 이거 될까요?
//인스턴스를 하나만 만들기 가능?
//ctrl+shift+L 단축키 목록
public class What {
	public static void main(String[] args) {
		Human h1= Human.getInstance();
		Human h2= Human.getInstance();
		Human h3= Human.getInstance();
		System.out.println(h1==h2);
	}
}
//데이터베이스 연결(p243)
class Human{
	private static Human human = new Human();
	private Human() {}
	public static Human getInstance() {
		return human;
	} //static이 안붙은 메소드는 객체 생성 후에 실행해야한다.
}

//보충수업?