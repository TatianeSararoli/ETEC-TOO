package Principal;

//Classe Canguru - Especializa��o da Classe Mam�fero

public class Canguru extends Mamifero { //Classe Canguru estende Mam�fero
	
	public void usarBolsa() { //M�todo abstrato
		System.out.println ("Usando Bolsa"); //Emite na tela: Usando Bolsa
	}
	
	@Override //Sobrepor m�todo
	public void locomover() { //M�todo abstrato
		System.out.println ("Saltando"); //Emite na tela: Saltando
	}

}
