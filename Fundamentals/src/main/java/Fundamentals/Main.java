package Fundamentals;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date =new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Today is "+sdf.format(date));
        
        //Int
        var intNumber = 10;
        System.out.println("The variable intNumber "
                + "contains: "+intNumber);
        
        //Double
        var doubleNumber=10.0;
        System.out.println("The variable doubleNumber "
                + "contains: "+doubleNumber);
        
        //Float
        var floatNumber=10F;
        System.out.println("The variable floatNumber"
                + "contains: "+floatNumber);
        
        //A char primitive data type only can storage
        //one simple character
        char characterVariable='A';
        System.out.println(characterVariable);
        
        //A char primitive data type only can storage
        //one simple character
        char characterVariable2='\u0041';
        System.out.println(characterVariable2);
        
        //A char primitive data type only can storage
        //one simple character
        char characterVariable3=65;
        System.out.println(characterVariable2);
       
        
    }
}
