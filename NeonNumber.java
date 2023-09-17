import java.util.Scanner;
public class NeonNumber {
    public boolean check(int number){
        int square = (number * number);
        int sum = 0;
        boolean result = false;
        while(square > 0){
            sum += square % 10;
            square /= 10;
        }
        if(sum == number){
            result  = true;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        NeonNumber ob = new NeonNumber();
        
        System.out.println("Please enter the number you want to check : ");
        int num = scanner.nextInt();

        if(ob.check(num)){
            System.out.println("Congrats! You have chosen a neon number :)");
        } else {
            System.out.println("Well ... you have not chosen a neon number :( ");
        }
        scanner.close();
    }
}
