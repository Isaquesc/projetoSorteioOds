package sorteio.ods;

import java.util.Scanner;

public class PrincipalSorteio {

	public static void main(String[] args) {

		Exbbb bbb = new Exbbb();
		Sorteio sorteio = new Sorteio();
		Pacotao pacotao = new Pacotao();
		Menu m = new Menu();
		ListaOds ods = new ListaOds();
		Scanner leia = new Scanner(System.in);
		
		ods.listaCompleta();

		do {
			m.menu();
			pacotao.setOpcao(leia.nextInt());
			switch (pacotao.getOpcao()) {
			case 1:
				sorteio.cadastro();
				break;

			case 2:
				sorteio.playSorteio();
				ods.playOds();
				break;

			case 3:
				bbb.ultimoTres();
				break;

			case 4:
				System.out.println("FIM DO PROGRAMA");
				break;

			default:
				System.out.println("OPCAO INVALIDA!");

			}// switch
		} while (pacotao.getOpcao() != 4);
	}
}
