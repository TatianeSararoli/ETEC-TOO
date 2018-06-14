package Principal;

//Classe Peixe - Especialização da Classe Animal

public class Peixe extends Animal { //Classe Peixe estende Animal

	private String corEscama; //Atributo
	
	@Override //Sobrepor método
	public void locomover() { //Método abstrato
		System.out.println ("Nadando"); //Emite na tela: Nadando
	}
	
	@Override //Sobrepor método
	public void alimentar() { //Método abstrato
		System.out.println ("Comendo substâncias"); //Emite na tela: Comendo substâncias
	}
	
	@Override //Sobrepor método
	public void emitirSom() { //Método abstrato
		System.out.println ("Peixe não faz som"); //Emite na tela: Peixe não faz som 
	}
	
	public void soltarBolha() { //Método abstrato
		System.out.println ("Soltou uma bolha"); //Emite na tela: Soltou uma bolha 
	}
	
	public String getCorEscama() { //Método Get
    	return corEscama;
    }
    
    public void setCorEscama(String corEscama) { //Método Set
    	this.corEscama = corEscama;
    }

}
