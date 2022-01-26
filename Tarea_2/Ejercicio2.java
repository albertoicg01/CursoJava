import javax.sound.sampled.FloatControl;

/*
Programa que muestra el valor máximo y mínimo
que puede contener los tipos de datos primitivos en java,
es decir, su rango.
*/

public class Ejercicio2{
    public static void main(String[] args) {
        System.out.println("\n****Los valores de datos primitivos y su rango****\n");
        
        System.out.println("El byte puede almacenar de: "+Byte.MIN_VALUE+" a "+Byte.MAX_VALUE);
        System.out.println("\nEl short puede almacenar de: "+Short.MIN_VALUE+" a "+Short.MAX_VALUE);
        System.out.println("\nEl Integer puede almacenar de: "+Integer.MIN_VALUE+" a "+Integer.MAX_VALUE);
        System.out.println("\nEl long puede almacenar de: "+Long.MIN_VALUE+" a "+Long.MAX_VALUE);
        System.out.println("\nEl float puede almacenar de: "+Float.MIN_VALUE+" a "+Float.MAX_VALUE);
        System.out.println("\nEl double puede almacenar de: "+Double.MIN_VALUE+" a "+Double.MAX_VALUE);
        

        
        
    }
}