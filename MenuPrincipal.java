//DAVID RUEDA ZULETA

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        boolean bandera = true;
        int opt = 0;
        MetodosArticulo m = new MetodosArticulo();
        Scanner sc = new Scanner(System.in);
        Queue<ObjArticulo> p = new LinkedList<>();
        while (bandera) {
            System.out.println("-----------------------------");
            System.out.println("Electrodomesticos Estructuras");
            System.out.println("1: Ingresar Articulo");
            System.out.println("2: Realizar venta");
            System.out.println("3: Modificar Articulo");
            System.out.println("4: Eliminar Articulo");
            System.out.println("5: Eliminar Venta");
            System.out.println("6: Salir");
            System.out.println("-----------------------------");
            while (!sc.hasNextInt()) {
                System.out.println("Opción no valida por favor verifique....");
                System.out.println("-----------------------------");
                sc.next();
            }
            opt = sc.nextInt();
            sc.nextLine();

            if (opt < 1 || opt > 8) {
                System.out.println("Opcion no valida, Por favor ingrese un numero entre 1 a 6");
                System.out.println("-----------------------------");
                continue;
            }
            switch (opt) {
                case 1:
                   m.IngersarArticulo(p);
                    break;
                case 2:
                    m.Venta(p);
                    break;
                case 3:
                    
                    break;
                case 4:
                
                    break;
                case 5:
                    
                    break;

                default:
                    System.out.println("Fue un Gusto hasta Pronto...");
                    bandera = false;
                    break;
            }
        }
    }
}
