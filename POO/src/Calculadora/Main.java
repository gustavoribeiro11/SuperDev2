package Calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		
		Calculadora calculadora = new Calculadora();
		
		calculadora.entrarDados();
		
		System.out.println("1-Somar");
		System.out.println("2-Subtrair");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		int op = scan.nextInt();
				
		if(op == 1) {
			System.out.println(calculadora.somar());
		}if(op == 2) {
			System.out.println(calculadora.subtrair());
		}if(op == 3) {
			System.out.println(calculadora.multiplicar());
		}if(op == 4) {
			System.out.println(calculadora.divisao());
		}

	}

}
