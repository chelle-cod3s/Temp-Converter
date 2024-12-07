import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Choose your conversion:
                1:Celsuis to Kelvin     2:Celsuis to Fahrenheit 
                3:Kelvin to Fahrenheit   4:Kelvin to Celsuis
                5:Fahrenheit to Celsuis   6:Fahrenheit to Kelvin
                """);
        Scanner scan= new Scanner(System.in);
       int reply =scan.nextInt();


        switch (reply) {
          case 1:
              CelsuisConv cel2kel =new CelsuisConv();
              cel2kel.Celsius_kelvin();
              break;

            case 2:
                CelsuisConv cel2Fah =new CelsuisConv();
                cel2Fah.Celsius_Fahrenheit();
                break;

                case 3:
                KelvinConv kel2cels =new KelvinConv();
                    kel2cels.kelv_cels();
                break;

                case 4:
                KelvinConv kel2fah =new KelvinConv();
                    kel2fah.kelv_Fah();
                break;

                case 5:
                FahrenConv Fah2cel =new FahrenConv();
              Fah2cel.Fahren_celsuis();;
                break;

                case 6:
                FahrenConv Fah2kel =new FahrenConv();
                    Fah2kel.Fahren_kelvin();
                break;

            default:
                System.out.println("invalid response1");


        }

    }




}





