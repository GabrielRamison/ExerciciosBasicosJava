

public class ExBasicoJava06{

public static void main(String args[]){
	int dia=22, mes=10, ano=2023;
	String data = dia+" de ";
	
	
	switch(mes){
		case 1:
			data += "janeiro";
			break;
		case 2:
			data += "fevereiro";
			break;
		case 3:
			data += "marco";
			break;
		case 4:
			data += "abril";
			break;
		case 5:
			data += "maio";
			break;
		case 6:
			data += "junho";
			break;
		case 7:
			data += "julho";
			break;
		case 8:
			data += "agosto";
			break;
		case 9:
			data += "setembro";
			break;
		case 10:
			data += "outubro";
			break;
		case 11:
			data += "novembro";
			break;
		case 12:
			data += "dezembro";
			break;	
					
		
		}
		
		data+=" de "+ano;
		System.out.println(data);

	}
}
