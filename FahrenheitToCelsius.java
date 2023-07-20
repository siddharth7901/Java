import java.util.*; 
public class FahrenheitToCelsius {
    public static void main (String[] args){
        float temperature;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  temperature in farenheit");
        temperature = in.nextInt();
        temperature = ((temperature - 32)*5)/9;
        System.out.println("Temperature in celsius ="+ temperature);
    }
    
}
