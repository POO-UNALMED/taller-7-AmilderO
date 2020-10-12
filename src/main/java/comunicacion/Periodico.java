package comunicacion;

public class Periodico extends Escrito {
	
	// Attributes.
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	// Constructor.
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	// Getters.
	public String getFecha() {
		return fecha;
	}
	public String getPrimicia() {
		return primicia;
	}
	public String interpretacion() {
		return interpretacion;
	}
	
	// Setters.
	public void setFecha(String fe) {
		fecha = fe;
	}
	public void setPrimicia(String primi) {
		primicia = primi;
	}
	
	// Methods.
	public int palabrasTotales(int palabrasPagina) {
		return  10 * palabrasPagina * this.getPaginas();
	}
	public String toString() {
		return (this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor()+ "\n" + this.getPaginas() + "\n" + fecha + "\n" + primicia);
	}
}
