package test;

import dominio.Persona;

public class Test {
    
    public static void main(String[] args){
        
        Persona persona = new Persona("Juan", 10000.00, true);
        
        System.out.println("persona:  " + persona);
        System.out.println("Nombre: " + persona.getName());
        System.out.println("salario = " + persona.getSalary() + " MN");
        System.out.println("Estado de eliminación: " + persona.isEliminate());

        System.out.println("\n");

        persona.setName("Sergio");
        persona.setSalary(20000.00);
        persona.setEliminate(false);
        
        System.out.println("persona:  " + persona);
        System.out.println("Nombre: " + persona.getName());
        System.out.println("salario = " + persona.getSalary() + " MN");
        System.out.println("Estado de eliminación: " + persona.isEliminate());
        
        
    }    
}
