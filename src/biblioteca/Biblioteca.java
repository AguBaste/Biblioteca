package biblioteca;
import java.util.ArrayList;
import java.util.List;
import libro.Libro;

public class Biblioteca {

	// Atributos
	private List<Libro> libros;
	// Métodos

	// Mostar toda la info del libro
	public void mostrarInfo(Libro libro) {
		System.out.println("Título: " + libro.getTitulo());
		System.out.println("Autor: " + libro.getAutor());
		System.out.println("Genero: " + libro.getGenero());
		System.out.println("Año de publicación: " + libro.getAnoPublicacion());
		System.out.println("************************\n");
	}

	// Agregar nuevo libro
	public void agregarLibro(Libro libro) {

		if (libro != null) {
			// Validación del título
			if (libro.getTitulo().isEmpty()) {
				System.out.println("El título no puede estar vacío.");
				return;
			}
			// Validación de autor
			if (libro.getAutor().isEmpty()) {
				System.out.println("El nombre de autor no puede estar vacío.");
				return;
			}
			// Validación de género
			if (libro.getGenero().isEmpty()) {
				System.out.println("El género del libro no puede estar vacío.");
				return;
			}
			// Validación de año de publicación
			if (libro.getAnoPublicacion() < 0) {
				System.out.println("El año de publicación no puede estar vacío.");
				return;
			}
			this.libros.add(libro);
			System.out.println("Libro agregado correctamente.");
		} else {
			System.out.println("Error al agregar el libro. El contenido no puede ser nulo.");
		}

	}

	// Listar los libros
	public void listarLibros() {
		if (this.libros.isEmpty()) {
			System.out.println("No hay libros guardados.");
			return;
		} else {
			System.out.println("Listado de todos los libros guardados.");
			System.out.println("************************\n");
			for (Libro libro : this.libros) {
				mostrarInfo(libro);
			}
		}
	}

	// Buscar libro e imprimir los detalles
	public void imprimirLibro(String titulo) {
		Libro libroImprimir = buscarLibro(titulo);
		System.out.println("Busqueda para el libro: " + titulo);
		System.out.println("************************\n"); 
		if (libroImprimir != null) {
			System.out.println("Detalles del libro.");
			System.out.println("************************\n");
			mostrarInfo(libroImprimir);
			System.out.println("************************\n");
		} else {
			System.out.println("No hay ningún libro con ese título.");
		}

	}

	// Buscar libro por título
	public Libro buscarLibro(String titulo) {
		for (Libro libro : this.libros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				return libro;
			}
		}
		return null;
	}

	// Eliminar libro
	public void eliminarLibro(String titulo) {
		Libro libroEliminado = buscarLibro(titulo);
		if (libroEliminado != null) {
			this.libros.remove(libroEliminado);
			System.out.println("El libro "+ titulo + " fue eliminado correctamente.");
		} else {
			System.out.println("No se pudo eliminar el libro "+titulo +" porque no existe.");
		}
	}



	// Constructor
	public Biblioteca() {
		
		this.libros = new ArrayList<>();
	}

}
