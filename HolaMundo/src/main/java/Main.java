/**
 *
 * @author alber
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Proporciona el título aquí: ");
        
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor"):
        String autor= scanner.nextLine();
        
        System.out.println(titulo+" fue escrito por "+autor);
        
    }
}
