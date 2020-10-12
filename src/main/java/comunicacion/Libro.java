package comunicacion;

public class Libro extends Escrito {
	
	// Attributes.
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	// Constructors.
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	// Getters.
	public String getCo_autor() {
		return co_autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public String getEdicion() {
		return edicion;
	}
	public String interpretacion() {
		return interpretacion;
	}
	
	// Setters.
	public void setCo_autor(String coautor) {
		co_autor = coautor;
	}
	public void setEditorial(String edit) {
		editorial = edit;
	}
	public void setEdicion(String edi) {
		edicion = edi;
	}
	
	// Methods.
	public int palabrasTotales(int palabrasPagina) {
		return  2 * palabrasPagina * this.getPaginas();
	}
	public String toString() {
		return (this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor()+ "\n" + this.getPaginas() + "\n" + co_autor + "\n" + editorial + "\n" + edicion);
	}
}
