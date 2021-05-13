package sorteio.ods;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sorteio extends Pacotao implements Cadastro {

	
	private String [] sorteio = new String[5];
	
	Scanner leia = new Scanner(System.in);

	public String[] getSorteio() {
		return sorteio;
	}

	public void setSorteio(String[] sorteio) {
		this.sorteio = sorteio;
	}
	
	@Override
	public void cadastro() {
		
		for(int contador = 0;contador<sorteio.length;contador++) {
			//System.out.print((contador+1) + " - NOME: ");
			//sorteio[contador] = leia.next();
			sorteio [contador] = JOptionPane.showInputDialog("DIGITE UM NOME: ");
			}//for
		}//cadastro
	
	public void quem() {
		setResultado((int)(Math.random()*sorteio.length));
	}
	
	public void anunciando() {
		JOptionPane.showMessageDialog(null,"PARABENS " + sorteio[getResultado()]);
		//System.out.println("PARABENS " + sorteio[getResultado()]);
	}

	
	@Override
	public void menu() {
		
	}
}
