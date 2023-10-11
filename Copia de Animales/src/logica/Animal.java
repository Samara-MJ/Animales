package logica;

public abstract class Animal {
	protected String nombre;
	
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public abstract String sonidocaracteristico();

}
