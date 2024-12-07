import java.util.Scanner;

public class CelsuisConv {


    public void Celsius_kelvin(){
        System.out.println("Enter the value ");

        Scanner scanner =new Scanner(System.in);
        double value= scanner.nextDouble();
        scanner.nextLine();

        double kelvin=value+273.15;
        System.out.println(value +" celsuis is equivalent to: " +kelvin+ " kelvin");
        scanner.close();
    }


    public void Celsius_Fahrenheit(){
        System.out.println("Enter the value ");

        Scanner scanner =new Scanner(System.in);
        double value= scanner.nextDouble();
        scanner.nextLine();

        double fahrenheit = value*(9.0/5)+32;
        System.out.println(value +" celsuis is :" +value+ "fahrenheit");
        scanner.close();
    }
}
