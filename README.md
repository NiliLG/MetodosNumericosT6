# SOLUCIÓN DE ECUACIONES DIFERENCIALES

Equipo:

* Nili Estefanía López Gutierrez 
*Elton Yael Alba Roldan

# Índice

* [Introducción](#introducción)
* [Métodos](#interpolación)
  * [Euler](#interpolación)
    * [Concepto](#lineal)
    * [Fórmula](#cuadrática)
    * [Algoritmo](#newton)
    * [Implementación](#lagrange)
  * [Runge-Kutta](#extrapolación)
    * [Concepto](#lineal)
    * [Fórmula](#cuadrática)
    * [Algoritmo](#newton)
    * [Implementación](#lagrange)
  * [Taylor](#interpolación)
    * [Concepto](#lineal)
    * [Fórmula](#cuadrática)
    * [Algoritmo](#newton)
    * [Implementación](#lagrange)
* [Conclusiones](#conclusiones)
* [Bibliografía](#bibliografía)

# Introducción

El presente trabajo ofrece una exploración detallada de la aplicación de métodos numéricos para la resolución de ecuaciones diferenciales en el entorno de programación Java. 
Se abordan tres métodos fundamentales: Euler, Runge-Kutta y Taylor. 
A través de ejemplos prácticos, se ilustra cómo estas técnicas pueden implementarse eficazmente para resolver una amplia gama de problemas.

# Métodos

## Euler
El método de Euler es un algoritmo numérico utilizado para aproximar soluciones de ecuaciones diferenciales ordinarias (EDOs) mediante la integración numérica. 
Se basa en la idea de que la pendiente de la función en un punto dado puede utilizarse para predecir su valor en el siguiente punto. 
El método descompone la EDO en pequeños pasos, utilizando la pendiente en el punto actual para estimar el cambio en la función y así calcular su valor en el siguiente punto. 
Aunque es simple y fácil de implementar, el método de Euler puede no ser muy preciso para ciertos tipos de ecuaciones o para tamaños de paso grandes. 
Sin embargo, sigue siendo un punto de partida común para comprender y desarrollar métodos más avanzados de integración numérica.

Fórmula:

![image](https://github.com/NiliLG/MetodosNumericosT6/assets/147437701/47a52783-0a84-4629-bfc2-1a2f9b035c8c)

Algoritmo
```java
Inicializar el polinomio de interpolación:
𝑃(𝑥) = 0.
Para cada punto (𝑥𝑖,𝑦𝑖) en el conjunto de puntos:
Inicializar el polinomio básico de Lagrange 𝐿𝑖(𝑥)=1.
Construir el polinomio básico 𝐿𝑖(𝑥) para cada 𝑖:
Para cada 𝑗 de 0 a 𝑛, donde 𝑗≠𝑖:
Actualizar 𝐿𝑖(𝑥) multiplicándolo por ((𝑥−𝑥𝑗)/(𝑥𝑖−𝑥𝑗))​.
Actualizar el polinomio de interpolación 𝑃(𝑥): *Sumar al polinomio de interpolación 𝑃(𝑥) el término 𝑦𝑖⋅𝐿𝑖(𝑥).
Simplificar *Simplificar 𝑃(𝑥) si es necesario para obtener el polinomio en su forma más simple.
```

[Implementación](https://github.com/NiliLG/MetodosNumericosT5/tree/master/Interpolaci%C3%B3n/Lagrange)
## Runge-Kutta

## Taylor

# Conclusiones



# Bibliografía

Chapra, S. C., & Canale, R. P. (2006). Métodos numéricos para ingenieros (5a ed.). McGraw-Hill Interamericana.
