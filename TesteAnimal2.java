package Exercico3;

	    import java.util.ArrayList;
		import java.util.Scanner;

		public class TesteAnimal2 {

			public static void main(String[] args) {
				String nome;	
				String cor;
				String ambiente;
				String alimento;
				String caracteristicas;
				int comprimento;
				int patas;
				float velocidade;

				ArrayList<String> listadeTipo = new ArrayList<String>();
				ArrayList<String> listadeNome = new ArrayList<String>();
				ArrayList<String> listadeCor = new ArrayList<String>();
				ArrayList<String> listadeAmbiente = new ArrayList<String>();
				ArrayList<String> listadeAlimento = new ArrayList<String>();
				ArrayList<String> listadeCaracteristicas = new ArrayList<String>();
				ArrayList<Integer> listadeComprimento = new ArrayList<Integer>();
				ArrayList<Integer> listadePatas = new ArrayList<Integer>();
				ArrayList<Float> listadeVelocidade = new ArrayList<Float>();

				System.out.println("Informe Animais: ");
				for (int i=0; i < 10; i++) {
				    Scanner input = new Scanner(System.in);

					System.out.println(" ");   
					System.out.println("Nome: ");
					nome = input.nextLine(); 			  
					System.out.println("Cor: ");
					cor =  input.nextLine();
					System.out.println("Ambiente: ");
					ambiente =  input.nextLine();
					System.out.println("Alimento: ");
					alimento = input.nextLine();
					System.out.println("Patas: ");
					patas =  input.nextInt();
					System.out.println("Comprimento: ");
					comprimento =  input.nextInt();
					System.out.println("Velocidade: ");
					velocidade = input.nextFloat();

					listadeTipo.add("Mamifero");
					listadeNome.add(nome);			
					listadeCor.add(cor);
					listadeAmbiente.add(ambiente);
					listadeAlimento.add(alimento);
					listadeComprimento.add(comprimento);
					listadePatas.add(patas);
					listadeVelocidade.add(velocidade);
					listadeCaracteristicas.add(" ");

					 }

				System.out.println("Informe Tipos dos Peixes: ");

				for (int i=0; i < 10; i++) {
					Scanner input = new Scanner(System.in);
					System.out.println("");
					System.out.println("Nome: ");
					nome = input.nextLine(); 			  
					System.out.println("Cor: " );
					cor =  input.nextLine();
					System.out.println("Ambiente: " );
					ambiente =  input.nextLine();
					System.out.println("Caracteristicas: " );
					caracteristicas =  input.nextLine();
					System.out.println("Comprimento: ");
					comprimento =  input.nextInt();
					System.out.println("Velocidade: ");
					velocidade = input.nextFloat();

					listadeTipo.add("Peixe");
					listadeNome.add(nome);			
					listadeCor.add(cor);
					listadeAmbiente.add(ambiente);
					listadeCaracteristicas.add(caracteristicas);
					listadeComprimento.add(comprimento);
					listadeVelocidade.add(velocidade);

			    }
				Animal a = new Animal();
				Peixe p = new Peixe();
				Mamiferos m = new Mamiferos();

			    System.out.println(" ");
			    System.out.println("LISTA");
			    System.out.println("");

				for (int x=0; x< listadeTipo.size(); x++) {
				  a.setNome(listadeNome.get(x));
				  a.setComprimento(listadeComprimento.get(x));
				  a.setAmbiente(listadeAmbiente.get(x));
				  a.setCor(listadeCor.get(x));
				  a.setVelocidade(listadeVelocidade.get(x));

				  switch (listadeTipo.get(x)) {
					case "Mamifero": {				
					    a.alteraPatas(listadePatas.get(x));
					    m.alteraAlimento(listadeAlimento.get(x));

					    System.out.println(" Tipo : " + listadeTipo.get(x));
					    System.out.println(a.toString());
					    System.out.println(m.toString());
					    System.out.println(" ");
					    break; 

						}
					case "Peixe": {
					     a.alteraPatas(p.getPatas());
					     p.alteraCaracteristica(listadeCaracteristicas.get(x));

					     System.out.println(" Tipo            : " + listadeTipo.get(x)); 
					     System.out.println(a.toString());
					     System.out.println(p.toString());
					     System.out.println("  ");
					     break;
					}

				}
			}
	}
}
