package Principal;

//Classe Mam�fero - Especializa��o da Classe Animal

public class Mamifero extends Animal { //Classe Mam�fero estende Animal
	
	private String corPelo; //Atributo adicional
	
	@Override //Sobrepor m�todo
	public void locomover() { //M�todo abstrato
		System.out.println ("Correndo"); //Emite na tela: Correndo
	}
	
	@Override //Sobrepor m�todo
	public void alimentar() { //M�todo abstrato
		System.out.println ("Mamando"); //Emite na tela: Mamando
	}
	
	@Override //Sobrepor m�todo
	public void emitirSom() { //M�todo abstrato
		System.out.println ("Som de Mam�fero"); //Emite na tela: Som de Mam�fero
	}
	
	public String getCorPelo() { //M�todo Get
    	return corPelo;
    }
    
    public void setCorPelo(String corPelo) { //M�todo Set
    	this.corPelo = corPelo;
    }

}
