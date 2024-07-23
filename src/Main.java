import java.util.InputMismatchException;
import java.util.Scanner;
import biblioteca.Biblioteca;
import libro.Libro;

public class Main {

	// Creo el objeto scan para leer la consola
	static Scanner scan = new Scanner(System.in);
	
	//Método para imprimir el menú por pantalla 
	private static void imprimirMenu() {
		System.out.println("Menú de opciones:"); 
		imprimirRenglon();
		System.out.println("1: Agregar un nuevo libro");
		System.out.println("2: Listar todos los libros");
		System.out.println("3: Buscar libro por su título");
		System.out.println("4: Eliminar libro");
		System.out.println("5: Salir");
		imprimirRenglon();
		System.out.println("Ingrese una opción...");
	}
	
	//Método para imprimir un renglón echo de ******
	public static void imprimirRenglon() {
		System.out.println("************************");
		}

	private static int obtenerInt() {
		int i = 0;
		while (i == 0) {
			try {
				int nro = scan.nextInt();
				i = nro;
			} catch (InputMismatchException e) {
				System.out.println("Por favór ingrese un valor numérico.");
				scan.next();
				System.out.print("Ingrese valor: ");
			}
		}
		return i;
	}

	public static void main(String[] args) {

		// Creo las variables que voy a utilizar
		Biblioteca biblioteca = new Biblioteca();
		Libro libro;
		int opcion;
		String titulo, autor, genero;
		int anoPublicacion;

		// Muestro por pantalla el menú de opciones

		do {
			imprimirMenu();
			opcion = obtenerInt();
			scan.nextLine();

			// Veo cual es la opción elegida
			switch (opcion) {
			case 1:
				// Obtengo el título
				System.out.println("Ingrese el título del libro");
				titulo = scan.nextLine();
				// Obtengo el autor
				System.out.println("Ingrese el autor del libro");
				autor = scan.nextLine();
				// Obtengo el género
				System.out.println("Ingrese el género del libro");
				genero = scan.nextLine();
				// Obtengo el año
				System.out.println("Ingrese el año de publicación del libro");
				anoPublicacion = scan.nextInt();
				// Creo el libro y lo guardo
				libro = new Libro(titulo, autor, genero, anoPublicacion);
				biblioteca.agregarLibro(libro);
				break;
			case 2:
				imprimirRenglon();
				biblioteca.listarLibros();
				break;
			case 3:
				System.out.println("Ingrese el título del libro que esta buscando.");
				titulo = scan.nextLine();
				biblioteca.imprimirLibro(titulo);
				break;
			case 4:
				System.out.println("Ingrese el título del libro que desea borrar.");
				titulo = scan.nextLine();
				imprimirRenglon();
				biblioteca.eliminarLibro(titulo);
				break;
			case 5:
				System.out.println("Saliendo..."); 
				break;
			default:
				System.out.println("Ingrese una opción válida. Intente nuevamente");
			}
		} while (opcion != 5);
		
		scan.close();
	}

}
