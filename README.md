# 📒Contact Book (Agenda de Contatos em Java)

Este projeto é uma aplicação de linha de comando em Java que implementa uma agenda de contatos simples.
O usuário pode adicionar, listar, pesquisar, atualizar e remover contatos de forma prática através de um menu interativo no console.

## 📂 Estrutura do Projeto
src/

  └── contatos/
        
        ├── Contact.java        
        ├── ContactBook.java    
        └── Main.java         


## 🚀Funcionalidades
- ➕ Adicionar contato (nome e número)

- 📋 Exibir todos os contatos cadastrados

- 🔎 Pesquisar contatos pelo nome

- ✏️ Atualizar nome de um contato

- 🔄 Atualizar número de um contato

- ❌ Remover um contato

- 🚪 Sair da aplicação

## 🔄 Implementação do CRUD

Este projeto aplica os quatro pilares do CRUD (Create, Read, Update, Delete) na gestão de contatos:

### Create (Criar):
- Método addContact(String name, String number)
- Permite adicionar um novo contato à agenda.
- Acessível pelo menu [1] Adicionar novo contato.

### Read (Ler/Consultar):
- Método displayContacts() → exibe todos os contatos.
- Método searchByName(String name) → pesquisa contatos pelo nome.
- Acessível pelos menus [2] Exibir contatos e [3] Pesquisar por nome.

### Update (Atualizar):
- Método updateContactName(String number, String newName) → altera o nome de um contato.
- Método updateContactNumber(String number, String newNumber) → altera o número de um contato.
- Acessível pelos menus [4] Atualizar nome e [5] Atualizar número.

### Delete (Remover):
- Método deleteContact(String number)
- Permite remover um contato existente a partir do número.
- Acessível pelo menu [6] Remover contato.

Dessa forma, a classe ContactBook atua como um repositório em memória responsável pelas operações, enquanto a classe Main fornece a interface interativa via console.

## 🛠️ Tecnologias Utilizadas
- Java 17+;
- Coleções (HashSet) para gerenciar contatos;
- Programação Orientada a Objetos (POO);
- Tratamento de exceções para validação das operações;
