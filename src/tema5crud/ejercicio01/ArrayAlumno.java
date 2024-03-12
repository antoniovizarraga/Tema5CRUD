package tema5crud.ejercicio01;

/**
 * ArrayAlumno es una clase que representa a un listado de alumnos, y tendrá
 * funciones para modificar, borrar, añadir alumnos... Etc.
 */
public class ArrayAlumno {
	/**
	 * Atributo que será la lista de los alumnos.
	 */
	public static Alumno[] alumnos = new Alumno[30];

	/**
	 * Esta función representa la consulta de la lista de alumnos.
	 * Simplemente recorre el array e imprime algo si el valor
	 * que encuentra no es nulo.
	 */
	public static void imprimirArrayAlumnos() {
		for (Alumno estudiante : alumnos) {
			if (estudiante != null) {
				System.out.println(estudiante);
			}
		}
	}

	/**
	 * Función que añade un Alumno a la lista
	 * Devuelve true o false dependiendo de la situación.
	 * @param nombre Parámetro que representa el nombre del alumno a añadir
	 * @param nota Parámetro que representa la nota del alumno a añadir.
	 * @return Devuelve un booleano true o false dependiendo de si se
	 * pudo añadir al Alumno o no.
	 */
	public static boolean sumarAlumno(String nombre, double nota) {
		Alumno estudiante = new Alumno(nombre, nota);
		int i = 0;
		boolean transaccion = false;

		while (i < alumnos.length && alumnos[i] != null) {
			i++;
		}

		if (i < alumnos.length) {
			alumnos[i] = estudiante;
			transaccion = true;
		}

		return transaccion;
	}

	/**
	 * Función que sirve para modificar a un alumno. Dicho alumno el programa
	 * lo encontrará por su nombre.
	 * @param alumno Parámetro que será el nombre del alumno y que servirá para encontrarle..
	 * @param nota Parámetro que será la nota que modificaremos del alumno ya encontrado.
	 * @return Devuelve true o false indicando si se pudo modificar el alumno o no.
	 */
	public static boolean modificaAlumno(String alumno, double nota) {
		boolean transaccion = false;
		int i = buscarAlumno(alumno);

		if (i < alumnos.length) {
			alumnos[i].setNotaMedia(nota);
			transaccion = true;
		}

		return transaccion;
	}

	/**
	 * Función que servirá para eliminar a un alumno de la lista.
	 * @param alumno El nombre del alumno que será para buscarlo en la lista y
	 * una vez encontrado, eliminarlo.
	 * @return Devuelve true o false para indicar si se encontró al alumno o no.
	 */
	public static boolean eliminaAlumno(String alumno) {
		boolean transaccion = false;
		int i = buscarAlumno(alumno);

		if (i < alumnos.length) {
			alumnos[i] = null;
			transaccion = true;
		}

		return transaccion;
	}

	/**
	 * Función que servirá para encontrar al alumno.
	 * @param alumno Le pasamos el nombre del alumno que usaremos para encontrarle.
	 * @return Devuelve la posición de la lista en la que está dicho alumno.
	 */
	private static int buscarAlumno(String alumno) {
		int i = 0;

		while (i < alumnos.length && (alumnos[i] == null || !alumnos[i].getNombre().equals(alumno))) {
			i++;
		}
		return i;
	}
}
