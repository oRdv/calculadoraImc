package sp.senai.jandira.sp;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Olá, bem vindo a calculadora de Imc, infome o seu nome: ");
		
		String nome;
		nome =  teclado.next();
		
		System.out.println("Insira a sua altura em metros: ");
		double altura = teclado.nextDouble();
		
		
		System.out.println("Agora insira o seu peso: ");
		double peso = teclado.nextDouble();
	
		double alt;
		alt = Math.pow(altura, 2);
		
		double imc;
		imc = peso / alt;
		
		System.out.println("Olá, " + nome + " seu imc é " + imc);
		
		
		
		
		
		
	}

}
