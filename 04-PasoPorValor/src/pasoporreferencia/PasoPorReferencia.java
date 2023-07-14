package pasoporreferencia;

import persona.Persona;

public class PasoPorReferencia {
    
    public static void main(String[] args){
        
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        
        cambiarValor(persona1);
    }
    
    public static void cambiarValor(Persona persona){
        persona.nombre = "Karla";
    }
    
}
