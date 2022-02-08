package pacote;

import java.util.Scanner;

import services.MochileiroCrud;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean repetir = true;
	do {
		System.out.println("Digite uma opção:");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Atualizar");
		System.out.println("3 - Deletar");
		System.out.println("4 - Selecionar");
		int opcao = sc.nextInt();
		MochileiroCrud mochileiro = new MochileiroCrud();
		
		switch (opcao) {
		case 0:
			repetir = false; 
			
			break;

		case 1:
			mochileiro.save();
			break;
			
		case 2:
			mochileiro.update();
			break;
			
		case 3:
			mochileiro.delete();
			break;
				
		case 4:
			mochileiro.select();
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
	}while(repetir);
		
		
		
		
	}

}
