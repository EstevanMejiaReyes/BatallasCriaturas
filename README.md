---

# Desarrollado por:
**Joan Estevan Mejía Reyes**
Grupo: G411  
Docente: Gabriel Pérez Moreno  
Fecha: 15 de octubre de 2025  

---

# Simulador de Batallas entre Criaturas  
![Java](https://img.shields.io/badge/Java-23-red?logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9.11-blue?logo=apachemaven)
![JUnit](https://img.shields.io/badge/JUnit-5.9.2-green?logo=junit5)
![Status](https://img.shields.io/badge/Build-Success-brightgreen)

---

## Descripción General  
Este proyecto fue desarrollado como parte del **Parcial II de Programación II (Grupo G411)**.  
El objetivo es aplicar los **principios de la Programación Orientada a Objetos (POO)** mediante la creación de un sistema que simule batallas entre criaturas con diferentes habilidades y características.  

El proyecto implementa **herencia, polimorfismo, interfaces y composición**, además de pruebas unitarias con **JUnit 5** y estructura profesional con **Maven**.

---

## Funcionalidades Principales  
- **Herencia:**  
  `Dragon`, `Mago` y `Guerrero` heredan de `Criatura`.  
- **Polimorfismo:**  
  Cada clase redefine los métodos `atacar()` y `defender()`.  
- **Interfaces:**  
  - `Volador`: comportamiento de vuelo.  
  - `Magico`: habilidad de lanzar hechizos.  
- **Composición:**  
  La clase `Arma` potencia el daño de las criaturas.  
- **Simulación de Batalla:**  
  `BattleSimulator` gestiona turnos, ataques y defensas.  
- **Pruebas Unitarias:**  
  Implementadas con **JUnit 5**.

---

## Estructura del Proyecto
```plaintext
BatallasCriaturas/
│
├── pom.xml
├── src/
│   ├── main/java/com/batallas/
│   │   ├── Criatura.java
│   │   ├── Volador.java
│   │   ├── Magico.java
│   │   ├── Arma.java
│   │   ├── Dragon.java
│   │   ├── Mago.java
│   │   ├── Guerrero.java
│   │   ├── BattleSimulator.java
│   │   └── Main.java
│   └── test/java/com/batallas/
│       └── BattleSimulatorTest.java
└── README.md

| Tecnología     | Versión | Descripción                           |
| -------------- | ------- | ------------------------------------- |
|   **Java**     | 23      | Lenguaje principal                    |
|   **Maven**   | 3.9.11  | Compilación y gestión de dependencias |
|   **JUnit 5** | 5.9.2   | Framework de pruebas unitarias        |
|   **VSCode**  | Última  | Entorno de desarrollo utilizado       |
