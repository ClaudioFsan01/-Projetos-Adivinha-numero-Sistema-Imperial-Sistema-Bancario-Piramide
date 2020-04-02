
public class Conta {
	//Quando uma vari�vel � declarada diretamente dentro do escopo da classe, �
	//chamada de vari�vel de objeto, ou atributo
	
	int numero;
	String titular;
	double saldo;
	double salario;

	/* Fun��es da classe s�o chamados de M�todos da classe*/
	
	/*
	void saca(double quantidade) // (double quantidade)  argumento do m�todo ou parametro
	{
	 double novoSaldo =	this.saldo -quantidade; 
	 this.saldo = novoSaldo;
	//palavra chave this para mostrar que esse � um atributo, e n�o uma simples vari�vel pois tanto a variavel quantidade e novoSaldo v�o morrer ao termino 
	 // da execu��o do m�todo , ou seja, o valor n�o ficara guardado
	}
	*/
	

	void deposita(double quantidade)
	{
		this.saldo += quantidade;
	}
	
	// M�todo com retorno 
	
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
