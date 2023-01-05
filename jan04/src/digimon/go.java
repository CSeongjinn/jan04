package digimon;

public class go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiabloMon di = new DiabloMon();
		for(int i=0;i<10;i++) {
			di.Double();
			System.out.println(di.num);
			di.PlayBolero();
		}
	}

}
