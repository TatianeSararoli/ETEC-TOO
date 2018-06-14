package Principal;

//Classe Abstrata Animal - Representa os Animais

public abstract class Animal { 	//Tem que ser uma Classe abstrata, porque tem m�todos abstratos
								//Sempre que tiver m�todos abstratos numa Classe, essa classe tamb�m � abstrata
								//Lembrando: Classe Abstrata � quando n�o pode virar um objeto
								//Classe Animal abstrata por ter m�todos abstratos,
								//n�o pode virar objeto, serve como efeitos de heran�a.

	protected float peso; //Atributo
	protected int idade; //Atributo
	protected int membros; //Atributo
	
	public abstract void locomover(); { //M�todo abstrato
		
	}
	
	public abstract void alimentar(); { //M�todo abstrato
		
	}
	
	public abstract void emitirSom(); { //M�todo abstrato
		
	}
	
	public float getPeso() { //M�todo Get
		return peso;
    }
	
    public void setPeso(float peso) { //M�todo Set
    	this.peso = peso;
    }
    
    public int getIdade() { //M�todo Get
    	return idade;
    }
    
    public void setIdade(int idade) { //M�todo Set
    	this.idade = idade;
    }
    
    public int getMembros() { //M�todo Get
    	return membros;
    }
    
    public void setMembros(int membros) { //M�todo Set
    	this.membros = membros;
    }

}