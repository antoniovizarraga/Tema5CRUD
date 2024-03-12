package tema5crud.ejercicio01;

public class Alumno {

	/**
	 * Atributo que define el nombre del Alumno.
	 */
	public String nombre = "";

	/**
	 * Atributo que define la nota media del Alumno.
	 */
	public double notaMedia;

	/**
	 * Función constructora sin parámetros.
	 */
	public Alumno() {

	}

	/**
	 * Función constructora con todos los parámetros.
	 * 
	 * @param nombre    El nombre del alumno.
	 * @param notaMedia La nota media del alumno.
	 */
	public Alumno(String nombre, double notaMedia) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		this.notaMedia = notaMedia;
	}

	/**
	 * Función que devuelve el atributo Nombre
	 * 
	 * @return Devuelve el atributo Nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Función que establece un valor al atributo Nombre.
	 * 
	 * @param nombre Atributo nombre pasado como parámetro.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Función que devuelve la nota media del alumno.
	 * 
	 * @return Devuelve el atributo notaMedia del alumno.
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Función que establece un valor al atributo notaMedia del alumno.
	 * 
	 * @param notaMedia Atributo notaMedia pasado como parámetro.
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	/**
	 * Función que muestra la información del Alumno.
	 */
	@Override
	public String toString() {
		String cadena = "";
		
		cadena += "Nombre: " + this.nombre + " Nota: " + this.notaMedia;
		
		return cadena;
	}
}
