# Bubble Tea Customization System

## Description

This project is a simple implementation of the Bridge Design Pattern in Java.

The project is based on a Bubble Tea Customization System. It separates the type of bubble tea from the way it is prepared.

The system has two types of drinks:

- Milk Tea
- Ice Tea

It also has two preparation methods:

- Traditional Preparation
- Automatic Preparation

The preparation method can be changed at runtime without changing the drink classes.

---

## Bridge Design Pattern

The Bridge Pattern separates an abstraction from its implementation so that both sides can be changed independently.

In this project:

- `Drink` is the Abstraction.
- `MilkTea` and `IceTea` are Refined Abstractions.
- `Preparation` is the Implementor.
- `TraditionalPreparation` and `AutomaticPreparation` are Concrete Implementors.
- `Main` is the Client.

The bridge between the abstraction and implementation is created using composition.

The `Drink` class contains a reference to the `Preparation` interface:

```java
protected Preparation preparation;

bubbletea_jk
│
├── src
│   ├── Preparation.java
│   ├── TraditionalPreparation.java
│   ├── AutomaticPreparation.java
│   ├── Drink.java
│   ├── MilkTea.java
│   ├── IceTea.java
│   └── Main.java
│
└── README.md
