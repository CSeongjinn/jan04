package abstract01;

public class Avengers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ironman i = new Ironman();
		Hulk h = new Hulk();
		Captain c = new Captain();
		Thor t = new Thor();
		
		i.attack();
		h.attack();
		c.attack();
		t.attack();
		
		//attack을 한번에
		Hero[] aven = new Hero[4];
		aven[0] = i; //부모타입이더라도 생성은 Ironman
		aven[1] = h;
		aven[2] = c;
		aven[3] = t;
		for(int a=0;a<aven.length;a++) {
			aven[a].attack();
		}
		Hero h1 = new Ironman();
		h1.attack();
		h1.defense();
//		h1.callJarvis(); Hero에 없는 메소드라 사용할 수 없음
		((Ironman)h1).Jarvis = "";
		((Ironman)h1).callJarvis();
		
		Ironman h2 = (Ironman)h1;
		h2.callJarvis();
		//부모타입, super타입으로 변환 가능
		/*
		 * 다형성
		 * 다형성은 동적바인딩을 지원해야 합니다.
		 * 
		 * 런타임때 최종 타입이 결정되는 것
		 * 
		 * 다형성의 한계 : 상위 클래스에 만들어진 메소드에 한해 가능
		 */
		
	}

}

