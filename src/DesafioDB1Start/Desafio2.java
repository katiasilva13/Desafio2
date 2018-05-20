import java.util.Scanner;

/*
 * Prova DB1 Start. Desafio de Português
 * O prrograma lê um texto e o informa:
 * a quantidade de caracteres, de espaços em branco e de vogais digitadas. 
 * @author Kátia Marina Silva 
 */

public class Desafio2 {
	
	private static Scanner scanner;

	public static void main (String[] args) {
		
		System.out.println("Digite um texto.\n");
		scanner = new Scanner (System.in);
		String texto = scanner.nextLine();

		int quantidadeVogais = 0;
		int espaco = 0;
		
		texto = texto.toLowerCase();
		
        for (int any = 0; any < texto.length(); any++){
            char letras = texto.charAt(any);
            if (letras == 'a' ||letras == 'á' || letras == 'à' ||letras == 'ã' || letras == 'â' ||   letras == 'e' || letras == 'é' || 
            		+ letras == 'è' || letras == 'ê' || letras == 'i' || letras == 'í' ||letras == 'ì' ||  letras == 'o' ||
            		+ letras == 'ô' || letras == 'ó' ||  letras == 'u'|| letras == 'ú' ) {
            	quantidadeVogais++;		
            }
            else if (letras == ' ' ){
            	espaco++;
            }
        }
                
        System.out.println(espaco + " espaços em branco");
        System.out.println(quantidadeVogais + " vogais");    
        System.out.println (texto.length() + " caracteres");
				
	}
}
