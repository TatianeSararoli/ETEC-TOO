package Principal;

//Classe Canguru - Especialização da Classe Mamífero

public class Canguru extends Mamifero { //Classe Canguru estende Mamífero
	
	public void usarBolsa() { //Método abstrato
		System.out.println ("Usando Bolsa"); //Emite na tela: Usando Bolsa
	}
	
	@Override //Sobrepor método
	public void locomover() { //Método abstrato
		System.out.println ("Saltando"); //Emite na tela: Saltando
	}

}
