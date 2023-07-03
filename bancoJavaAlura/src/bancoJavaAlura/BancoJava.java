package bancoJavaAlura;

import java.util.Scanner;

public class BancoJava {

	static String nome = "Haroldo Morais";
	static String tipoConta = "Corrente";
	static double saldo = 2600.00;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		cliente(sc);
		operacaoBanco(sc);

	}

	public static void cliente(Scanner sc) {

		System.out.println("**************BANCO JAVA***************");
		System.out.println("\n\tDADOS INICIAIS DO CLIENTE");
		System.out.println("\nNome do cliente: " + nome);
		System.out.println("Tipo de conta: " + tipoConta);
		System.out.println("Saldo atual: " + saldo);
		System.out.println("\n***************************************");

	}

	public static void operacaoBanco(Scanner sc) {

		int opcao = 0;
		String menu = """

				== DIGITE A SUA OPÉRAÇÃO ==

				1- Consultar saldo
				2- Receber valor
				3- Transferir valor
				4- Sair

				""";

		while (opcao != 4) {
			System.out.println(menu);
			opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.println("O seu saldo atual é: " + saldo);
			} else if (opcao == 2) {
				receberValor(sc, opcao);
			} else if (opcao == 3) {
				transferirValor(sc, opcao);
			} else {
				System.out.println("obrigado por usa o nosso serviço.");
			}

		}

	}

	public static void receberValor(Scanner sc, int opcao) {

		System.out.println("Introduza um valor para receber");
		double receberDinheiro = sc.nextDouble();
		saldo = saldo + receberDinheiro;
		System.out.println("Operação feita!!");

		System.out.println("Gostaria de efetuar outra operação(s/n)");
		String resposta = sc.next();
		if (resposta.equalsIgnoreCase("s")) {
			cliente(sc);
		} else {
			System.out.println("obrigado por usa o nosso serviço.");
		}
	}

	public static void transferirValor(Scanner sc, int opcao) {

		System.out.println("Introduza m valor para transferir");
		double transferirDinheiro = sc.nextDouble();
		saldo = saldo - transferirDinheiro;
		System.out.println("Operação feita!!");
		System.out.println("Saldo atual: " + saldo);

		System.out.println("Gostaria de efetuar outra operação(s/n)");
		String resposta = sc.next();
		if (resposta.equalsIgnoreCase("s")) {
			cliente(sc);
		} else {
			System.out.println("obrigado por usa o nosso serviço.");
		}
	}

}
