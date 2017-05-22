import java.util.Observable;

public class Bateria extends Observable {
	private boolean cargando;
	private int carga;
	private int tiempoRestante; //En minutos
	
	public boolean isCargando() {
		return cargando;
	}

	public void setCargando(boolean cargando) {
		if(cargando != this.cargando){
			this.cargando = cargando;
			notifica();
		}
	}

	
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		if(carga != this.carga && carga >= 0){
			this.carga = carga;
			this.tiempoRestante = carga * 10;
			notifica();
		}
	}

	
	
	public int getTiempoRestante() {
		return tiempoRestante;
	}

	public void setTiempoRestante(int tiempoRestante) {
		if(tiempoRestante != this.tiempoRestante){
			this.tiempoRestante = tiempoRestante;
			notifica();
		}
	}
	
	private void notifica(){
		setChanged();
		notifyObservers();
	}
}
