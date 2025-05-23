import java.util.Scanner;

public class MainArbolTaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        int opcion;

        do {
            System.out.println("\n seleccione una opcion:");
            System.out.println("1. Agregar nodo");
            System.out.println("2. Recorrido PreOrden");
            System.out.println("3. Recorrido InOrden");
            System.out.println("4. Recorrido PostOrden");
            System.out.println("5. Buscar nodo");
            System.out.println("6. Mostrar altura del árbol");
            System.out.println("7. Contar nodos hoja");
            System.out.println("8. Eliminar nodo");
            System.out.println("9. Vaciar árbol");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a agregar: ");
                    int val = scanner.nextInt();
                    arbol.agregar(val);
                    break;
                case 2:
                    System.out.print("Recorrido PreOrden: ");
                    arbol.preOrden();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Recorrido InOrden: ");
                    arbol.inOrden();
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Recorrido PostOrden: ");
                    arbol.postOrden();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Ingrese el valor a buscar: ");
                    int buscar = scanner.nextInt();
                    System.out.println(arbol.buscar(buscar) ? "Nodo encontrado." : "Nodo no encontrado.");
                    break;
                case 6:
                    System.out.println("Altura del árbol: " + arbol.altura());
                    break;
                case 7:
                    System.out.println("Cantidad de nodos hoja: " + arbol.contarHojas());
                    break;
                case 8:
                    System.out.print("Ingrese el valor del nodo a eliminar: ");
                    int eliminar = scanner.nextInt();
                    arbol.eliminar(eliminar);
                    System.out.println("Nodo eliminado (si existía).");
                    break;
                case 9:
                    arbol.vaciar();
                    System.out.println("Árbol vaciado.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}