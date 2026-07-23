package teste;

import java.util.Scanner;

public class ComprasJava {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int idade, codigo, mulheres = 0, homens = 0, servico = 0;
			char sexo;
			float percentual;
			do {
				System.out.println("╔══════════════════════════╗");
		        System.out.println("║       MENU PRINCIPAL     ║");
		        System.out.println("╠══════════════════════════╣");
		        System.out.println("║                          ║");
		        System.out.println("║  [ 1 ] - Compras         ║");
		        System.out.println("║  [ 2 ] - Serviços        ║");
		        System.out.println("║  [ 3 ] - Lazer           ║");
		        System.out.println("║  [ 4 ] - Alimentação     ║");
		        System.out.println("║  [ 5 ] - Fim             ║");
		        System.out.println("║                          ║");
		        System.out.println("╚══════════════════════════╝");
		        System.out.print("➤ Qual a sua opção? ");
				codigo = sc.nextInt();
				if (codigo != 5) {
					System.out.println("Qual a sua idade: ");
					idade = sc.nextInt();
					System.out.println("Qual o seu genero: (M)asculino (F)eminino? ");
					sexo = sc.next().charAt(0);
					if (codigo == 2) {
						servico++;
					}
					if (sexo == 'm') {
						homens++;
					} else {
						mulheres++;
					}
				}
			} while (codigo != 5);
			percentual = (servico * 100) / (homens + mulheres);
			System.out.println("O percentual de indivíduos que buscavam Serviços = " + percentual);
			if (homens > mulheres) {
				System.out.println("Homens frequentam mais o shopping");
			} else {
				System.out.println("Mulheres frequentam mais o shopping");
			}

	}

}
