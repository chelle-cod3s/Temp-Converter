import java.util.Scanner;

public class KelvinConv {
    public void kelv_cels(){
        System.out.println("Enter the value ");

        Scanner scanner =new Scanner(System.in);
        double value= scanner.nextDouble();
        scanner.nextLine();

        double celsuis =value-273.15;
        System.out.printf( "%.2f kelvin is equivalent to %.3f celsuis%n" ,value,celsuis);
        scanner.close();
    }

    public void kelv_Fah(){
        System.out.println("Enter the value ");

        Scanner scanner =new Scanner(System.in);
        double value= scanner.nextDouble();
        scanner.nextLine();
        double fahren =( value-273.15)*(9.0/5)+32;

        System.out.printf("%.2f kelvin is equivalent to %.3f fahrenheit%n" ,value ,fahren);


        scanner.close();
    }


}
