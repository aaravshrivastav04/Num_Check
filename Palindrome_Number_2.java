import java.util.Scanner;
public class Palindrome_Number_2 {
    public static boolean is_palindrome(int number){
        StringBuffer num_string = new StringBuffer(Integer.toString(number));
        boolean result = false;
        if(num_string.reverse() == num_string){
            result = true;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want to check : ");
        int num = sc.nextInt();
        System.out.println(is_palindrome(num));
        sc.close();
    }
}
