# Bubble Tea Customization System

## About the project

This project is a simple example of the Bridge Design Pattern in Java.

The topic of the project is a Bubble Tea Customization System.
The main idea is to separate the type of bubble tea from the way it is prepared.

There are two types of drinks:
- Milk Tea
- Ice Tea

And there are two preparation methods:
- Traditional Preparation
- Automatic Preparation

The preparation method can also be changed at runtime.

---

## Bridge Pattern

The Bridge Pattern separates the abstraction from its implementation.

In this project:

- `Drink` is the Abstraction
- `MilkTea` and `IceTea` are Refined Abstractions
- `Preparation` is the Implementor
- `TraditionalPreparation` and `AutomaticPreparation` are Concrete Implementors
- `Main` is the Client

The bridge is created using composition because `Drink` contains a reference to `Preparation`.

```text
Drink
  |
  | has a
  v
Preparation
  |
  +-- TraditionalPreparation
  |
  +-- AutomaticPreparation