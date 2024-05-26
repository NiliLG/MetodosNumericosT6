# SOLUCIÓN DE ECUACIONES DIFERENCIALES

Equipo:

* Nili Estefanía López Gutierrez 
*Elton Yael Alba Roldan

# Índice

* [Introducción](#introducción)
* [Métodos](#métodos)
  * [Euler](#euler)
  * [Runge-Kutta](#runge-kutta)
  * [Taylor](#taylor)
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
    Imprimir iteraciones en formato de tabla

```

[Implementación](https://github.com/NiliLG/MetodosNumericosT6/tree/main/EulerMN)
## Runge-Kutta
es un algoritmo numérico utilizado para aproximar soluciones de ecuaciones diferenciales ordinarias (EDOs). 
Es especialmente útil cuando se busca una mayor precisión que la proporcionada por métodos más simples como el de Euler. 
Este método utiliza múltiples evaluaciones ponderadas de la función en cada paso para mejorar la aproximación de la solución. 
En el contexto del programa proporcionado, el método de Runge-Kutta de cuarto orden se implementa para calcular los valores aproximados de la solución de la EDO en diferentes puntos dentro de un intervalo dado.

Fórmula:

y(i+1) = yi + (1/6)*(k1 + 2*k2 + 2*k3 + k4)

k1 = h * f(xi, yi)

k2 = h * f(xi + h/2, yi + k1/2)

k3 = h * f(xi + h/2, yi + k2/2)

k4 = h * f(xi + h, yi + k3)

Algoritmo
```java
    1. Inicializar las condiciones iniciales: y0 y x0.
    2. Definir el tamaño del paso (Δx) y el número de pasos (iteraciones).
    3. Crear arreglos para almacenar los valores de x, y y la solución exacta en cada iteración.
    4. Asignar los valores iniciales a los arreglos.
    5. Iterar desde 0 hasta el número de pasos:
       - Calcular el siguiente valor de x: xi+1 = xi + Δx.
       - Calcular los coeficientes k1, k2, k3 y k4 utilizando la función f(x).
       - Utilizar los coeficientes para calcular el siguiente valor de y utilizando la fórmula de Runge-Kutta de cuarto orden: yi+1 = yi + (1/6)*(k1 + 2*k2 + 2*k3 + k4).
       - Calcular el valor exacto de la solución en xi+1.
    6. Mostrar los resultados, mostrando x, la solución exacta y la solución aproximada obtenida con el método de Runge-Kutta en cada iteración.
```

[Implementación](https://github.com/NiliLG/MetodosNumericosT6/tree/main/Runge-KuttaMN)

## Taylor

# Conclusiones



# Bibliografía

Chapra, S. C., & Canale, R. P. (2006). Métodos numéricos para ingenieros (5a ed.). McGraw-Hill Interamericana.
