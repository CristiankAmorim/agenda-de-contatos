package contatos;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {

	private Set<Contact> contactsSet;

	public ContactBook() {
		this.contactsSet = new HashSet<>();
	}
	
	public void addContact(String name, String number) {
		contactsSet.add(new Contact(name, number));
		System.out.println("Contato adicionado");
	}
	
	public void displayContacts() {
		if(!contactsSet.isEmpty()) {
			System.out.println(contactsSet);
		}else {
			throw new RuntimeException("A agenda de contatos esta vazia");
		}
	}
	
	public Set<Contact> searchByName(String name) {
		Set<Contact> namesFound = new HashSet<>();
		if(!contactsSet.isEmpty()) {
			boolean found = false;
			for(Contact contact : contactsSet) {
				if(contact.getName().startsWith(name)) {
					namesFound.add(contact);
					found = true;
				}
			}
			if(!found) {
				throw new RuntimeException("Contato com esse nome não encontrado");
			}
			return namesFound;
		}else {
			throw new RuntimeException("A agenda de contatos esta vazia");
		}
	}
	
	public Contact updateContactName(String number, String newName) {
		Contact updatedContact = null;
		if(!contactsSet.isEmpty()) {
			for(Contact c : contactsSet) {
				if(c.getNumber().equalsIgnoreCase(number)) {
					c.setName(newName);
					updatedContact = c;
					System.out.println("Número do contato atualizado");
					break;
				}else {
					throw new RuntimeException("Contato com esse número não encontrado");
				}
			}
			return updatedContact;
		}else {
			throw new RuntimeException("A agenda de contatos esta vazia");
		}
	}
	
	public Contact updateContactNumber(String number, String newNumber) {
		Contact updatedContact = null;
		if(!contactsSet.isEmpty()) {
			for(Contact c : contactsSet) {
				if(c.getNumber().equalsIgnoreCase(number)) {
					c.setNumber(newNumber);
					updatedContact = c;
					System.out.println("Número do contato atualizado");
					break;
				}else {
					throw new RuntimeException("Contato com esse número não encontrado");
				}
			}
			return updatedContact;
		}else {
			throw new RuntimeException("A agenda de contatos esta vazia");
		}
	}
	
	public void deleteContact(String number) {
		Contact contactToRemove = null;
		if(!contactsSet.isEmpty()) {
			for(Contact c : contactsSet) {
				if(c.getNumber().equalsIgnoreCase(number)) {
					contactToRemove = c;
					contactsSet.remove(contactToRemove);
					System.out.println("Contato removido");
				}else {
					throw new RuntimeException("Contato com esse número não encontrado");
				}
			}
		}else {
			throw new RuntimeException("A agenda de contatos esta vazia");
		}
	}
	
}
