import java.util.Scanner;
public class Pronic_Number{
    public static boolean check(int num){
        boolean result = false;
        for(int i=0; i<num; i++){
            if(i * (i + 1) == num){
                result = true;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number you want to check : ");
        int number = scanner.nextInt();

        if(check(number)){
            System.out.println("The given number is a pronic number.");
        } else {
            System.out.println("The given number is not a pronic number.");
        }
        scanner.close();
    }
}   
