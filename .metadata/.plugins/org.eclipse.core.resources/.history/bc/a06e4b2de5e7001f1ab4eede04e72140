package ExercicioAltura;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();

		Pessoa[] listaPessoas = new Pessoa[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			listaPessoas[i] = new Pessoa(nome, idade, altura);
		}

		double alturaMedia = Pessoa.calcularAlturaMedia(listaPessoas);
		double menoresDe16 = Pessoa.calcularPercentualMenoresDe16(listaPessoas);

		System.out.printf("\nAltura media: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", menoresDe16);
		for (Pessoa pessoa : listaPessoas) {
			if (pessoa.getIdade() < 16) {
				System.out.println(pessoa.getNome());
			}
		}

		sc.close();
	}
}