package exercicios0603;

import java.util.Scanner;

public class ConverterReais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Variáveis 
		double converter,libra,real;
		//instanciar classe Scanner 
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Informe o real:");
		real = ler.nextDouble();
		
		//Processamento
		converter = real*6.28;
		
		//Saída
		System.out.println("O valor da libra é: " + converter );
	}

}
