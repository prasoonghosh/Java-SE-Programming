package lab_2;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        float temp = sc.nextFloat();

        if(temp < 0){
            System.out.println("Freezing Weather");
        }
        else if(0<=temp && temp<10) {
            System.out.println("Very Cold weather");
        }
        else if (10<=temp && temp < 20){
            System.out.println("Cold Weather");
        }
        else if (20<=temp && temp<30){
            System.out.println("Normal Temperature");
        }
        else if (30<=temp && temp <40){
            System.out.println("It's Hot");
        }
        else if (40<=temp){
            System.out.println("It's very Hot");
        }
    }
}
