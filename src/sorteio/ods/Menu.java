package sorteio.ods;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu extends Pacotao implements Cadastro {
	
	Scanner leia = new Scanner(System.in);

	@Override
	public void cadastro() {
	}
	
	@Override
	public void menu() {
		
		setOpcao(Integer.parseInt(JOptionPane.showInputDialog(
				"            SEJA BEM VINDO                 \n"
				+ "[ 1 ] CADASTRAR NOMES        \n"
				+ "[ 2 ] CADASTRAR JÁ SORTEADOS \n"
				+ "[ 3 ] PLAY                   \n"
				+ "[ 4 ] ULTIMO TRÊS SORTEADOS  \n"
				+ "[ 5 ] EXIT")));
	
		/*System.out.println("======== MENU =========");
		System.out.println("[1] INSERINDO NOMES");
		System.out.println("[2] CADASTRANDO EX-BBB");
		System.out.println("[3] LEST GO ! P L A Y ");
		System.out.println("[4] ULTIMOS EX-BBB");
		System.out.println("[5] EXIT");*/
		
	}


}
