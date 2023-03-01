public class Vetor{
	public static void main(String args[]){
	// forma 1 de declarar um array
	//	String turmaADS[] = {"Francis", "Danieri", "Augusto", "Aureo", "Gabriel", "Silvio", "Vinicius", "Antonio", "Marco"};
		String turmaADS[];
		
		turmaADS = new String[5];
		
		
		turmaADS[0] = "Chico"; // trocando o primeiro valor do array
		turmaADS[1] = "Aureo";
		turmaADS[2] = "Antonio";
		turmaADS[3] = "Augusto";
		//turmaADS[4] = "Danieri";
		
		
		// turmaADS.length o tamanho do vetor
		// acessar um indice inválido do array gera um erro em tempo de execução
		for (int i=0; i < turmaADS.length; i++){
			// tratando valores nulos, para nao mostra-los
			if(turmaADS[i] != null)
			System.out.println(turmaADS[i]);
		}
		
	}

}
