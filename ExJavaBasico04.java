import java.util.Scanner;

public class ExJavaBasico04{

	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	

	
	System.out.println("Digite um numero:");
	int numero = ler.nextInt();
	
	if (numero > 0){
		System.out.println("O numero é positivo!");
	}else if (numero < 0){
		System.out.println("O numero é negativo!");
	}else{
		System.out.println("O numero é zero");
		
		}
	
	}
}
