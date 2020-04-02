import java.util.Scanner;

public class Piramide
{
	
	public static void main(String [] args)
	{      
     int numLinhas;
     
		Scanner entrada = new Scanner(System.in);
					   
		System.out.println("Informe o número de linhas entre 1 a 9  : ");
		numLinhas = entrada.nextInt();
		
		while(numLinhas<1 || numLinhas>9 ) 
		{
			System.out.println(" Erro ! favor Informe o número de linhas entre 1 a 9  : ");			
			numLinhas = entrada.nextInt();	
		}	
	     
		for(int i=1; i<=numLinhas; i++)
		{
			incrementaDecrementa(i);
		}
		
		 
	}
	
	public static void incrementaDecrementa(int numLinhas)
	{
		for(int i=0; i<numLinhas; i++) 
		{
			System.out.println(i+1);		
		}
		numLinhas = numLinhas-1;
		
		while(numLinhas>0)
		{
			
			System.out.println(numLinhas);
			numLinhas--;
		}
		System.out.println("---------------------");
	}
		
				  
	
}
