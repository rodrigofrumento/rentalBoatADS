package rentalBoat;

public class Lancha extends Embarcacao {
	private String motor;
	private int tempos;

	public String motor() {
		return motor;
	}

	public int tempos() {
		return tempos;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getTempos() {
		return tempos;
	}

	public void setTempos(int tempos) {
		this.tempos = tempos;
	}

	@Override
	public String toString() {
		return "Lancha [motor=" + motor + ", tempos=" + tempos + "]";
	}

	public Lancha(String nome, double precoHora, int tamanho, String motor, int tempos) {
		super(nome, precoHora, tamanho);
		this.motor = motor;
		this.tempos = tempos;
	}

}
