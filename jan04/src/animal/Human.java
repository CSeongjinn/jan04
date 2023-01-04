package animal;

public class Human extends Animal {
	private String ssn;
	final static int NUM = 101;
	static int check = 500;
	
	
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		// -기호 빼기
		ssn = ssn.replaceAll("-","");
		//모자란 자릿수만큼 *로 입력해서 저장
		for(int i=ssn.length();i<13;i++) {
			ssn+="*";
		}
		this.ssn = ssn;
	}
	
	
	public static void main(String[] args) {
		Human human = new Human();
		human.age=10;
		Object h = new Human();
		Animal h2 = new Human();
		human.setSsn("1");
		System.out.println(human.getSsn());		
		
	}
	@Override
	public void sound() {
		System.out.println("[human sound]");
	}
}
