package sorteio.ods;

import java.util.*;

public class ListaOds extends SuperClasse {

	public ArrayList<String> ods = new ArrayList<>();

	public void listaCompleta() {
		ods.add("Erradicacao da probleza");
		ods.add("Fome zero e agricultura sustentavel");
		ods.add("Saude e Bem-estar");
		ods.add("Educacao de qualidade");
		ods.add("Igualdade de Genero");
		ods.add("agua potavel e Saneamento");
		ods.add("Energia Acessivel e Limpa");
		ods.add("Trabalho decente e crescimento economico");
		ods.add("Industria, Inovacao e Infra-estrutra");
		ods.add("Reducao das desigualdades");
		ods.add("Cidades e comunidades sustentaveis");
		ods.add("Consumo e producao responsaveis");
		ods.add("Acao contra a mudan�a global do clima");
		ods.add("Vida na agua");
		ods.add("Vida terrestre");
		ods.add("Paz, justica e intituicoees eficazes");
		ods.add("Parcerias e meios de implementacao");
	}

	//
	public void playOds() {
		Collections.shuffle(ods);
		System.out.println("\n");
		System.err.println("PROXIMO TEMA: " + ods.get(1));
		System.out.println("");
		System.out.println("");
	}

	public ArrayList<String> getOds() {
		return ods;
	}

	public void setOds(ArrayList<String> ods) {
		this.ods = ods;
	}

}