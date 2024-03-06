package exercicios0603;

import java.util.Scanner;

public class CalculadoraGasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Variáveis
		double consmedio,distotal,litros,custotal,combus;
		//instanciar classe scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Informe o valor do litro de gasolina:");
		combus = ler.nextDouble();
		
		System.out.println("Informe a distancia total:");
		distotal = ler.nextDouble();
		
		System.out.println("Informe o valor do consumo medio:");
		consmedio = ler.nextDouble();
		
		//Processamento
		litros = distotal/consmedio;
		custotal = litros*combus;
		
		//Saída
		System.out.println("a quantidade de litros gasto é: " + litros);
		System.out.println("O resultado do custo total é: " + custotal);
	}

}
