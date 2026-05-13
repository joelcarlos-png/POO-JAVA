# OOP in Java

[Versão em português](README.pt-br.md)

Repository with practical **Object-Oriented Programming (OOP)** exercises in Java. The project contains simple examples for studying **inheritance**, **polymorphism**, abstract classes, method overriding, and package organization.

## Repository goals

- Demonstrate core OOP concepts using Java.
- Organize exercises by topic to make them easier to read and run.
- Serve as study material for creating classes, subclasses, and overridden methods.

## Project structure

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

## Available exercises

### 1. Inheritance: employees

Location: `Heranca/src/ATVFUNCIONARIO`

This exercise models an employee hierarchy:

- `Funcionario`: base class with name, CPF, and base salary.
- `Gerente`: employee with a specific bonus.
- `Desenvolvedor`: employee with a level and fixed bonus.
- `Estagiario`: employee with a bonus calculated from worked hours.
- `Main`: creates objects from the classes and prints their data to the terminal.

Practiced concepts:

- Inheritance with `extends`.
- Reusing attributes and methods from the superclass.
- Method overriding with `@Override`.
- Using `super` to call superclass behavior.

### 2. Polymorphism: notifications

Location: `Polimorfismo/src/AtvNotificacao`

This exercise models different notification types:

- `Notificacao`: abstract class that defines the `exibirMensagem()` contract.
- `Email`: notification sent by email.
- `Sms`: notification sent by SMS message.
- `PushNotfication`: notification sent by an application.
- `Main`: stores different notifications in a `Notificacao` array and executes each class's overridden method.

Practiced concepts:

- Abstract class.
- Abstract method.
- Polymorphism through a superclass reference.
- Behavior overriding in subclasses.

## Requirements

- Java JDK installed.
- The code was validated with `javac 25.0.2`, but it may also work on other recent JDK versions.

## How to compile

From the repository root, run:

```bash
mkdir -p build
javac -d build Heranca/src/ATVFUNCIONARIO/*.java Polimorfismo/src/AtvNotificacao/*.java
```

## How to run

### Inheritance exercise

```bash
java -cp build ATVFUNCIONARIO.Main
```

### Polymorphism exercise

```bash
java -cp build AtvNotificacao.Main
```

## Notes

- The UML images included in the exercise folders help visualize the class structure.
- Some file and package names follow the original exercise naming.
- This project does not use Maven or Gradle; it can be compiled directly with `javac`.

## Study suggestions

- Change the values created in the `Main` classes and observe the output.
- Create new subclasses, such as another employee type or another notification channel.
- Add new methods to reinforce encapsulation, inheritance, and polymorphism.
