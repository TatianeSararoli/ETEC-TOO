package Principal;

//Classe Cachorro - Especialização da Classe Lobo

public class Cachorro extends Lobo { //Classe Cachorro estende Lobo
	
	@Override //Sobrepor método
	public void emitirSom() { //Método abstrato
		System.out.println ("Au!Au!Au!"); //Emite na tela: Au!Au!Au!
	}
	
	public void reagir(String frase) { //Sobrecarga do método
		if(frase.equals ("Toma Comida") || frase.equals ("Olá")) {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	//Poliformas de Reação
	public void reagir(int hora, int min) { //Sobrecarga do método
		if(hora < 12) {
			System.out.println("Abanar");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}
	
	public void reagir(boolean dono) { //Sobrecarga do método
		if(dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
		}
	}
	
	public void reagir(int idade, float peso) { //Sobrecarga do método
		if(idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Abanar e Latir");
			}
		}
	}
}