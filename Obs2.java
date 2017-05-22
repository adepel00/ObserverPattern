import java.util.Observer;
import java.util.Observable;

public class Obs2 implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		Bateria bateria = (Bateria) o;
		System.out.println("Tiempo restante:" + bateria.getTiempoRestante());
		
	}

}
