package sorteio.ods;

import java.util.Scanner;

public class PrincipalSorteio {

	public static void main(String[] args) throws InterruptedException {

		ListaSorteados listasorteados = new ListaSorteados();
		Sorteio sorteio = new Sorteio();
		SuperClasse pacotao = new SuperClasse();
		Menu m = new Menu();
		ListaOds ods = new ListaOds();
		Scanner leia = new Scanner(System.in);
		
		ods.listaCompleta();
		listasorteados.jaApresentado();
		m.primeiroAguarda();
		
		do {
			m.menu();
			pacotao.setOpcao(leia.nextInt());
			switch (pacotao.getOpcao()) {
			
			case 1:
				sorteio.cadastro();
				break;
				
			case 2:
				m.Sorteando();
				ods.playOds();
				break;

			case 3:
				m.Sorteando();
				sorteio.playSorteio();
				break;

			case 4:
				listasorteados.ultimoTres();
				break;

			case 5:
				m.saindo();
				System.out.println();
				System.out.println("\nFIM DO PROGRAMA");
				break;

			default:
				System.out.println("");
				System.err.println("OPÇÃO INVALIDA!");
				System.out.println("");
				break;
			}// switch
		} while (pacotao.getOpcao() != 5);
	}
}
