# Controle de Fluxo em Java

Projeto desenvolvido durante a trilha de Java Básico da Digital Innovation One (DIO), com o objetivo de praticar estruturas de controle de fluxo e tratamento de exceções em Java.

## 🎯 Objetivo

Desenvolver um pequeno sistema contador capaz de receber dois números inteiros, validar os parâmetros informados e realizar uma sequência de repetições com base na diferença entre os valores.

## 🧠 Conceitos praticados

Durante o desenvolvimento foram utilizados os seguintes conceitos:

- Variáveis e tipos primitivos
- Entrada de dados com `Scanner`
- Estrutura condicional `if`
- Estrutura de repetição `for`
- Exceções em Java
- Exceção personalizada
- `throw`
- `try/catch`
- Herança com `extends`
- Construtores
- `getMessage()`

## ⚙️ Funcionamento

O programa solicita dois números inteiros ao usuário.

O segundo número deve ser maior ou igual ao primeiro.

Quando os parâmetros são válidos, o programa calcula a diferença entre eles e utiliza esse valor para determinar a quantidade de repetições.

### Exemplo

Entrada:

12
18

Saída:

imprimindo o número: 1
imprimindo o número: 2
imprimindo o número: 3
imprimindo o número: 4
imprimindo o número: 5
imprimindo o número: 6

Caso o segundo número seja menor que o primeiro, uma exceção personalizada é lançada e tratada pelo programa.

## 📁 Estrutura do projeto

controle-fluxo
├── src
│   ├── Contador.java
│   └── ParametrosInvalidosException.java
└── README.md

## 🛠️ Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

## 📚 Origem do desafio

Desafio desenvolvido como parte da trilha de Java Básico da Digital Innovation One (DIO).

## 👨‍💻 Autor

**Alonso Favero Filho**