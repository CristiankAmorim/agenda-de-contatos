package contatos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ContactBook contactBook = new ContactBook();
		
		int option = 0;
		
		while(option != 7) {
			System.out.println("\n==========MENU==========");
			System.out.println("[1] Adicionar novo contato \n[2] Exibir agenda de contatos \n[3] Pesquisar por nome"
					+ "\n[4] Atualizar nome do contato \n[5] Atualizar número do contato \n[6] Remover contato\n[7] Sair");
			System.out.print("Escolha uma opção: ");
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
				case 1:
					System.out.print("Digite o nome: ");
					String name = scanner.nextLine();
					System.out.print("Digite o número: ");
					String number = scanner.next();
					scanner.nextLine();
					contactBook.addContact(name, number);
					System.out.println();
					break;
				case 2:
					contactBook.displayContacts();
					System.out.println();
					break;
				case 3:
					System.out.print("Digite o nome do contato: ");
					String nameToFind = scanner.nextLine();
					System.out.println(contactBook.searchByName(nameToFind) + "\n");
					break;
				case 4:
					System.out.print("Digite o número do contato que você deseja atualizar o nome: ");
					String numberOfContact = scanner.next();
					scanner.nextLine();
					System.out.print("Novo nome para o contato: ");
					String newName = scanner.nextLine();
					System.out.println(contactBook.updateContactName(numberOfContact, newName) + "\n");
					break;
				case 5:
					System.out.print("Digite o número do contato que você deseja atualizar: ");
					String numberContact = scanner.next();
					scanner.nextLine();
					System.out.print("Novo número para o contato: ");
					String newNumber = scanner.nextLine();
					System.out.println(contactBook.updateContactNumber(numberContact, newNumber) + "\n");
					break;
				case 6:
					System.out.print("Digite o número do contato que você deseja remover: ");
					String contactToRemove = scanner.next();
					scanner.nextLine();
					contactBook.deleteContact(contactToRemove);
					break;
				case 7:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente");
					break;
			}
		}
		scanner.close();

	}

}
