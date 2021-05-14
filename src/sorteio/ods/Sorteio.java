package sorteio.ods;

import java.util.*;

public class Sorteio extends Pacotao implements Cadastro {

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
		System.out.println("Quantas pessoas você quer cadastrar?");
		int pessoas = leia.nextInt();
		for (int contador = 0; contador < pessoas; contador++) {
			System.out.print("Nome: ");
			sorteio.add(contador, leia.next());
		}
		System.out.println("CADASTRADO COM SUCESSO");
	}

	public void playSorteio() {

		Collections.shuffle(sorteio);
		System.out.println(sorteio.get(1));

	}

	@Override
	public void menu() {

	}
}
