package Principal;

public class Program { //Program Principal

	public static void main(String[] args) {
		
		//n = new Animal(); //Animal é abstrato e não pode criar/instanciar esse objeto
		Mamifero m = new Mamifero(); //Objeto n
		Reptil r = new Reptil(); //Objeto r
		Peixe p = new Peixe(); //Objeto p
		Ave a = new Ave(); //Objeto a
		
		m.setPeso (85.3f); //Método declarando o peso do mamífero
		m.setIdade (2); //Método declarando a idade do mamífero
		m.setMembros (4); //Método declarando o total de membros do mamífero
		m.locomover(); //Método declarando Correndo
		m.alimentar(); //Método declarando Mamando
		m.emitirSom(); //Método declarando Som de Mamífero
				
		p.setPeso (0.35f); //Método declarando o peso do peixe
		p.setIdade (1); //Método declarando a idade do peixe
		p.setMembros (0); //Método declarando o total de membros do peixe
		p.locomover(); //Método declarando Nadando
		p.alimentar(); //Método declarando Comendo substâncias
		p.emitirSom(); //Método declarando Peixe não faz som
		p.soltarBolha(); //Método declarando Soltou uma bolha
		
		a.setPeso (0.89f); //Método declarando o peso do ave
		a.setIdade (2); //Método declarando a idade do ave
		a.setMembros (2); //Método declarando o total de membros do ave
		a.locomover(); //Método declarando Voando
		a.alimentar(); //Método declarando Comendo frutas
		a.emitirSom(); //Método declarando Som da ave
		a.fazerNinho(); //Método declarando Construiu um ninho
		
		//Segundo Prof. Guanabara
		
		//POLIMORFISMO
		
		//Junção de 2 termos:
		//POLI = muitas
		//MORFO = formas
		
		//Permite que um mesmo nome represente vários comportamentos diferentes.
		
		//Assinatura do Método
		
		//Todo método tem uma assinatura: Consiste em quantidade e os tipos dos parâmetros.
		
		//Polimorfismo ocorre acima, pois os mesmos métodos de objetos diferentes e obtém outros resultados.
		//Então, chama o mesmo método, com mesmo nome e obtém formas diferentes de respostas.
		//Conceito: Fazer uma determinada coisa, com o mesmo nome e essa coisa poder agir de diferentes maneiras.
		
		//Polimorfismo de Sobreposição e Polimorfismo de Sobrecarga são palavras parecidas e
		//semelhantes em seus conceitos, porque implementam as poliformas.
		
		//Polimorfismo de Sobreposição
		//Acontece quando substituímos um método de uma superclasse na sua subclasse, usando a mesma assinatura. 
		
		Canguru c = new Canguru(); //Objeto c
		Cachorro k = new Cachorro(); //Objeto k
		
		m.setPeso (5.70f); //Método declarando o peso do mamífero
		m.setIdade (8); //Método declarando a idade do mamífero
		m.setMembros (4); //Método declarando o total de membros do mamífero
		m.locomover(); //Método declarando Correndo
		m.alimentar(); //Método declarando Mamando
		m.emitirSom(); //Método declarando Som de Mamífero
		
		c.setPeso (55.30f); //Método declarando o peso do canguru
		c.setIdade (3); //Método declarando a idade do canguru
		c.setMembros (4); //Método declarando o total de membros do canguru
		c.locomover(); //Método declarando Saltando
		c.alimentar(); //Método declarando Mamando
		c.emitirSom(); //Método declarando Som de Mamífero
		c.usarBolsa(); //Método declarando Usando Bolsa
		
		k.setPeso (3.94f); //Método declarando o peso do cachorro
		k.setIdade (5); //Método declarando a idade do cachorro
		k.setMembros (4); //Método declarando o total de membros do cachorro
		k.locomover(); //Método declarando Correndo
		k.alimentar(); //Método declarando Mamando
		k.emitirSom(); //Método declarando Som de Mamífero
		k.abanarRabo(); //Método declarando Abanando o Rabo

	}

}
