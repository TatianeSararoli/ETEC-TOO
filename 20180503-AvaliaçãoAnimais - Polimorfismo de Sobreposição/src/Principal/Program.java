package Principal;

public class Program { //Program Principal

	public static void main(String[] args) {
		
		//n = new Animal(); //Animal � abstrato e n�o pode criar/instanciar esse objeto
		Mamifero m = new Mamifero(); //Objeto n
		Reptil r = new Reptil(); //Objeto r
		Peixe p = new Peixe(); //Objeto p
		Ave a = new Ave(); //Objeto a
		
		m.setPeso (85.3f); //M�todo declarando o peso do mam�fero
		m.setIdade (2); //M�todo declarando a idade do mam�fero
		m.setMembros (4); //M�todo declarando o total de membros do mam�fero
		m.locomover(); //M�todo declarando Correndo
		m.alimentar(); //M�todo declarando Mamando
		m.emitirSom(); //M�todo declarando Som de Mam�fero
				
		p.setPeso (0.35f); //M�todo declarando o peso do peixe
		p.setIdade (1); //M�todo declarando a idade do peixe
		p.setMembros (0); //M�todo declarando o total de membros do peixe
		p.locomover(); //M�todo declarando Nadando
		p.alimentar(); //M�todo declarando Comendo subst�ncias
		p.emitirSom(); //M�todo declarando Peixe n�o faz som
		p.soltarBolha(); //M�todo declarando Soltou uma bolha
		
		a.setPeso (0.89f); //M�todo declarando o peso do ave
		a.setIdade (2); //M�todo declarando a idade do ave
		a.setMembros (2); //M�todo declarando o total de membros do ave
		a.locomover(); //M�todo declarando Voando
		a.alimentar(); //M�todo declarando Comendo frutas
		a.emitirSom(); //M�todo declarando Som da ave
		a.fazerNinho(); //M�todo declarando Construiu um ninho
		
		//Segundo Prof. Guanabara
		
		//POLIMORFISMO
		
		//Jun��o de 2 termos:
		//POLI = muitas
		//MORFO = formas
		
		//Permite que um mesmo nome represente v�rios comportamentos diferentes.
		
		//Assinatura do M�todo
		
		//Todo m�todo tem uma assinatura: Consiste em quantidade e os tipos dos par�metros.
		
		//Polimorfismo ocorre acima, pois os mesmos m�todos de objetos diferentes e obt�m outros resultados.
		//Ent�o, chama o mesmo m�todo, com mesmo nome e obt�m formas diferentes de respostas.
		//Conceito: Fazer uma determinada coisa, com o mesmo nome e essa coisa poder agir de diferentes maneiras.
		
		//Polimorfismo de Sobreposi��o e Polimorfismo de Sobrecarga s�o palavras parecidas e
		//semelhantes em seus conceitos, porque implementam as poliformas.
		
		//Polimorfismo de Sobreposi��o
		//Acontece quando substitu�mos um m�todo de uma superclasse na sua subclasse, usando a mesma assinatura. 
		
		Canguru c = new Canguru(); //Objeto c
		Cachorro k = new Cachorro(); //Objeto k
		
		m.setPeso (5.70f); //M�todo declarando o peso do mam�fero
		m.setIdade (8); //M�todo declarando a idade do mam�fero
		m.setMembros (4); //M�todo declarando o total de membros do mam�fero
		m.locomover(); //M�todo declarando Correndo
		m.alimentar(); //M�todo declarando Mamando
		m.emitirSom(); //M�todo declarando Som de Mam�fero
		
		c.setPeso (55.30f); //M�todo declarando o peso do canguru
		c.setIdade (3); //M�todo declarando a idade do canguru
		c.setMembros (4); //M�todo declarando o total de membros do canguru
		c.locomover(); //M�todo declarando Saltando
		c.alimentar(); //M�todo declarando Mamando
		c.emitirSom(); //M�todo declarando Som de Mam�fero
		c.usarBolsa(); //M�todo declarando Usando Bolsa
		
		k.setPeso (3.94f); //M�todo declarando o peso do cachorro
		k.setIdade (5); //M�todo declarando a idade do cachorro
		k.setMembros (4); //M�todo declarando o total de membros do cachorro
		k.locomover(); //M�todo declarando Correndo
		k.alimentar(); //M�todo declarando Mamando
		k.emitirSom(); //M�todo declarando Som de Mam�fero
		k.abanarRabo(); //M�todo declarando Abanando o Rabo

	}

}
