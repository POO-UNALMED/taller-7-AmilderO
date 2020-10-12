package comunicacion;

public abstract class Pictograma {
	
	// Attributes.
	private String origen;
	
	// Constructors.
	public Pictograma(String origen) {
		super();
		this.origen = origen;
	}
	
	// Getters.
	public String getOrigen() {
		return origen;
	}
	
	// Setters.
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	// Methods.
	abstract String interpretacion ();
	
	public abstract String toString();
	
}