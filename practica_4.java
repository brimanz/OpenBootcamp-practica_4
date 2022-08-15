public class Main {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.edad = 33;
        cliente.nombre = "Jon";
        cliente.telefono = 88759621;
        cliente.credito = 2000;
        
        System.out.println("Nombre de cliente: " + cliente.nombre);
        System.out.println("Edad de cliente: " + cliente.edad);
        System.out.println("Numero de cliente: " + cliente.telefono);
        System.out.println("Credito aprobado es : " + cliente.credito + "$");

        
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 21;
        trabajador.nombre = "Mario";
        trabajador.telefono = 55708121;
        trabajador.salario = 2500;
        System.out.println("\n");

        System.out.println("Nombre de trabajador: " + trabajador.nombre);
        System.out.println("Edad de trabajador: " + trabajador.edad);
        System.out.println("Numero de trabajador: " + trabajador.telefono);
        System.out.println("El salario es : " + trabajador.salario + "$");
    }
}


    class Persona{
        int edad;
        String nombre;
        int telefono;
    }
    
    
    //classes that will inherit attributes from the person class
    class Cliente extends Persona{
        int credito;
    }
    
    class Trabajador extends Persona{
        int salario;
    }