package sorteio.ods;

import java.util.Scanner;

public class Menu extends Pacotao implements Cadastro {

	Scanner leia = new Scanner(System.in);

	@Override
	public void cadastro() {
	}

	@Override
	public void menu() {

		System.out.println("======== MENU =========");
		System.out.println("[1] INSERINDO NOMES");
		System.out.println("[2] LEST GO ! P L A Y ");
		System.out.println("[3] QUEM FOI OS ULTIMOS");
		System.out.println("[4] EXIT");

	}
}
