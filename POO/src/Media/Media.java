package Media;

import java.util.Scanner;

public class Media {
	Scanner scan = new Scanner(System.in);

	public double valor1;
	public double valor2;
	public double valor3;
	public double valor4;
	public double media;

	public void entrarDados() {
		System.out.println("Digite Nota 1: ");
		valor1 = scan.nextDouble();
		System.out.println("Digite Nota 2: ");
		valor2 = scan.nextDouble();
		System.out.println("Digite Nota 3: ");
		valor3 = scan.nextDouble();
		System.out.println("Digite Nota 4: ");
		valor4 = scan.nextDouble();
	}

	public void media() {
		System.out.println();

		System.out.println(valor1 + " + " + valor2 + " + " + valor3 + " + " + valor4);

		media = valor1 + valor2 + valor3 + valor4;
		System.out.println();

		System.out.println("Soma das Notas: " + media);

		media = media / 4;

	}

	public void saidadados() {

		System.out.println();

		if (media == 10) {
			System.out.println("Média das Notas: " + media + " | Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Média das Notas: " + media + " | Aprovado");
		} else {
			System.out.println("Média das Notas: " + media + " | Reprovado");
		}

	}

}
