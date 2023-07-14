package palabrathis;

public class PalabraThis {
    
    
    public static void main(String[] args){
        
        Persona persona1 = new Persona("Juan", "Perez");
        
        System.out.println("Persona: "+ persona1);
        System.out.println("Nombre: " + persona1.nombre + " Apellido: "+ persona1.apellido);
        
    }
}

class Persona{
    
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Persona = " + this);
        
    }
}
