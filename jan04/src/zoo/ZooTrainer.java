package zoo;
//사육사
public class ZooTrainer {
	public void feed(Predator predator) {
		System.out.println(predator.getName()+"에게 밥을 주다");
	}
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("제리");
		
		Lion lion = new Lion();
		lion.setName("레오");
		
		ZooTrainer trainer = new ZooTrainer();
		trainer.feed(cat);
		trainer.feed(lion);
	}
}
