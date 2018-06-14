package Principal;

//Classe Ave - Especialização da Classe Animal

public class Ave extends Animal { //Classe Ave estende Animal

	private String corPena; //Atributo
	
	@Override //Sobrepor método
	public void locomover() { //Método abstrato
		System.out.println ("Voando"); //Emite na tela: Voando
	}
	
	@Override //Sobrepor método
	public void alimentar() { //Método abstrato
		System.out.println ("Comendo frutas"); //Emite na tela: Comendo frutas
	}
	
	@Override //Sobrepor método
	public void emitirSom() { //Método abstrato
		System.out.println ("Som da ave"); //Emite na tela: Som da ave 
	}
	
	public void fazerNinho() { //Método abstrato
		System.out.println ("Construiu um ninho"); //Emite na tela: Construiu um ninho 
	}
	
	public String getCorPena() { //Método Get
    	return corPena;
    }
    
    public void setCorPena(String corPena) { //Método Set
    	this.corPena = corPena;
    }


}
