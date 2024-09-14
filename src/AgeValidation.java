import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        //Se crea una constante que en este caso es AGE_LIMIT
        final int AGE_LIMIT = 18;
        
        //Se crea un Scanner para leer los datos del usuario
        Scanner scanner = new Scanner (System.in);

        //El usuario ingresa su edad 
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //Validar si la edad  ingresada es mayor o igual a la edad limite
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        } else {
           System.out.println("Access denied");
        }

        //Se cierra el escaner
        scanner.close();
    }  
    
}

