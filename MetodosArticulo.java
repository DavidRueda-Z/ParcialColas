import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MetodosArticulo {
    
    Scanner sc = new Scanner(System.in);

    public void Venta(Queue<ObjArticulo> cola) {
        ObjArticulo o = new ObjArticulo();
        ObjVenta v = new ObjVenta();
        
        

        
        System.out.println("Ingrese la referencia del articulo: ");
        String referencia = sc.next();
        System.out.println("-----------------------------");

        for (ObjArticulo item : cola) {
            if(item.getReferencia().equals(referencia))
            {
                System.out.println("Referencia encontrada: ");
                System.out.println("Precio: " + item.getPrecio());
                System.out.println("Cantidad disponible: " + item.getCantidad());
                if (item.getCantidad() == 0) {
                    System.out.println("No hay referencia existente, no se puede realizar la venta:");
                    System.out.println("-----------------------------");
                    return;
                }
                else{
                    System.out.println("¿Desea registrar una venta de este articulo? (SI/NO)");
                    String opt = sc.next();
                    System.out.println("Ingrese el valor de la venta promedio: ");
                    double Venta = sc.nextDouble();

                    if(opt.equalsIgnoreCase("si"))
                    {
                        item.setCantidad(item.getCantidad()-1);
                        if(Venta > v.getTotal()){
                        System.out.println("Se le aplicara un 10% del descuento");
                        v.setTotal((v.getTotal() + item.getPrecio()) * 0.90);
                        }
                        else{
                            v.setTotal(v.getTotal() + item.getPrecio());
                        }
                        v.setNombreusuario(item.getNombreUsu());
                        System.out.println("Venta registrada con exito a nombre de '" + item.getNombreUsu() + "'");
                        System.out.println("Con un total de: " + v.getTotal());
                        System.out.println("-----------------------------");
                    }
                    else{
                        return;
                    }

                }
            }
            else
            {
                System.out.println("La referncia que busca no se encuentra, haga un registro primero ");
                return;
            }
        }
        
    }

    public Queue<ObjArticulo> IngersarArticulo(Queue<ObjArticulo> cola)
    {   
        ObjArticulo o = new ObjArticulo();
        System.out.println("Ingrese la referencia del articulo: ");
        o.setReferencia(sc.next());
        
        System.out.println("Ingese la Marca del articulo: ");
        o.setMarca(sc.next());

        System.out.println("Ingrese el precio del articulo: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Opcion no valida, intentelo de nuevo");
            System.out.println("-----------------------------");
            sc.next();
        }
        o.setPrecio(sc.nextDouble());


        System.out.println("Ingrese la cantidad del articulo: ");
        while (!sc.hasNextInt()) {
            System.out.println("Opcion no valida, intentelo de nuevo");
            System.out.println("-----------------------------");
            sc.next();
        }
        o.setCantidad(sc.nextInt());

        System.out.println("Ingrese el nombre del usuario: ");
        o.setNombreUsu(sc.next());

        System.out.println("Ingrese la cedula del usuario: ");
        o.setCedulaUsu(sc.next());

        cola.offer(o);

    return cola;
    }

    public Queue<ObjArticulo> Modificar(Queue<ObjArticulo> p)
    {   
        Queue<ObjArticulo> temporal = new LinkedList<>();

        while(!p.isEmpty())
        {
            ObjArticulo actual = p.poll();
            System.out.println("Ingese la referencia del articulo que desea modificar");
            String arti = sc.next();
            for (ObjArticulo item : p) {
                if(item.getReferencia().equalsIgnoreCase(arti))
                {
                    
                    System.out.println("Referencia encontrada: " + item.getReferencia());
                    System.out.println("Marca: " + item.getMarca());
                    System.out.println("Precio: " + item.getPrecio());
                    System.out.println("Cantidad: " + item.getCantidad());
                    System.out.println("¿Que campo desea modificar'");

                    System.out.println("1. Marca");
                    System.out.println("2. Precio");
                    System.out.println("3. Cantidad");
                    System.out.println("4. Cancelar");
                    while (!sc.hasNextInt()) {
                        System.out.println("Opcion no valida, intentelo de nuevo");
                        System.out.println("-----------------------------");
                        sc.next();
                    }
                    int opcion= sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Digite la nueva marca: ");
                            String NuevaMarca = sc.next();
                            item.setMarca(NuevaMarca);
                            break;
                        case 2:
                            System.out.println("Digte el precio nuevo: ");
                            while (!sc.hasNextDouble()) {
                                System.out.println("Opcion no valida, intentelo de nuevo");
                                System.out.println("-----------------------------");
                                sc.next();
                            }
                            double NuevoPrecio = sc.nextDouble();
                            item.setPrecio(NuevoPrecio);
                            break;
                        case 3:
                            System.out.println("Digite la nueva cantidad: ");
                            while (!sc.hasNextInt()) {
                                System.out.println("Opcion no valida, intentelo de nuevo");
                                System.out.println("-----------------------------");
                                sc.next();
                            }
                            int NuevaCantidad = sc.nextInt();
                            item.setCantidad(NuevaCantidad);
                            break;
                        case 4:
                            System.out.println("Volviendo al menu principal....");
                            break;
                        default:
                            System.out.println("Opcion no valida intentelo de nuevo");
                            System.out.println("-----------------------------");
                            break;
                    }
                }
                else
                {
                    System.out.println("No existe esa referencia");
                }
            }
        }
        
        return p;
    }

}
