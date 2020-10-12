package comunicacion;

public class Tesis extends Escrito {
	
	// Attributes.
	private String idea;
	private String [] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	// Constructor.
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	// Getters.
	public String getIdea() {
		return idea;
	}
	public String getConclusion() {
		return conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String[] getArgumentos() {
		return argumentos;
	}
	
	// Setters.
	public void setIdea(String id) {
		idea = id;
	}
	public void setConclusion(String conc) {
		conclusion = conc;
	}
	public void setReferencias(String ref) {
		referencias = ref;
	}
	
	// Methods.
	public int palabrasTotales(int palabrasPagina) {
		return  5 * palabrasPagina * this.getPaginas();
	}
	public String toString() {
		return (this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor()+ "\n" + this.getPaginas() + "\n" + idea + "\n" + argumentos.length + "\n" + conclusion + "\n" + referencias);
	}
}
