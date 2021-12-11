package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre, int edad,short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	//ToString
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
	public int compareTo(Portero o) {
		// TODO Auto-generated method stub
		return this.golesRecibidos-o.golesRecibidos;
	}
}
