import java.util.Scanner;

public class ExBasicosJava02{

	public static void main(String[] args){
	
	int periodo = 120;
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Digite quantos periodos o estudante participou das aulas: ");
	int presenca = ler.nextInt();
	
	double 	percentualPresenca = (presenca/ (double)periodo) * 100;
	
	System.out.printf("O percentual de frequencia é: %.2f%%.", percentualPresenca);
	ler.close();
	
	
	}
}
