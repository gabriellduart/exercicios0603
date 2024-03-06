package exercicios0603;

import java.util.Scanner;

public class QuatroOperações {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //variáveis
		double a,b,soma,div,sub,multi;
		//Instaciar classe Scanner
        Scanner ler = new Scanner (System.in);

		//Entrada de dados
        System.out.println("Informe valor 1: ");
        a = ler.nextDouble();
        System.out.println("Informe valor 2: ");
        b = ler.nextDouble();

		//Processamento
        soma = a+b;
        multi = a*b;
        div = a/b;
        sub= a-b;

		//Saída

		System.out.println("O resultado da soma é: " + soma);

		System.out.println("O resultado da multiplicação é: " + multi);

		System.out.println("O resultado da divisão é: " + div);

		System.out.println("O resultado da subtração é: " + sub);


		
	}

}
