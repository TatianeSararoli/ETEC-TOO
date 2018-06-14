package Principal;

//Classe R�ptil - Especializa��o da Classe Animal

public class Reptil extends Animal { //Classe R�ptil estende Animal

	private String corEscama; //Atributo adicional
	
	@Override //Sobrepor m�todo
	public void locomover() { //M�todo abstrato
		System.out.println ("Rastejando"); //Emite na tela: Rastejando
	}
	
	@Override //Sobrepor m�todo
	public void alimentar() { //M�todo abstrato
		System.out.println ("Comendo Vegetais"); //Emite na tela: Comendo Vegetais
	}
	
	@Override //Sobrepor m�todo
	public void emitirSom() { //M�todo abstrato
		System.out.println ("Som de R�ptil"); //Emite na tela: Som de R�ptil
	}
	
	public String getCorEscama() { //M�todo Get
    	return corEscama;
    }
    
    public void setCorEscama(String corEscama) { //M�todo Set
    	this.corEscama = corEscama;
    }

}
