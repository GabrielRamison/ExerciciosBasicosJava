import java.util.Scanner;

public class ExBasicosJava01{

	public static void main (Strings args[]){
		Scanner ler = new Scanner(System.in);
	
		float n;
	
		System.out.println("Digite um numero que sera acrescido em 10%: ");
		n = ler.nextFloat();
		
		float acrescimo = ((n*0.1)+n);
		
		System.out.printf(acrescimo);
		
		
	
	}

}
