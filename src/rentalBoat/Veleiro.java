package rentalBoat;

public class Veleiro extends Embarcacao {
	private String tipo;

	public String tipo() {
		return tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Veleiro [tipo=" + tipo + "]";
	}

	public Veleiro(String nome, double precoHora, int tamanho, String tipo) {
		super(nome, precoHora, tamanho);
		this.tipo = tipo;
	}

}
