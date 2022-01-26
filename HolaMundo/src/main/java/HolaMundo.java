/*
    Otro ejercicio de programación sobre
    lectura de valores por la entrada estándar
*/
import java.util.Scanner;

public class HolaMundo{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Ingresa el valor de un número: ");
        
        //Este numero es forzosamente recibido como una cadena, 
        String numeroInteger=scanner.nextLine();
        
        
        System.out.println("El numero que se recibió es: "+numeroInteger);
        
        int multiplicador=50,conversion=0, resultado=0;
        
        
        //Esta es la forma de obtener la parte entera de una cadena
        conversion=Integer.valueOf(numeroInteger);
        
        resultado=multiplicador*conversion;
        
        System.out.println(multiplicador+"*"+conversion+"="+resultado);
        
        
    }
}