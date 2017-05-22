import java.util.Observer;
import java.util.Observable;

public class Obs1 implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		Bateria bateria = (Bateria) o;
		System.out.println("Carga: " + bateria.getCarga());
		bateria.setCarga(bateria.getCarga() - 10);
	}
}
