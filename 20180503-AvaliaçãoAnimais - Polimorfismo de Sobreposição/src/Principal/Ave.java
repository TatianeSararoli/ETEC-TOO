package Principal;

//Classe Ave - Especializa��o da Classe Animal

public class Ave extends Animal { //Classe Ave estende Animal

	private String corPena; //Atributo
	
	@Override //Sobrepor m�todo
	public void locomover() { //M�todo abstrato
		System.out.println ("Voando"); //Emite na tela: Voando
	}
	
	@Override //Sobrepor m�todo
	public void alimentar() { //M�todo abstrato
		System.out.println ("Comendo frutas"); //Emite na tela: Comendo frutas
	}
	
	@Override //Sobrepor m�todo
	public void emitirSom() { //M�todo abstrato
		System.out.println ("Som da ave"); //Emite na tela: Som da ave 
	}
	
	public void fazerNinho() { //M�todo abstrato
		System.out.println ("Construiu um ninho"); //Emite na tela: Construiu um ninho 
	}
	
	public String getCorPena() { //M�todo Get
    	return corPena;
    }
    
    public void setCorPena(String corPena) { //M�todo Set
    	this.corPena = corPena;
    }


}
