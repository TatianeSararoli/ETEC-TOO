package Principal;

//Classe Tartaruga - Especialização da Classe Reptil

public class Tartaruga extends Reptil { //Classe Tartaruga estende Reptil
	
	@Override //Sobrepor método
	public void locomover() { //Método abstrato
		System.out.println ("Andando beeeeem devagar"); //Emite na tela: Andando beeeeem devagar 
	}

}
