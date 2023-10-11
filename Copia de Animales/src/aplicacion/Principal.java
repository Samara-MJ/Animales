package aplicacion;

import logica.Animal;
import logica.Gato;
import logica.Perro;

public class Principal {
	
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		String nombre = "Shaiel";
		
		Animal a;
		
		a = new Perro(nombre);
		System.out.println(a.sonidocaracteristico());
		
		a = new Gato(nombre);
		System.out.println(a.sonidocaracteristico());
		
			}

}
