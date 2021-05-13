package sorteio.ods;
//QUEM JÁ PARTICIPOU DO SORTEIO
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exbbb extends Pacotao implements Cadastro {
	
	Scanner leia = new Scanner(System.in);
	
	private String [] listabbb = new String [5];
	
		public String[] getListabbb() {
			return listabbb;
		}

		public void setListabbb(String[] listabbb) {
			this.listabbb = listabbb;
		}

	@Override
	public void cadastro() {
		for(int contador = 0; contador < listabbb.length; contador++) {
			//System.out.print("Digite um nome: ");
			//listabbb[contador] = leia.next();
			listabbb[contador] = JOptionPane.showInputDialog("Digite um nome: ");
			}//for
		}//cadastro
	
		public void ultimoTres() {
		for(int contador = listabbb.length - 1; contador > listabbb.length - 4;contador--) {
		//System.out.println(listabbb[contador]); 
		JOptionPane.showMessageDialog(null,listabbb[contador]);
		}
	}

	@Override
	public void menu() {
		
	}
	
}

	
