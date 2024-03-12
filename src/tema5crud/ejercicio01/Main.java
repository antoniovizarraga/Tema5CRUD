package tema5crud.ejercicio01;

import tema5crud.GetValue;

public class Main {

	/**
	 * Función que contiene el menú de acciones del usuario y lo imprimirá.
	 */
	public static void menu() {

		System.out.println("ALUMNOS");
		System.out.println("===================" + "\n");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno.");
		System.out.println("3. Modificar.");
		System.out.println("4. Borrar.");
		System.out.println("5. Salir.");

	}

	public static void main(String[] args) {
		int userValue;
		String nombre;
		double nota;

		do {
			menu();
			userValue = GetValue.getInteger("Introduzca un número para elegir una opción: ");
			GetValue.SCANNER.nextLine();
			switch (userValue) {
			case 1:
				// Imprimir los alumnos
				ArrayAlumno.imprimirArrayAlumnos();
				break;
			case 2: // Crear alumno
				nombre = GetValue.getString("Introduzca el nombre del alumno: ");

				nota = GetValue.getDouble("Introduzca la nota media del alumno:");
				GetValue.SCANNER.nextLine();

				if (ArrayAlumno.sumarAlumno(nombre, nota)) {
					System.out.println("Añadido correctamente");
				} else {
					System.out.println("No se pudo añadir el Alumno");
				}
				break;
			case 3: // Modificar alumno
				nombre = GetValue.getString("Introduzca el nombre del alumno: ");

				nota = GetValue.getDouble("Introduzca la nota media del alumno:");
				GetValue.SCANNER.nextLine();

				if (ArrayAlumno.modificaAlumno(nombre, nota)) {
					System.out.println("Alumno modificado correctamente");
				} else {
					System.out.println("No se ha encontrado al alumno");
				}
				break;
			case 4:
				nombre = GetValue.getString("Introduzca el nombre del alumno: ");

				if (ArrayAlumno.eliminaAlumno(nombre)) {
					System.out.println("Alumno eliminado correctamente");
				} else {
					System.out.println("Alumno no encontrado");
				}
				break;
			}
		} while (userValue != 5);

		GetValue.SCANNER.close();
	}

}
