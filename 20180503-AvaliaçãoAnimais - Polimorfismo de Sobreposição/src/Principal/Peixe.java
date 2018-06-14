package Principal;

//Classe Peixe - Especializa��o da Classe Animal

public class Peixe extends Animal { //Classe Peixe estende Animal

	private String corEscama; //Atributo
	
	@Override //Sobrepor m�todo
	public void locomover() { //M�todo abstrato
		System.out.println ("Nadando"); //Emite na tela: Nadando
	}
	
	@Override //Sobrepor m�todo
	public void alimentar() { //M�todo abstrato
		System.out.println ("Comendo subst�ncias"); //Emite na tela: Comendo subst�ncias
	}
	
	@Override //Sobrepor m�todo
	public void emitirSom() { //M�todo abstrato
		System.out.println ("Peixe n�o faz som"); //Emite na tela: Peixe n�o faz som 
	}
	
	public void soltarBolha() { //M�todo abstrato
		System.out.println ("Soltou uma bolha"); //Emite na tela: Soltou uma bolha 
	}
	
	public String getCorEscama() { //M�todo Get
    	return corEscama;
    }
    
    public void setCorEscama(String corEscama) { //M�todo Set
    	this.corEscama = corEscama;
    }

}
