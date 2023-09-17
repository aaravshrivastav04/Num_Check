import java.util.Scanner;
public class Palindrome_Number_1 {
    public static boolean is_palindrome(int number){
        int copy1 = number;
        int copy2 = number;
        int count = 0;
        boolean result = false;
        while(copy1 > 0){
            copy1 /= 10;
            count++;
        }
        int reversed = 0;
        while(copy2 > 0){
            reversed += copy2 % 10 * Math.pow(10, count - 1);
            copy2 /= 10;
            count --;
        }
        if(reversed == number){
            result  = true;
        }
        return(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want to check : ");
        int num = sc.nextInt();
        System.out.println(is_palindrome(num));
    }
}
