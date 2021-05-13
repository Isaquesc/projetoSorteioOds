package sorteio.ods;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PrincipalSorteio {

	public static void main(String[] args) /*throws InterruptedException */{
		
		Exbbb bbb = new Exbbb();
		Sorteio sorteio = new Sorteio();
		Pacotao pacotao = new Pacotao();
		//SorteandoNumero sorteando = new SorteandoNumero();
		//LendoUltimos ultimo = new LendoUltimos();
		Menu m = new Menu();
		Scanner leia = new Scanner(System.in); 
		
		sorteio.mostrando();
		do {
		//m.menu();
		pacotao.setOpcao(Integer.parseInt(JOptionPane.showInputDialog(
					"            SEJA BEM VINDO         \n"
					+ "[ 1 ]  CADASTRAR NOMES           \n"
					+ "[ 2 ]  CADASTRAR JÁ SORTEADOS    \n"
					+ "[ 3 ]  SORTEAR                   \n"
					+ "[ 4 ]  ULTIMO SORTEADO           \n"
					+ "[ 5 ]  EXIT")));
		
		
		switch(pacotao.getOpcao()) {
		case 1:
			sorteio.cadastro();
			break;
			
		case 2:
			bbb.cadastro();
			break;
			
		case 3:
			sorteio.quem();
			//System.out.println("Sorteando...");
			//Thread.sleep(2000);
			sorteio.anunciando();
			break;
			
		case 4:
			bbb.ultimoTres();
			break;
			
		case 5: 
			System.out.println("FIM DO PROGRAMA");
			break;
			
		default:
			System.out.println("OPCAO INVALIDA!");

		}//switch	
		} while(pacotao.getOpcao() != 5);
	}
}
