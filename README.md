# Práctica de Estructuras de Datos: Árboles

El objetivo de este repositorio es proporcionar un entorno práctico para aplicar conceptos teóricos sobre árboles N-arios, árboles binarios, recorridos y transformaciones.

## Descripción de Ejercicios y Soluciones Implementadas

A continuación, se detalla lo que hace cada uno de los 5 ejercicios y la lógica implementada para resolverlos tanto en C++ como en Java:

### 1. Ejercicio 1: Árboles Básicos (Conteo de nodos en árboles N-arios)
- **¿Qué hace?** Cuenta el total de nodos presentes en un árbol que puede tener múltiples hijos (N-ario).
- **Cambios realizados:** Se implementó una función recursiva. Si el nodo está vacío, retorna 0. Si no, inicia un contador en 1 (representando al nodo actual) y, mediante un bucle, suma recursivamente el resultado de contar los nodos de cada uno de sus hijos.

### Resultados obtenidos en C++ y Java:

### 2. Ejercicio 2: Árbol Binario (Inserción en BST)
- **¿Qué hace?** Inserta un nuevo valor en un Árbol Binario de Búsqueda (BST) asegurando que los valores menores vayan a la izquierda y los mayores a la derecha.
- **Cambios realizados:** Se agregó lógica recursiva para ubicar el espacio correcto. Si la raíz está vacía, se crea el nodo ahí. Si el valor es menor, la función se llama a sí misma enviando la rama izquierda. Si es mayor, se llama a sí misma enviando la rama derecha.

### Resultados obtenidos en C++ y Java:

### 3. Ejercicio 3: Árbol Binario (Cálculo de profundidad máxima)
- **¿Qué hace?** Calcula la altura máxima de un árbol binario (la rama más profunda).
- **Cambios realizados:** Se calcularon recursivamente las alturas de las ramas izquierda y derecha. Luego, se compararon ambos resultados para obtener el número mayor (usando `max`) y se le sumó 1 para incluir el nodo actual en la cuenta.

### Resultados obtenidos en C++ y Java:

### 4. Ejercicio 4: Recorridos (Implementación de In-Order)
- **¿Qué hace?** Realiza un recorrido clásico del árbol (Izquierda -> Raíz -> Derecha) y guarda los valores ordenados en una lista.
- **Cambios realizados:** Se completó el recorrido recursivo yendo primero hacia el extremo izquierdo, luego añadiendo el valor del nodo actual a la lista de resultados, y finalmente avanzando hacia el lado derecho.

### Resultados obtenidos en C++ y Java:

### 5. Ejercicio 5: Transformación (Inversión o árbol espejo)
- **¿Qué hace?** Intercambia los lados de todas las ramas del árbol, creando un "efecto espejo".
- **Cambios realizados:** Se usó una variable temporal para no perder la rama izquierda. Se asignó a la izquierda la inversión recursiva de la rama derecha, y a la derecha se le asignó la inversión recursiva de lo que habíamos guardado en la temporal.

### Resultados obtenidos en C++ y Java:
