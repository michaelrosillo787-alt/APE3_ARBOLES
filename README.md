# Práctica de Estructuras de Datos: Árboles

El objetivo de este repositorio es proporcionar un entorno práctico para aplicar conceptos teóricos sobre árboles N-arios, árboles binarios, recorridos y transformaciones.

## Descripción de Ejercicios y Soluciones Implementadas

A continuación, se detalla lo que hace cada uno de los 5 ejercicios y la lógica implementada para resolverlos tanto en C++ como en Java:

### 1. Ejercicio 1: Árboles Básicos (Conteo de nodos en árboles N-arios)
- **¿Qué hace?** Cuenta el total de nodos presentes en un árbol que puede tener múltiples hijos (N-ario).
- **Cambios realizados:** Se implementó una función recursiva. Si el nodo está vacío, retorna 0. Si no, inicia un contador en 1 (representando al nodo actual) y, mediante un bucle, suma recursivamente el resultado de contar los nodos de cada uno de sus hijos.

#### C++
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/c8e6d64eedbcda43dd16a1b4bbba38a25c2b874c/im%C3%A1genes/cambio_ej1_c%2B%2B.png)

#### Java
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/c8e6d64eedbcda43dd16a1b4bbba38a25c2b874c/im%C3%A1genes/cambio_ej1_java.png)

### Resultados obtenidos en C++ y Java:
#### C++
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/cb7a9d68520887da8077ad71cc287440e75910c1/im%C3%A1genes/ejercicio1.png)

#### Java
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/cb7a9d68520887da8077ad71cc287440e75910c1/im%C3%A1genes/ejercicio1Java.png)
***

### 2. Ejercicio 2: Árbol Binario (Inserción en BST)
- **¿Qué hace?** Inserta un nuevo valor en un Árbol Binario de Búsqueda (BST) asegurando que los valores menores vayan a la izquierda y los mayores a la derecha.
- **Cambios realizados:** Se agregó lógica recursiva para ubicar el espacio correcto. Si la raíz está vacía, se crea el nodo ahí. Si el valor es menor, la función se llama a sí misma enviando la rama izquierda. Si es mayor, se llama a sí misma enviando la rama derecha.

#### C++
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/c8e6d64eedbcda43dd16a1b4bbba38a25c2b874c/im%C3%A1genes/cambio_ej2_c%2B%2B.png)

#### Java
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/c8e6d64eedbcda43dd16a1b4bbba38a25c2b874c/im%C3%A1genes/cambio_ej2_java.png)


### Resultados obtenidos en C++ y Java:
#### C++
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/cb7a9d68520887da8077ad71cc287440e75910c1/im%C3%A1genes/ejercicio2.png)

#### Java
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/cb7a9d68520887da8077ad71cc287440e75910c1/im%C3%A1genes/ejercicio2Java.png)
***

### 3. Ejercicio 3: Árbol Binario (Cálculo de profundidad máxima)
- **¿Qué hace?** Calcula la altura máxima de un árbol binario (la rama más profunda).
- **Cambios realizados:** Se calcularon recursivamente las alturas de las ramas izquierda y derecha. Luego, se compararon ambos resultados para obtener el número mayor (usando `max`) y se le sumó 1 para incluir el nodo actual en la cuenta.

#### C++
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/c8e6d64eedbcda43dd16a1b4bbba38a25c2b874c/im%C3%A1genes/cambio_ej3_c%2B%2B.png)

#### Java
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/c8e6d64eedbcda43dd16a1b4bbba38a25c2b874c/im%C3%A1genes/cambio_ej3_java.png)


### Resultados obtenidos en C++ y Java:
#### C++
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/cb7a9d68520887da8077ad71cc287440e75910c1/im%C3%A1genes/ejercicio3.png)

#### Java
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/cb7a9d68520887da8077ad71cc287440e75910c1/im%C3%A1genes/ejercicio3Java.png)
***

### 4. Ejercicio 4: Recorridos (Implementación de In-Order)
- **¿Qué hace?** Realiza un recorrido clásico del árbol (Izquierda -> Raíz -> Derecha) y guarda los valores ordenados en una lista.
- **Cambios realizados:** Se completó el recorrido recursivo yendo primero hacia el extremo izquierdo, luego añadiendo el valor del nodo actual a la lista de resultados, y finalmente avanzando hacia el lado derecho.

#### C++
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/c8e6d64eedbcda43dd16a1b4bbba38a25c2b874c/im%C3%A1genes/cambio_ej4_c%2B%2B.png)

#### Java
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/c8e6d64eedbcda43dd16a1b4bbba38a25c2b874c/im%C3%A1genes/cambio_ej4_java.png)


### Resultados obtenidos en C++ y Java:
#### C++
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/cb7a9d68520887da8077ad71cc287440e75910c1/im%C3%A1genes/ejercicio4.png)

#### Java
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/cb7a9d68520887da8077ad71cc287440e75910c1/im%C3%A1genes/ejercicio4Java.png)
***

### 5. Ejercicio 5: Transformación (Inversión o árbol espejo)
- **¿Qué hace?** Intercambia los lados de todas las ramas del árbol, creando un "efecto espejo".
- **Cambios realizados:** Se usó una variable temporal para no perder la rama izquierda. Se asignó a la izquierda la inversión recursiva de la rama derecha, y a la derecha se le asignó la inversión recursiva de lo que habíamos guardado en la temporal.

#### C++
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/c8e6d64eedbcda43dd16a1b4bbba38a25c2b874c/im%C3%A1genes/cambio_ej5_c%2B%2B.png)

#### Java
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/c8e6d64eedbcda43dd16a1b4bbba38a25c2b874c/im%C3%A1genes/cambio_ej5_java.png)


### Resultados obtenidos en C++ y Java:
#### C++
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/cb7a9d68520887da8077ad71cc287440e75910c1/im%C3%A1genes/ejercicio5.png)

#### Java
![imagen](https://github.com/michaelrosillo787-alt/APE3_ARBOLES/blob/cb7a9d68520887da8077ad71cc287440e75910c1/im%C3%A1genes/ejercicio5Java.png)
