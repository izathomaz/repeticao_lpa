package estrutura_repeticao;

import java.util.Scanner;

public class Desafio_1 {
	
	public static void main(String [] args) {
	Scanner ler = new Scanner (System.in);
	int fat = 1;
	
	System.out.print("Digite um número maior que zero: ");
	int n = ler.nextInt();
	
	for(int i = 1; i <= n; i ++) {
		fat = fat *i;
	}
	
	System.out.println(" O resultado do fatorial é: " + fat);
	}

}
