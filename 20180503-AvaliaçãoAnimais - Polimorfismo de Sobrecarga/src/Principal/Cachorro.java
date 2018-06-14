package Principal;

//Classe Cachorro - Especializa��o da Classe Lobo

public class Cachorro extends Lobo { //Classe Cachorro estende Lobo
	
	@Override //Sobrepor m�todo
	public void emitirSom() { //M�todo abstrato
		System.out.println ("Au!Au!Au!"); //Emite na tela: Au!Au!Au!
	}
	
	public void reagir(String frase) { //Sobrecarga do m�todo
		if(frase.equals ("Toma Comida") || frase.equals ("Ol�")) {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	//Poliformas de Rea��o
	public void reagir(int hora, int min) { //Sobrecarga do m�todo
		if(hora < 12) {
			System.out.println("Abanar");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}
	
	public void reagir(boolean dono) { //Sobrecarga do m�todo
		if(dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
		}
	}
	
	public void reagir(int idade, float peso) { //Sobrecarga do m�todo
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