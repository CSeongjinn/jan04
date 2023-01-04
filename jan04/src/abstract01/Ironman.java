package abstract01;

public class Ironman extends Hero {
	String Jarvis;
	
	public void callJarvis() {
		System.out.println("Jarvis calling");
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("레이저");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	
}
