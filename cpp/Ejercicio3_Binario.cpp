#include <iostream>
#include <algorithm> 
using namespace std;

// Asumiendo la estructura Nodo del Ejercicio 2
struct Nodo {
    int valor;
    Nodo* izquierdo;
    Nodo* derecho;
    Nodo(int v) : valor(v), izquierdo(nullptr), derecho(nullptr) {}
};

int calcularAltura(Nodo* raiz) {
    // si no hay nodo, no hay altura
    if (raiz == nullptr) return 0;
    
    // calculamos la altura de los dos lados
    int alturaIzq = calcularAltura(raiz->izquierdo);
    int alturaDer = calcularAltura(raiz->derecho);
    
    // nos quedamos con el lado mas largo y le sumamos 1 por el nodo actual
    return 1 + std::max(alturaIzq, alturaDer);
}

int main() {
    Nodo* raiz = new Nodo(1);
    raiz->derecho = new Nodo(2);
    raiz->derecho->izquierdo = new Nodo(3);
    
    cout << "--- Prueba Ejercicio 3 ---" << endl;
    cout << "Altura esperada: 3" << endl;
    cout << "Altura calculada: " << calcularAltura(raiz) << endl;
    cout << "Altura de arbol nulo (esperado 0): " << calcularAltura(nullptr) << endl;

    return 0;
}
