package Principal;

//Classe Tartaruga - Especializa��o da Classe Reptil

public class Tartaruga extends Reptil { //Classe Tartaruga estende Reptil
	
	@Override //Sobrepor m�todo
	public void locomover() { //M�todo abstrato
		System.out.println ("Andando beeeeem devagar"); //Emite na tela: Andando beeeeem devagar 
	}

}
