package Principal;

//Classe Abstrata Animal - Representa os Animais

public abstract class Animal { 	//Tem que ser uma Classe abstrata, porque tem métodos abstratos
								//Sempre que tiver métodos abstratos numa Classe, essa classe também é abstrata
								//Lembrando: Classe Abstrata é quando não pode virar um objeto
								//Classe Animal abstrata por ter métodos abstratos,
								//não pode virar objeto, serve como efeitos de herança.

	protected float peso; //Atributo
	protected int idade; //Atributo
	protected int membros; //Atributo
	
	public abstract void locomover(); { //Método abstrato
		
	}
	
	public abstract void alimentar(); { //Método abstrato
		
	}
	
	public abstract void emitirSom(); { //Método abstrato
		
	}
	
	public float getPeso() { //Método Get
		return peso;
    }
	
    public void setPeso(float peso) { //Método Set
    	this.peso = peso;
    }
    
    public int getIdade() { //Método Get
    	return idade;
    }
    
    public void setIdade(int idade) { //Método Set
    	this.idade = idade;
    }
    
    public int getMembros() { //Método Get
    	return membros;
    }
    
    public void setMembros(int membros) { //Método Set
    	this.membros = membros;
    }

}