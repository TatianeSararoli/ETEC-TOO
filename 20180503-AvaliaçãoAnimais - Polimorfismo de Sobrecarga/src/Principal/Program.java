package Principal;

public class Program { //Program Principal

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro(); //Objeto n
		
		c.reagir ("Olá"); //Método declarando Abanar e Latir
		c.reagir ("Vai Apanhar"); //Método declarando Rosnar
		c.reagir (11, 45); //Método declarando Abanar
		c.reagir (21, 00); //Método declarando Ignorar
		c.reagir (true); //Método declarando Abanar
		c.reagir (false); //Método declarando Rosnar e Latir
		c.reagir (2, 12.5f); //Método declarando Latir
		c.reagir (17, 4.5f); //Método declarando Rosnar
				
		//Segundo Prof. Gustavo Guanabara
		
		//POLIMORFISMO
		
		//Lembrando existem dois Tipos de Polimorfismo: Sobreposição e Sobrecarga
		
		//Outro Conceito de Sobreposição: Quando eu consigo substituir um método,
		//que veio da classe mãe, diretamente na sua classe filha.
		
		//Sempre que quiser sobrepor alguma coisa, vou utilizar a mesma assinatura em
		//métodos diferentes.
		//Não existe a possibilidade de sobrepor mais de uma vez um método utilizando a
		//técnica de Override.
		//Override só acontece uma vez em cada classe e deve estar em classes
		//diferentes com a mesma assinatura.
		
		//Mesma assinatura, Classes Diferentes é Sobreposição.
		
		//Polimorfismo de Sobreposição tem a mesma assinatura de métodos e feita em
		//classes diferentes.
		//Polimorfismo de Sobrecarga possui assinaturas diferentes e é feita na mesma
		//classe.
		
	}

}
