import java.util.Scanner;

public class FahrenConv {
    public void Fahren_celsuis(){
        System.out.println("Enter the value ");

        Scanner scanner =new Scanner(System.in);
        double value= scanner.nextDouble();
        scanner.nextLine();
        double celsuis2= (value -32) *(5.0/9);
//        System.out.printf("%.3f" ,celsuis2);
        System.out.printf ("%.2f fahrenheit is equivalent to %.3f celsuis%n",value, celsuis2);
        scanner.close();


    } public void Fahren_kelvin(){
        System.out.println("Enter the value ");

        Scanner scanner =new Scanner(System.in);
        double value= scanner.nextDouble();
        scanner.nextLine();
        double kelvin2= (value -32) *(5.0/9)+273.15;
        System.out.printf("%.2f fahrenheit is equivalent to %3 kelvin%n" ,value ,kelvin2);
        scanner.close();


    }
}