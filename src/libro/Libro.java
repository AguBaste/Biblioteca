package libro;

public class Libro {
	
	//Atributos del libro
	private String titulo;
	private String autor;
	private String genero;
	private int anoPublicacion;
	
	//Constructor 
	public Libro(String titulo,String autor,String genero,int anoPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anoPublicacion = anoPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

}
