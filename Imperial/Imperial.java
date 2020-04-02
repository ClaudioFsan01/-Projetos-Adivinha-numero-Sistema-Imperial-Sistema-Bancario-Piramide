import java.util.Scanner;

public class Imperial {
	
	public static void main(String [] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Informe um valor em centímetros : ");
		double valoremCentimetros = entrada.nextFloat();
		
		 double milimetros = centimetrosemMilimetros(valoremCentimetros);
		 
		 double polegadas =  milimetrosemPolegadas(milimetros);
		 
		 double pes = polegadasemPes(polegadas);
		 
		 double jardas = pesemJardas(pes);
		 
		 double milhas = jardasemMilhas(jardas);
		
		System.out.println(" Valor : "+ valoremCentimetros +" centímetros -"+" em milimetros : "+milimetros);
		System.out.println("- polegadas : "+ polegadas +"- pes : "+ pes + "- jardas : "+ jardas+ " - milhas :"+milhas);
	}
	
	static double centimetrosemMilimetros(double valoremCentimetros)
	{
		return valoremCentimetros*10;
	}
	
	static double milimetrosemPolegadas(double valoremMilitros)
	{		
			return (valoremMilitros/25.3995);
				
	}
	
	static double polegadasemPes(double valoremPolegadas) 
	{
		return valoremPolegadas/12;
	}
	
	static double pesemJardas(double valoremPes)
	{
		return valoremPes/3;
	}
	
	static double jardasemMilhas(double valoremJardas)
	{
		return valoremJardas/1760;
	}

}
