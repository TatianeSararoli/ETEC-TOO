package Principal;

//Classe Mamífero - Especialização da Classe Animal

public class Mamifero extends Animal { //Classe Mamífero estende Animal
	
	private String corPelo; //Atributo adicional
	
	@Override //Sobrepor método
	public void locomover() { //Método abstrato
		System.out.println ("Correndo"); //Emite na tela: Correndo
	}
	
	@Override //Sobrepor método
	public void alimentar() { //Método abstrato
		System.out.println ("Mamando"); //Emite na tela: Mamando
	}
	
	@Override //Sobrepor método
	public void emitirSom() { //Método abstrato
		System.out.println ("Som de Mamífero"); //Emite na tela: Som de Mamífero
	}
	
	public String getCorPelo() { //Método Get
    	return corPelo;
    }
    
    public void setCorPelo(String corPelo) { //Método Set
    	this.corPelo = corPelo;
    }

}
