
import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ageLimit = 18;// La variable ageLimit almacena el valor entero 18, es una constante porque esa edad minima no cambia
        
        System.out.println("Enter your age");
        int age= scanner.nextInt();//el usuario ingresa su edad para validarla luego

        
        if (age >= ageLimit) { //este condicional compara si la edad ingresada es mayor o igual al la de la constante
            System.out.println("Access granted");// si es true da el mensaje "Access granted"
        } else{
            System.out.println("Access denied"); // si es false da el mensaje "Access denied"
        }
        
    }
}
