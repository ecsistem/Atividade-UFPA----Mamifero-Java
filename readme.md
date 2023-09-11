# Projeto de Mamíferos em Java

Este é um projeto simples em Java desenvolvido como uma atividade para a aula de Programação 2 do professor Adonney Allan de Oliveira Veras. O projeto demonstra conceitos de programação orientada a objetos, incluindo herança e criação de classes e subclasses. O projeto inclui uma classe base chamada `Mamifero` e duas subclasses, `Cao` e `Baleia`, que representam diferentes tipos de mamíferos.

## Estrutura do Projeto

```
mamiferos/
│
├── Mamifero.java
├── Cao.java
├── Baleia.java
└── Mamiferos.java (classe principal)
```

- `Mamifero.java`: A classe base que contém atributos e métodos comuns a todos os mamíferos, como `nome`, `idade`, `raça`, `comer` e `dormir`.
- `Cao.java`: Uma subclasse que representa um cão e inclui métodos específicos para cães, como `latir`, `correr` e `buscar`.
- `Baleia.java`: Uma subclasse que representa uma baleia e inclui métodos específicos para baleias, como `nadar`, `esguicharAgua` e `saltar`.
- `Mamiferos.java`: A classe principal que contém o método `main`, onde objetos das classes são criados e seus métodos são chamados.

## Como Usar

1. Certifique-se de ter o Java instalado em seu sistema.
2. Clone este repositório ou faça o download dos arquivos em seu computador.
3. Abra o NetBeans ou sua IDE Java de preferência.
4. Abra o projeto importando-o para a IDE.
5. Execute o arquivo `Mamiferos.java` para ver a saída no console.

## Classes

### Mamifero

- `String nome`: O nome do mamífero.
- `int idade`: A idade do mamífero.
- `String raça`: A raça ou tipo do mamífero.

Métodos:
- `String comer()`: Retorna uma mensagem indicando que o mamífero está comendo.
- `String dormir()`: Retorna uma mensagem indicando que o mamífero está dormindo.

### Cao

- `String latir()`: Retorna uma mensagem indicando que o cão está latindo.
- `String correr()`: Retorna uma mensagem indicando que o cão está correndo.
- `String buscar()`: Retorna uma mensagem indicando que o cão está buscando algo.

### Baleia

- `String nadar()`: Retorna uma mensagem indicando que a baleia está nadando.
- `String esguicharAgua()`: Retorna uma mensagem indicando que a baleia está esguichando água.
- `String saltar()`: Retorna uma mensagem indicando que a baleia está saltando fora d'água.

---

Este projeto de exemplo é simples, mas serve como uma introdução à programação orientada a objetos em Java e à criação de hierarquias de classes.