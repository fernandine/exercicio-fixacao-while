package application;

import java.util.Locale;
import java.util.Scanner;

/*
 Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
 */
public class p10 {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha: ");
		int senha = sc.nextInt();
		while(senha!=2002) {
			System.out.println("Acesso negado!");	
			senha = sc.nextInt();
		} 
			System.out.println("Acesso permitido!");
			sc.close();
		}
	}

