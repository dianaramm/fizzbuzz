//Diana 
package fizzbuzz;

public class fizzbuzz {

    public static void main(String[] args) {

        //imprimimos el mensaje de bienvenida 
        System.out.print("Bienvenido al programa fizzbuzz "
                + "\n  ");

        //Creamos el blucle de 1 hasta 100
        for (int i = 1; i <= 100; i++) {

            //Con la condición if comprobamos si (i) es múltiplo de 3 y 5 
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz ");

                //Con la condición else if comprobamos si (i) es múltiplo de 3          
            } else if (i % 3 == 0) {
                System.out.print("fizz ");

                //Con la condición else if comprobamos si (i) es múltiplo de 5     
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
                //Si no se cumplen ningunas de las condiciones anteriores se imprimirá el número correspondiente    
            } else {
                System.out.print(i + " ");
            }

        }
    }
}
