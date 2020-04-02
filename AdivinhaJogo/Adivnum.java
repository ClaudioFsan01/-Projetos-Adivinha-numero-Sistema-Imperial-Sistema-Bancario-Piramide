import java.lang.Math;
import java.util.Scanner;

public class Adivnum {
		
	
	public static void main(String [] args)
	{
	    int numJogador;
	    int numJogado; 
	    
		Scanner entrada = new Scanner(System.in);
		
		String [] nome = new String[2];
		   
		     System.out.println("Informe o nome do jogador n° 1  : ");
		      nome[0] = entrada.next();
		     
		     System.out.println("Informe o nome do jogador n° 2  : ");
		      nome[1] = entrada.next();			
		
			int numSort = (int)(Math.random()*1000)+1;			
			 int jogtSort = (int)(Math.random()*2)+1;  
			 
			 numJogador = jogtSort-1;
		 	    
			    System.out.println("jogador n° 1 : "+ nome[0]);
			    System.out.println("jogador n° 2 : "+ nome[1]);
			    
				System.out.println("Jogador sorteado para começar  : "+ nome[numJogador]);		   
				   
				 System.out.println("Informe um numero entre 1 a 1000 : ");
				    numJogado = entrada.nextInt();
				   
				   System.out.println(" Palpite "+ nome[numJogador]+ ": "+numJogado);			  			 
			    	
			   while(numSort!=numJogado)
			   { 
				   
				   if(numJogador==1)
				   {
					   numJogador = 0;   
				   }
				   else
				   {
					   numJogador =1;
				   }
				   				  
					  
				   if(numSort>numJogado)
				   {
					 System.out.println(" Numero sorteado é maior  : ");		   
				   }
				   else
				   {
					 System.out.println(" Numero sorteado é menor  : ");	
				   }	
					   
					 System.out.println("Informe um numero entre 1 a 1000 : ");
					 numJogado = entrada.nextInt();  
					   
					  
					   if(numJogador==1)
					   {
						   System.out.println(" Palpite "+ nome[numJogador]+ ": "+numJogado);	
						   
					   }
					   else
					   {
						   System.out.println(" Palpite "+ nome[numJogador]+ ": "+numJogado);
						  
					   }
					  				   
				   
			   }
			   
			   
			   System.out.println(nome[numJogador]+ " ganhou ! ");				   
		
	}	
	
	

}
