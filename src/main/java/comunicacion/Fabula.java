package comunicacion;

public class Fabula extends Escrito {
	
	// Attributes.
	private String ensenanza;
	private String interpretacion;
	
	// Constructor.
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	// Getters.
	public String getEnsenanza() {
		return ensenanza;
	}
	public String interpretacion() {
		return interpretacion;
	}
	
	// Setters.
	public void setEnsenanza(String enz) {
		ensenanza = enz;
	}
	
	// Methods.
	public int palabrasTotales(int palabrasPagina) {
		return  1 * palabrasPagina * this.getPaginas();
		
	}
	public String toString() {
		return (this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor()+ "\n" + this.getPaginas() + "\n" + ensenanza);
	}
}
