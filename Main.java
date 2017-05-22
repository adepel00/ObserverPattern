
public class Main {

	public static void main(String[] args) {
		Bateria bateria = new Bateria();
		Obs1 obs1 = new Obs1();
		Obs2 obs2 = new Obs2();
		bateria.addObserver(obs1);
		bateria.addObserver(obs2);
		bateria.setCarga(100);
	}
}
