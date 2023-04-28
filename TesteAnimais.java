package Exercico3;

import java.util.ArrayList;

public class TesteAnimais {

	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<>();
		animal.add("Camelo");
		animal.add("Comprimento:1,50");
		animal.add("4 patas");
		animal.add("Cor:Amarelo");
		animal.add("Ambiente Terra");
		animal.add("Velociade 2.0m/s");
		animal.add("Tubarão");
		animal.add("Comprimento:3,00");
		animal.add("0 patas");
		animal.add("Cor:cinza");
		animal.add("Ambiente: Mar");
		animal.add("Velocidade: 15.0m/s");
		animal.add("Caracteristica:Barbatana e Cauda ");
		animal.add("Urso do Canada");
		animal.add("Comprimento:6 m");
		animal.add("4 patas");
		animal.add("Cor:Vermelho");
		animal.add("Ambiente Terra");
		animal.add("Velociade 8 m/s");
		System.out.println("Zoo");
		for (int i = 0; i <animal.size(); i++) {
			System.out.println("");
			System.out.println(animal.get(i));
										
			
			
		}
	}

}
