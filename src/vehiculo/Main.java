
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoXXX22233 miVehiculoXXX22233;
        int stockActual;
        
        miVehiculoXXX22233 = new VehiculoXXX22233("Seat",18000,100);
        operativaVehiculosXXX2223(miVehiculoXXX22233, 50); 
        stockActual = miVehiculoXXX22233.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    public static void operativaVehiculosXXX2223(VehiculoXXX22233 miVehiculoXXX22233, int messi) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoXXX22233.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoXXX22233.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
