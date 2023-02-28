import java.util.Scanner;

public class ExBasicoJava08{

	public static void main(String args[]){
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite uma nota: ");
	float nota = ler.nextFloat();
	
	if (nota < 1.7)
		System.out.println("Reprovado");
	else if (nota > 1.7 && nota < 7)
		System.out.println("Em exame");
	else if (nota >= 7)
		System.out.println("Aprovado");
	
	
	}
}
