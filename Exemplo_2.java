package estrutura_repeticao;

import java.util.Scanner;

public class Exemplo_2 {

	public static void main(String[] args){
	Scanner ler = new Scanner (System.in);
	int n;
	System.out.print("Digite um número maior que zero: ");
	n = ler.nextInt();

	for(int i = 0; i <= n; i++) {
	System.out.println("Número " + i);
	}
	
	ler.close();
	

	}
}
