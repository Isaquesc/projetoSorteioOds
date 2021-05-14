package sorteio.ods;

import java.util.Scanner;

public class Menu extends SuperClasse implements CadastroInterface {

	Scanner leia = new Scanner(System.in);

	@Override
	public void cadastro() {
	}

	@Override
	public void menu() {

		System.out.println("============== MENU ==============");
		System.out.println("[1] CADASTRAR NOMES");
		System.out.println("[2] SORTEAR ODS");
		System.out.println("[3] SORTEAR NOME!");
		System.out.println("[4] VISUALIZAR OS TRÊS ULTIMOS SORTEADOS");
		System.out.println("[5] EXIT");
		System.out.println("==================================");

	}

	public void primeiroAguarda() throws InterruptedException {
		System.out.print("Iniciando.");
		Thread.sleep(1000);
		System.out.print(" . ");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println();
	}

	public void Sorteando() throws InterruptedException {
		System.out.print("Sorteando.");
		Thread.sleep(1000);
		System.out.print(" . ");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println();
	}

	public void saindo() throws InterruptedException {
		System.out.print("Saindo.");
		Thread.sleep(1000);
		System.out.print(" . ");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println();
	}

}
