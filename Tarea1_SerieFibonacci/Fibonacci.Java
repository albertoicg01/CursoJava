/*
AUTHOR: Alberto Cruz
DATE: 01-12-21
Desc: serie de Fibonacci. Se realiza la serie Fibonacci y se repasa
estructura de arreglos unidemensionales en Java como los arrays
*/

public class Fibonacci{
    public static void main(String[] args){
        int i=1, n=30;
        
        
        //Usamos estructura de datos unidimensional
        int[] Fibonacci=new int[n] ;
        
        
        //Se inicializan los dos primeros elementos de la serie
        Fibonacci[0]=0;//0
        Fibonacci[1]=1;//1
        

        for(i=0;i<n;i++){
            if(i>1){
                Fibonacci[i]=Fibonacci[i-1]+Fibonacci[i-2];
            }
            
            System.out.println(Fibonacci[i]);
        }

        

        
    }
}