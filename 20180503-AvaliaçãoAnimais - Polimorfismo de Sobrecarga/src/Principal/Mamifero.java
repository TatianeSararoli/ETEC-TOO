package Principal;

//Classe Mamífero - Especialização da Classe Animal

public class Mamifero extends Animal { //Classe Mamífero estende Animal
	
	private String corPelo; //Atributo adicional
	
	@Override //Sobrepor método
	public void emitirSom() { //Método abstrato
		System.out.println ("Som de Mamífero"); //Emite na tela: Som de Mamífero
	}
	
	public String getCorPelo() { //Método Get
    	return corPelo;
    }
    
    public void setCorPelo(String corPelo) {  //Método Set
    	this.corPelo = corPelo;
    }

}
