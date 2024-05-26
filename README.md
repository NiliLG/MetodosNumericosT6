# SOLUCIÓN DE ECUACIONES DIFERENCIALES

Equipo:

* Nili Estefanía López Gutierrez 
*Elton Yael Alba Roldan

# Índice

* [Introducción](#introducción)
* [Métodos](#interpolación)
  * [Euler](#interpolación)
  * [Runge-Kutta](#extrapolación)
  * [Taylor](#interpolación)
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
    Declarar x0 (lim inf)
    Declarar xf (lim sup)
    Declarar deltaX(tamaño de paso)
    Declarar y0 (condición inicial)
    Declarar steps como Entero ((xf - x0) / deltaX)
    Declarar un arreglo x de tamaño (steps + 1)
    Declarar un arreglo y de tamaño (steps + 1)
    Declarar un arreglo exactY de tamaño (steps + 1)
    Declarar condiciones iniciales
    x[0] = x0
    y[0] = y0
    exactY[0] = solExac(x0)
    Para i desde 0 hasta steps
        x[i + 1] = x[i] + deltaX
        y[i + 1] = y[i] + deltaX * f(x[i])
        exactY[i + 1] = solExac(x[i + 1])
    Imprimir "X\tY(Verdadero)\tY(Euler)"
    Para i desde 0 hasta steps
        Imprimir x[i], exactY[i], y[i] con formato "%.2f\t%.5f\t\t%.5f\n"
    Fin Para

```

[Implementación](https://github.com/NiliLG/MetodosNumericosT6/tree/main/EulerMN)
## Runge-Kutta

## Taylor

# Conclusiones



# Bibliografía

Chapra, S. C., & Canale, R. P. (2006). Métodos numéricos para ingenieros (5a ed.). McGraw-Hill Interamericana.
