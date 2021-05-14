package sorteio.ods;

//QUEM JÁ PARTICIPOU DO SORTEIO
import java.util.*;

public class Exbbb extends Pacotao implements Cadastro {

	Scanner leia = new Scanner(System.in);

	ArrayList<String> sorteio = new ArrayList<>();
	
	
	
	
	

	public ArrayList<String> getSorteio() {
		return sorteio;
	}

	public void setSorteio(ArrayList<String> sorteio) {
		this.sorteio = sorteio;
	}

	@Override
	public void cadastro() {

	}

	public void ultimoTres() {
		for (int contador = sorteio.size() - 1; contador > sorteio.size() - 4; contador--) {
			System.out.println(sorteio.get(contador));

		}
	}

	@Override
	public void menu() {

	}

}
