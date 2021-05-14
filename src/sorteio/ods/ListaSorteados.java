package sorteio.ods;

//QUEM JÁ PARTICIPOU DO SORTEIO
import java.util.*;

public class ListaSorteados extends SuperClasse implements CadastroInterface {

	Scanner leia = new Scanner(System.in);

	ArrayList<String> sorteio = new ArrayList<>();

	public void jaApresentado() {

		String ods1 = "ERICA";
		sorteio.add(ods1);
		String ods2 = "GILSON";
		sorteio.add(ods2);
		String ods3 = "JOAO";
		sorteio.add(ods3);
		String ods4 = "PATRICK";
		sorteio.add(ods4);
		String ods5 = "GONZALES";
		sorteio.add(ods5);
		String ods6 = "HELENA";
		sorteio.add(ods6);
		String ods7 = "JACKELINE";
		sorteio.add(ods7);
		String ods8 = "ISAQUE";
		sorteio.add(ods8);
		String ods9 = "DANILO";
		sorteio.add(ods9);
		String ods10 = "GABRIELA";
		sorteio.add(ods10);
		String ods11 = "VITORIA";
		sorteio.add(ods11);
		String ods12 = "ALEX";
		sorteio.add(ods12);
		String ods13 = "NATALIA";
		sorteio.add(ods13);
		String ods14 = "JOEL";
		sorteio.add(ods14);
		String ods15 = "ELTON";
		sorteio.add(ods15);

	}

	public ArrayList<String> getSorteio() {
		return sorteio;
	}

	public void setSorteio(ArrayList<String> sorteio) {
		this.sorteio = sorteio;
	}

	@Override
	public void cadastro() {

		for (int contador = 0; contador < 6; contador++) {
			System.out.print("Nome: ");
			sorteio.add(contador, leia.next());
		}
	}

	public void ultimoTres() {
		System.out.println("OS ULTIMOS A APRESENTAR FORAM:");
		for (int contador = sorteio.size() - 1; contador > sorteio.size() - 4; contador--) {
			System.out.println();
			System.err.println(contador + " - " + sorteio.get(contador));
			System.out.println();
		}
	}

	@Override
	public void menu() {

	}

}
