package sorteio.ods;

import java.util.*;

public class ListaOds extends Pacotao {

	public ArrayList<String> ods = new ArrayList<>();
	

	public void listaCompleta() {

		String ods1 = "Erradicação da probleza";
		ods.add(ods1);
		String ods2 = "Fome zero e agricultura sustentável";
		ods.add(ods2);
		String ods3 = "Saúde e Bem-estar";
		ods.add(ods3);
		String ods4 = "Educação de qualidade";
		ods.add(ods4);
		/*String ods5 = "Igualdade de Gênero";
		ods.add(ods5);
		String ods6 = "Água potável e Saneamento";
		ods.add(ods6);
		String ods7 = "Energia Acessivel e Limpa";
		ods.add(ods7);
		String ods8 = "Trabalho decente e crescimento econômico";
		ods.add(ods8);
		String ods9 = "Indústria, Inovação e Infra-estrutra";
		ods.add(ods9);
		String ods10 = "Redução das desigualdades";
		ods.add(ods10);
		String ods11 = "Cidades e comunidades sustentáveis";
		ods.add(ods11);
		String ods12 = "Consumo e produção responsáveis";
		ods.add(ods12);
		String ods13 = "Ação contra a mudança global do clima";
		ods.add(ods13);
		String ods14 = "Vida na água";
		ods.add(ods14);
		String ods15 = "Vida terrestre";
		ods.add(ods15);
		String ods16 = "Paz, justiça e intituições eficazes";
		ods.add(ods16);
		String ods17 = "Parcerias e meios de implementação";
		ods.add(ods17);*/

	}
	
	public void playOds() {
		Collections.shuffle(ods);
		System.out.println(ods.get(1));
	}
 
	public ArrayList<String> getOds() {
		return ods;
	}

	public void setOds(ArrayList<String> ods) {
		this.ods = ods;
	}

	public void mostrar() {
		for (int contador = 0; contador < 17; contador++) {
			System.out.println(ods.get(contador));
		}

	}

}