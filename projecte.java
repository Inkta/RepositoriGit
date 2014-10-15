//Comentari projecte1
import java.util.Scanner;
public class exercici {
	public static void main(String[] args) {
		Scanner lector=new Scanner (System.in);
		System.out.println("Escriu una frase: ");
		String frase=lector.nextLine();
	        char [] array=frase.toCharArray();
        	for (int i=0;i<frase.length();i++){
        		if (array[i] != ' '){
        			int contador=contador(frase,array[i]);
            		System.out.println("la lletra "+array[i]+ " surt "+contador);
        		} if (array[i] == 1) {
			System.out.println("Soc un Numero!!);
				
	}
        	}
 
        }

	public static int contador(String frase, char c){
	int contador=0;
	for (int i=0;i<frase.length();i++){
			if (frase.charAt(i) == c){
				contador++;
			}
		}
	return contador;
	}
}
