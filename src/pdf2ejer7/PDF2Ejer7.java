package pdf2ejer7;

/**
 *
 * @author Gonzalo
 */
public class PDF2Ejer7 {

    public static void main(String[] args) {
        Empleado e1 = new Empleado(25, "Juan");
        Empleado e2 = new Empleado(26, "Pedro");
        
        System.out.println("Edad :"+e1.getEdad()+"Nombre :"+e1.getNombre());
        System.out.println("Edad :"+e2.getEdad()+"Nombre :"+e2.getNombre());
    }
    
}
