package Principal;

public class Program { //Program Principal

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro(); //Objeto n
		
		c.reagir ("Ol�"); //M�todo declarando Abanar e Latir
		c.reagir ("Vai Apanhar"); //M�todo declarando Rosnar
		c.reagir (11, 45); //M�todo declarando Abanar
		c.reagir (21, 00); //M�todo declarando Ignorar
		c.reagir (true); //M�todo declarando Abanar
		c.reagir (false); //M�todo declarando Rosnar e Latir
		c.reagir (2, 12.5f); //M�todo declarando Latir
		c.reagir (17, 4.5f); //M�todo declarando Rosnar
				
		//Segundo Prof. Gustavo Guanabara
		
		//POLIMORFISMO
		
		//Lembrando existem dois Tipos de Polimorfismo: Sobreposi��o e Sobrecarga
		
		//Outro Conceito de Sobreposi��o: Quando eu consigo substituir um m�todo,
		//que veio da classe m�e, diretamente na sua classe filha.
		
		//Sempre que quiser sobrepor alguma coisa, vou utilizar a mesma assinatura em
		//m�todos diferentes.
		//N�o existe a possibilidade de sobrepor mais de uma vez um m�todo utilizando a
		//t�cnica de Override.
		//Override s� acontece uma vez em cada classe e deve estar em classes
		//diferentes com a mesma assinatura.
		
		//Mesma assinatura, Classes Diferentes � Sobreposi��o.
		
		//Polimorfismo de Sobreposi��o tem a mesma assinatura de m�todos e feita em
		//classes diferentes.
		//Polimorfismo de Sobrecarga possui assinaturas diferentes e � feita na mesma
		//classe.
		
	}

}
