import java.util.Scanner;

/*
 * Prova DB1 Start. Desafio de Portugu�s
 * O prrograma l� um texto e o informa:
 * a quantidade de caracteres, de espa�os em branco e de vogais digitadas. 
 * @author K�tia Marina Silva 
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
            if (letras == 'a' ||letras == '�' || letras == '�' ||letras == '�' || letras == '�' ||   letras == 'e' || letras == '�' || 
            		+ letras == '�' || letras == '�' || letras == 'i' || letras == '�' ||letras == '�' ||  letras == 'o' ||
            		+ letras == '�' || letras == '�' ||  letras == 'u'|| letras == '�' ) {
            	quantidadeVogais++;		
            }
            else if (letras == ' ' ){
            	espaco++;
            }
        }
                
        System.out.println(espaco + " espa�os em branco");
        System.out.println(quantidadeVogais + " vogais");    
        System.out.println (texto.length() + " caracteres");
				
	}
}
