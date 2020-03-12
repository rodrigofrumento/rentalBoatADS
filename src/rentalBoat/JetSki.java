package rentalBoat;

public class JetSki extends Embarcacao {
	private boolean isDobravel;

	public boolean isDobravel() {
		return isDobravel;
	}

	public void setDobravel(boolean isDobravel) {
		this.isDobravel = isDobravel;
	}

	@Override
	public String toString() {
		return "JetSki [isDobravel=" + isDobravel + "]";
	}

	public JetSki(String nome, double precoHora, int tamanho, boolean isDobravel) {
		super(nome, precoHora, tamanho);
		this.isDobravel = isDobravel;
	}

}
