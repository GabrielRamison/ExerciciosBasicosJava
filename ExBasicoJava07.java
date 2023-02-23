import java.util.Scanner;

public class ExBasicoJava07{

	public static void main(String args[]){
	Scanner ler = new Scanner(System.in);
	

	
	System.out.println("Digite o primeiro numero: ");
	int n1 = ler.nextInt();
	System.out.println("Digite o segundo segundo: ");
	int n2 = ler.nextInt();
	System.out.println("Digite o terceiro terceiro: ");
	int n3 = ler.nextInt();
	
	if (n1 > n2  && n1 > n3){
		System.out.printf("O numero %d é o maior digitado.", n1);
		}
	else if (n1 > n3  && n1 > n2){
		System.out.printf("O numero %d é o maior digitado.", n1);
		}	
	else if (n2 > n1 && n2 > n3){
		System.out.printf("O numero %d é o maior digitado.", n2);
	}
	else if (n2 > n3 && n2 > n1){
		System.out.printf("O numero %d é o maior digitado.", n2);
	}
		else{ 
		System.out.printf("O numero %d é o maior digitado.", n3);
		}
	
	}

}
