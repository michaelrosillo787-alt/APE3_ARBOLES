class Nodo {
    int valor;
    Nodo izquierdo, derecho;
    Nodo(int valor) { this.valor = valor; }
}

public class Ejercicio2_Binario {
    public static Nodo insertar(Nodo raiz, int valor) {
        // si llegamos a un lugar vacio, creamos el nuevo nodo ahi
        if (raiz == null) {
            return new Nodo(valor);
        }
        
        // si el valor es menor, nos vamos por la rama izquierda
        if (valor < raiz.valor) {
            raiz.izquierdo = insertar(raiz.izquierdo, valor);
        } 
        // si es mayor, nos vamos por la rama derecha
        else if (valor > raiz.valor) {
            raiz.derecho = insertar(raiz.derecho, valor);
        }
        
        // devolvemos la raiz modificada
        return raiz;
    }

    public static void main(String[] args) {
        Nodo raiz = new Nodo(10);
        
        // Insertamos valores
        insertar(raiz, 5);
        insertar(raiz, 15);
        insertar(raiz, 3);
        
        System.out.println("--- Prueba Ejercicio 2 ---");
        System.out.println("Raiz (Esperado 10): " + raiz.valor);
        
        String izq = (raiz.izquierdo != null) ? String.valueOf(raiz.izquierdo.valor) : "null";
        System.out.println("Hijo Izquierdo de Raiz (Esperado 5): " + izq);
        
        String der = (raiz.derecho != null) ? String.valueOf(raiz.derecho.valor) : "null";
        System.out.println("Hijo Derecho de Raiz (Esperado 15): " + der);
        
        String izqIzq = (raiz.izquierdo != null && raiz.izquierdo.izquierdo != null) ? String.valueOf(raiz.izquierdo.izquierdo.valor) : "null";
        System.out.println("Hijo Izquierdo del 5 (Esperado 3): " + izqIzq);
    }
}
