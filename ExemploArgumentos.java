class  ExemploArgumentos{
	public static void main(String args[]){
		//mostrando o primeiro argumento passado pela linha de comando
		System.out.printf("Argumento 1: %s\n", args[0]);
		
		for (int i=0; i < Integer.parseInt( args[1]); i++){
				System.out.println(args[0]);
			}
	}

}
