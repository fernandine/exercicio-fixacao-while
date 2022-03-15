package application;

import java.util.Locale;
import java.util.Scanner;

/*
 Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
exemplo.
 */
public class p12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tipo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (tipo != 4) {

			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			}
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO!");
		System.out.println("ALCOOL: " + alcool);
		System.out.println("GASOLINA: " + gasolina);
		System.out.println("DIESEL: " + diesel);

		sc.close();
	}

}
