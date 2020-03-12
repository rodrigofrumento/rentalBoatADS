package rentalBoat;

import java.util.Scanner;

public class Balcao {
	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");
	private String nome;
	private double precoHora;
	private int tamanho;

	private void lerDadosSuper() {
		System.out.println("Digite o nome da Embarcacao: ");
		this.nome = this.leia.next();
		System.out.println("Digite o valor da Hora: ");
		this.precoHora = this.leia.nextDouble();
		System.out.println("Digite o tamanho da Embarcacao(em pes): ");
		this.tamanho = this.leia.nextInt();
	}

	public static void main(String[] args) {
		new Balcao().processar();
	}

	private void processar() {
		Contrato contrato = new Contrato();
		// Menu
		int op = 0;
		do {
			System.out.println("1 - Alugar JetSki");
			System.out.println("2 - Alugar Lancha");
			System.out.println("3 - Alugar Veleiro");
			System.out.println("4 - Gerar Boleto");
			System.out.println("5 - Finalizar Aplicacao");
			System.out.println("Digite a sua opcao: ");
			op = this.leia.nextInt();
			switch (op) {
			case 1:
				// Jetski
				break;
			case 2:
				// Lancha
				break;
			case 3:
				// veleiro
				break;
			case 4:
				// Gerar boleto
				break;
			case 5:
				// encerrar
				System.out.println("O sistema sera encerrado!");
				break;
			default:
				// Erro
				System.out.println("Opcao Invalida");
				break;
			}
		} while (op != 6);
		this.leia.close();
	}

}
