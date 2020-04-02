
public class Conta {
	//Quando uma variável é declarada diretamente dentro do escopo da classe, é
	//chamada de variável de objeto, ou atributo
	
	int numero;
	String titular;
	double saldo;
	double salario;

	/* Funções da classe são chamados de Métodos da classe*/
	
	/*
	void saca(double quantidade) // (double quantidade)  argumento do método ou parametro
	{
	 double novoSaldo =	this.saldo -quantidade; 
	 this.saldo = novoSaldo;
	//palavra chave this para mostrar que esse é um atributo, e não uma simples variável pois tanto a variavel quantidade e novoSaldo vão morrer ao termino 
	 // da execução do método , ou seja, o valor não ficara guardado
	}
	*/
	

	void deposita(double quantidade)
	{
		this.saldo += quantidade;
	}
	
	// Método com retorno 
	
	boolean saca(double quantidade)
	{
		if(quantidade<= this.saldo)
		{
			this.saldo -= quantidade;
			return true;
		}
		else
		{
			return false;
		}
		 
	}
}
