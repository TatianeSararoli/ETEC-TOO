package Principal;

//Classe Lobo - Especializa��o da Classe Mam�fero

public class Lobo extends Mamifero { //Classe Lobo estende Mam�fero
		
	@Override //Sobrepor m�todo
	public void emitirSom() { //M�todo abstrato
		System.out.println ("Auuuuuuuuuuuu!"); //Emite na tela: Auuuuuuuuuuuu!
	}

}
