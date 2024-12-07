import java.util.Scanner;

public class FahrenConv {
    public void Fahren_celsuis(){
        System.out.println("Enter the value ");

        Scanner scanner =new Scanner(System.in);
        double value= scanner.nextDouble();
        scanner.nextLine();
        double celsuis2= (value -32) *(5.0/9);
        System.out.println(value+" fahrenheit is equivalent to :"+celsuis2+" celsuis ");
        scanner.close();


    } public void Fahren_kelvin(){
        System.out.println("Enter the value ");

        Scanner scanner =new Scanner(System.in);
        double value= scanner.nextDouble();
        scanner.nextLine();
        double kelvin2= (value -32) *(5.0/9)+273.15;
        System.out.println(value+" fahrenheit is equivalent to :"+kelvin2+" kelvin ");
        scanner.close();


    }
}