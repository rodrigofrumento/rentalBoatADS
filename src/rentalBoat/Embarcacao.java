package rentalBoat;

public abstract class Embarcacao {
	private String nome;
	private double precoHora;
	private int tamanho;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Embarcacao [nome=" + nome + ", precoHora=" + precoHora + ", tamanho=" + tamanho + "]";
	}

	public Embarcacao(String nome, double precoHora, int tamanho) {
		super();
		this.nome = nome;
		this.precoHora = precoHora;
		this.tamanho = tamanho;
	}

}
