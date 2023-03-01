class Exemplo1{
		
		public static void main(String arg[]){
			
			String nascimento = "1993";
			String pesoString = "78.4";
			
			int anoNascimento = Integer.parseInt(nascimento);
			
			int idade = 2023 - anoNascimento;
			
			float peso = Float.parseFloat(pesoString);
			
			System.out.printf("Peso é %.2f \n", peso);
			
			System.out.printf("Idade: %d anos", idade);
			
	}
	
}
