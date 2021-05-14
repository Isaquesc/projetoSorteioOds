package sorteio.ods;

import java.util.*;

public class Sorteio extends SuperClasse implements CadastroInterface {

	ArrayList<String> sorteio = new ArrayList<>();

	Scanner leia = new Scanner(System.in);

	public ArrayList<String> getSorteio() {
		return sorteio;
	}

	public void setSorteio(ArrayList<String> sorteio) {
		this.sorteio = sorteio;
	}

	// CADASTRAR PESSOAS
	public void cadastro() {
		System.out.println("QUANTAS PESSOAS VOCÊ QUER CADASTRAR?");
		int pessoas = leia.nextInt();
		for (int contador = 0; contador < pessoas; contador++) {
			System.out.print("Nome: ");
			sorteio.add(contador, leia.next());
		}
		System.out.println("");
		System.out.println("");
		System.err.println("CADASTRADO COM SUCESSO");
		System.out.println("");
		System.out.println("");
	}

	public void playSorteio() {

		Collections.shuffle(sorteio);
		System.out.println("");
		System.out.println("");
		System.err.println(sorteio.get(1) + " FOI SORTEADE!!");
		System.out.println("");
		System.out.println("");

	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub

	}

}
