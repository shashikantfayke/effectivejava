package learnprogramming;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static boolean isPrime(Integer number){

       if (number <=1 ) {return false;}

        else {

           for (int i=2;i<number;i++){

               if (number%i==0){
                   return false;
               }
           }
           return true;
       }
    }


    public boolean isDivisible(Integer number){
        return number%2==0;
    }
}
