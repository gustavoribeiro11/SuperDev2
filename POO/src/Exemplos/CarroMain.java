package Exemplos;

import java.util.Scanner;

public class CarroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner carro1 = new Scanner(System.in);
		
		
		
		ObjetoMeuCarro carro1 = new ObjetoMeuCarro();
		
		carro1.ano = 2022;
		carro1.marca = "Fiat";
		carro1.valor = 100000;
		carro1.kmrodado = 10;
		
		
		System.out.println(carro1.ano);
		System.out.println(carro1.marca);
		System.out.println(carro1.valor);
		System.out.println(carro1.kmrodado);
		
		
		
		
		
		
		

	}

}
