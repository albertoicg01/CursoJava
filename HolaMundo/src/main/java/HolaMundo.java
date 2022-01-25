import java.util.Scanner;


/*
Ejercicio sobre libro hecho por Alberto Cruz.
*/

public class HolaMundo{
    public static void main(String args[]){
        System.out.println("Bienvenido a mi primer ejercicio de prueba");
        //////////////////////////////////////////////////////////////////////
        
        Scanner entradaEstandar=new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del libro: ");
        
        String titulo=entradaEstandar.nextLine();
        
        
        System.out.println("Ingresa el nombre del autor:");
        String autor=entradaEstandar.nextLine();


        System.out.println("El libro "+titulo+" fue escrito por "+ autor);
        
        
        System.out.println("Gracias la confianza en desarrollados por Alberto Cruz");
        
     

        
        
    }
}