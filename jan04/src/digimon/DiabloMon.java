package digimon;

public class DiabloMon extends Digimon implements Doubling,Bolero {
	
	static int num = 1;
	@Override
	public void Double() {
		// TODO Auto-generated method stub
		System.out.println("두배로 증식함");
		num*=2;
	}

	@Override
	public void PlayBolero() {
		// TODO Auto-generated method stub
		System.out.println("*볼레로 음악이 흘러나온다*");
	}

}
