package Principal;

//Classe Cachorro - Especializa��o da Classe Mam�fero

public class Cachorro extends Mamifero { //Classe Cachorro estende Mam�fero
	
	public void enterrarOsso() { //M�todo abstrato
		System.out.println ("Enterrando Osso"); //Emite na tela: Enterrando Osso
	}
	
	public void abanarRabo() { //M�todo abstrato
		System.out.println ("Abanando o Rabo"); //Emite na tela: Abanando o Rabo
	}

}
