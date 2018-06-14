package Principal;

//Classe Réptil - Especialização da Classe Animal

public class Reptil extends Animal { //Classe Réptil estende Animal

	private String corEscama; //Atributo adicional
	
	@Override //Sobrepor método
	public void locomover() { //Método abstrato
		System.out.println ("Rastejando"); //Emite na tela: Rastejando
	}
	
	@Override //Sobrepor método
	public void alimentar() { //Método abstrato
		System.out.println ("Comendo Vegetais"); //Emite na tela: Comendo Vegetais
	}
	
	@Override //Sobrepor método
	public void emitirSom() { //Método abstrato
		System.out.println ("Som de Réptil"); //Emite na tela: Som de Réptil
	}
	
	public String getCorEscama() { //Método Get
    	return corEscama;
    }
    
    public void setCorEscama(String corEscama) { //Método Set
    	this.corEscama = corEscama;
    }

}
