package Principal;

//Classe Lobo - Especialização da Classe Mamífero

public class Lobo extends Mamifero { //Classe Lobo estende Mamífero
		
	@Override //Sobrepor método
	public void emitirSom() { //Método abstrato
		System.out.println ("Auuuuuuuuuuuu!"); //Emite na tela: Auuuuuuuuuuuu!
	}

}
