package Principal;

//Classe Cachorro - Especialização da Classe Mamífero

public class Cachorro extends Mamifero { //Classe Cachorro estende Mamífero
	
	public void enterrarOsso() { //Método abstrato
		System.out.println ("Enterrando Osso"); //Emite na tela: Enterrando Osso
	}
	
	public void abanarRabo() { //Método abstrato
		System.out.println ("Abanando o Rabo"); //Emite na tela: Abanando o Rabo
	}

}
