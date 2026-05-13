# POO em Java

[English version](README.md)

Repositório com exercícios práticos de **Programação Orientada a Objetos (POO)** em Java. O projeto reúne exemplos simples para estudar **herança**, **polimorfismo**, classes abstratas, sobrescrita de métodos e organização de pacotes.

## Objetivos do repositório

- Demonstrar conceitos fundamentais de POO usando Java.
- Separar os exercícios por tema para facilitar a leitura e a execução.
- Servir como material de estudo para criação de classes, subclasses e métodos sobrescritos.

## Estrutura do projeto

```text
.
├── Heranca/
│   └── src/ATVFUNCIONARIO/
│       ├── Funcionario.java
│       ├── Gerente.java
│       ├── Desenvolvedor.java
│       ├── Estagiario.java
│       ├── Main.java
│       └── UML-Atv-FUNCIONARIO.png
├── Polimorfismo/
│   └── src/AtvNotificacao/
│       ├── Notificacao.java
│       ├── Email.java
│       ├── Sms.java
│       ├── PushNotfication.java
│       ├── Main.java
│       └── Notficacao-Uml.png
├── README.md
└── README.en.md
```

## Exercícios disponíveis

### 1. Herança: funcionários

Local: `Heranca/src/ATVFUNCIONARIO`

Este exercício modela uma hierarquia de funcionários:

- `Funcionario`: classe base com nome, CPF e salário base.
- `Gerente`: funcionário com bônus específico.
- `Desenvolvedor`: funcionário com nível e bônus fixo.
- `Estagiario`: funcionário com bônus calculado pelas horas trabalhadas.
- `Main`: cria objetos das classes e exibe os dados no terminal.

Conceitos praticados:

- Herança com `extends`.
- Reaproveitamento de atributos e métodos da superclasse.
- Sobrescrita de método com `@Override`.
- Uso de `super` para chamar comportamento da classe base.

### 2. Polimorfismo: notificações

Local: `Polimorfismo/src/AtvNotificacao`

Este exercício modela diferentes tipos de notificações:

- `Notificacao`: classe abstrata que define o contrato `exibirMensagem()`.
- `Email`: notificação enviada por e-mail.
- `Sms`: notificação enviada por mensagem SMS.
- `PushNotfication`: notificação enviada por aplicativo.
- `Main`: armazena diferentes notificações em um vetor do tipo `Notificacao` e executa o método sobrescrito de cada classe.

Conceitos praticados:

- Classe abstrata.
- Método abstrato.
- Polimorfismo por meio de referência da superclasse.
- Sobrescrita de comportamento em subclasses.

## Requisitos

- Java JDK instalado.
- O código foi validado com `javac 25.0.2`, mas também pode funcionar em outras versões recentes do JDK.

## Como compilar

A partir da raiz do repositório, execute:

```bash
mkdir -p build
javac -d build Heranca/src/ATVFUNCIONARIO/*.java Polimorfismo/src/AtvNotificacao/*.java
```

## Como executar

### Exercício de herança

```bash
java -cp build ATVFUNCIONARIO.Main
```

### Exercício de polimorfismo

```bash
java -cp build AtvNotificacao.Main
```

## Observações

- As imagens UML incluídas nas pastas dos exercícios ajudam a visualizar a estrutura das classes.
- Os nomes de alguns arquivos e pacotes seguem a nomenclatura original dos exercícios.
- Este projeto não usa Maven ou Gradle; a compilação pode ser feita diretamente com `javac`.

## Sugestões de estudo

- Alterar os valores criados nas classes `Main` e observar a saída.
- Criar novas subclasses, como outro tipo de funcionário ou outro canal de notificação.
- Adicionar novos métodos para reforçar encapsulamento, herança e polimorfismo.
