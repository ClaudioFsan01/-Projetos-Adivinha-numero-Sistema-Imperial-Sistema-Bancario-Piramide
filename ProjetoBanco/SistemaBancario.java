
public class SistemaBancario {
	
	public static void main(String [] args)
	{
		Conta minhaConta;
		
		minhaConta = new Conta();   //  comando new instancia a classe Conta(cria um objeto na memoria do tipo Conta) e retorna o endereço de memoria do objeto
	
	 // a variavel minhaConta do tipo Conta faz referencia ,ou seja, guarda o endereço de memoria do objeto criado do tipo Conta (aponta) 
		
		minhaConta.titular = "Claudio";
		minhaConta.numero = 76200;
		minhaConta.saldo = 1000.00;
		
		Conta conta2;
		
		conta2 = new Conta();
		 
		conta2.titular = "Fatima";
		conta2.numero = 76201;
		conta2.saldo = 2000;
		
		/* Para mandar uma mensagem ao objeto e pedir que ele execute um método, também usamos o ponto.
O termo usado para isso é invocação de método.*/
		System.out.println(" saldo atual conta 1: "+ minhaConta.saldo);
		System.out.println(" saldo atual conta 2: "+ conta2.saldo);
		
		
		minhaConta.deposita(200); // depositando 200
		conta2.deposita(300); 
		
		System.out.println(" saldo atual conta 1: "+ minhaConta.saldo);
		System.out.println(" saldo atual conta 2: "+ conta2.saldo);
		
	boolean resultado = minhaConta.saca(500);	
	
	verifOperacao(resultado);
	
	System.out.println(" saldo atual conta 1: "+ minhaConta.saldo);
	
	resultado = conta2.saca(3000);
	
	verifOperacao(resultado);
	
	System.out.println(" saldo atual conta 2: "+ conta2.saldo);
	}
	
	public static void verifOperacao(boolean resultado)
	{
		if(resultado == true)
		{
			System.out.println(" Saque efetuado com sucesso !");
			
		}
		else
		{    
			System.out.println(" Saque não efetuado limite insuficiente !");
			
		}
		
	}

}
