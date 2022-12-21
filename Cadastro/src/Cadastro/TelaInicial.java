package Cadastro;

import java.util.Scanner;
import java.util.ArrayList;

public class TelaInicial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Usuariobk> ListaDePessoas = new ArrayList<>();
		// eu sei que isso me ajuda a trazer o telefone correto, mas não sei como ainda x="^[0-9]{2}-([0-9]{8}|[0-9]{9})"

		int op = 0;
		
		do {
			System.out.println("##ESCOLHA UMA OPÇÃO##\n");
			System.out.println("1 - Cadastro de Usuario\n");
			System.out.println("2 - Verificar Evento");
			System.out.println("3 - sair /n");
			op = scan.nextInt();
			
			switch(op){
			
			case 1:
				System.out.println("Bem vindo ao sistema de cadastro de Usuarios\n");
				
				System.out.println("Nome : ");
				String nome = scan.nextLine();
				
				System.out.println("Idade : ");
				int idade = scan.nextInt();
				
				System.out.println("Genero('F' para Feminino 'M' para Masculino e 'I' para se insentar de responder");
				char genero = scan.next().charAt(0);
				scan.nextLine();
				
				System.out.println("Telefone: ");
				Usuariobk usuario = new Usuariobk(nome, genero, genero, idade);
				usuario.setTelefone(scan.nextLine());
				
			case 2:
				System.out.println("Bem Vindos a nossa agenda de eventos");
			case 3:
				break;
			default:
				System.out.println("Opção invalida, tente de novo.");
				
				
			}
			
			}while(op != 3);
	}
}
