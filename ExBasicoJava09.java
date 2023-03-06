import java.util.Scanner;

public class ExBasicoJava09{
	
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	
	float salario, aumento, novoSalario;
	
	System.out.println("Digite o salário do funcionário: ");
	salario = ler.nextFloat();
	
	if (salario <= 1280.00){
		aumento = salario * 0.20f;
	} else if (salario <= 1800.00){
		aumento = salario * 0.15f;
	} else if (salario <= 2500.00) {
		aumento = salario * 0.10f;
	}else{
		aumento = salario * 0.05f;
	}
	
	novoSalario = salario + aumento;
	
	System.out.printf("O aumento foi de R$ %.2f.%n", aumento);
	System.out.printf("O novo salario é R$ %.2f%n", novoSalario);
	
	
	}

}
