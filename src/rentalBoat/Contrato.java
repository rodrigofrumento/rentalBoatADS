package rentalBoat;

import java.util.ArrayList;
import java.util.List;

public class Contrato {
	List<Embarcacao> listaEmbarcacao = new ArrayList<>();

	// Metodo para adicionar
	public void adicionarEmbarcacao(Embarcacao boat) {
		this.listaEmbarcacao.add(boat);
	}

	public double calcularAluguel() {
		double total = 0.0;
		for (Embarcacao embarcacao : this.listaEmbarcacao) {
			total += embarcacao.getPrecoHora();
		}
		return total;
	}

}
