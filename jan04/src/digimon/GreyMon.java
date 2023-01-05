package digimon;

public class GreyMon extends Digimon implements Evol{

	@Override
	public void Evolve() {
		// TODO Auto-generated method stub
		System.out.println("진화하여 스컬그레이몬이 됐다");
		this.name = "SkullGreyMon";
	}

}
