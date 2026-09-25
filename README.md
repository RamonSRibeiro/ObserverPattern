# Padrão Observer - Livro e Leitor

## Descrição

Exemplo do padrão de projeto **Observer** em Java, utilizando o contexto de uma biblioteca.

Neste exemplo:

* **Livro** é o objeto observado (`Observable`).
* **Leitor** é o observador (`Observer`).
* Um leitor pode acompanhar um livro.
* Quando o livro é disponibilizado, todos os leitores cadastrados recebem uma notificação.

## Estrutura

### Livro

A classe `Livro` representa o objeto observado.

Ela possui informações como:

* título
* autor
* ano
* editora

Quando o método `disponibilizarLivro()` é executado, o livro notifica todos os leitores que estão acompanhando-o.

### Leitor

A classe `Leitor` representa o observador.

O leitor pode acompanhar um livro através do método `acompanhar()`.

Quando recebe uma notificação, a mensagem é armazenada em `ultimaNotificacao`.

## Testes

A classe `LeitorTest` verifica os seguintes cenários:

* Notificação de um leitor.
* Notificação de vários leitores.
* Leitor que não está acompanhando o livro não recebe notificação.
* Leitores acompanhando livros diferentes recebem somente as notificações dos livros que acompanham.

## Padrão Observer

O relacionamento pode ser resumido da seguinte forma:

**Livro → notifica → Leitor**

O padrão Observer permite que vários objetos observadores sejam notificados automaticamente quando ocorre uma alteração no objeto observado.
