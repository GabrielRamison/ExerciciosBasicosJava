import java.util.Scanner;

public class ExBasicoJava03{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	
	double media;
	
	System.out.println("Digite o primeiro numero: ");
	int n1 = ler.nextInt();
	
	System.out.println("Digite o segundo numero: ");
	int n2 = ler.nextInt();
	
	System.out.println("Digite o terceiro numero: ");
	int n3 = ler.nextInt();
	
	
	media = (n1 + n2 + n3) / 3;
	
	System.out.printf("A media dos numero digitados é %.2f", media);
	
	}
}
