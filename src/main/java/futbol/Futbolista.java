package futbol;

public class Futbolista implements Comparable<Futbolista> {
	private String nombre;
	private int edad;
	private String posicion;
	
	
	
	public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	public Futbolista() {
		nombre = "Maradona";
		posicion = "delantero";
		edad = 30;
	}
	//ToString
	public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
		
	}
	//equals
	public boolean equals(Futbolista f) {
		if (f == this){
			return true;
		}
		else {
			return false;
		}
	}
	//jugarConLasManos
	public boolean jugarConLasManos() {
		return false;
	}
	//Set y get
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getPosicion() {
		return posicion;
	}



	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	//Fin set y get

	@Override
	public int compareTo(Futbolista o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
