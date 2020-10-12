package comunicacion;



public class Alfabeto extends Pictograma {

	// Attributes.
	private String [] letras;
	private String interpretacion;
	
	// Constructors.
	public Alfabeto(String origen, String [] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	// Getters.
	public String interpretacion() {
		return interpretacion;
	}
	
	// Setters.
	public void setInterpretacion(String inter) {
		interpretacion = inter;
	}
	
	// Methods.
	public int cantidadLetras() {
		return letras.length;
	}
	public String toString() {
		return String.join(", ", letras);
	}
}
