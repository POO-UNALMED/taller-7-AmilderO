package comunicacion;

public abstract class Escrito extends Pictograma{
	
	// Attributes.
	private String titulo;
	private String autor;
	private int paginas;
	
	// Constructors.
	public Escrito(String origen, String titulo, String autor, int paginas) {
		super(origen);
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	// Getters - Setters.
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
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	// Methods.
	public String resumen() {
		String r = this.getOrigen() + "\n";
		r += this.titulo + "\n";
		r += this.autor + "\n";
		r += this.paginas;
		return  r;
	}
	
	abstract int palabrasTotales(int palabrasPagina);
	
}