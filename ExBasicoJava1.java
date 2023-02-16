import java.util.Scanner;
	
public class ExBasicoJava1{

	public static void main(String args[]){
		Scanner ler = 	new Scanner(System.in);
		
	int n;
	
	System.out.println("Digite um numero inteiro: ");
	n = ler.nextInt();
	
	System.out.printf("O antecessor do numero %d é %d \n", n , (n-1));
	System.out.printf("O sucessor do numero %d é %d \n", n , (n+1));
	
	}

}


