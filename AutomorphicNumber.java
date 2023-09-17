import java.util.Scanner;

public class AutomorphicNumber{

    public boolean check(int number){
            int copy1 = number;
            int count= 0;
            
            boolean result = false; 

            while(copy1 != 0){
                copy1 /= 10;
                count++;
            }

            if(((number * number) - number) % Math.pow(10, count) == 0){
                result = true;
            }
            
            return(result);

        }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);    
        AutomorphicNumber ob = new AutomorphicNumber();
        System.out.println("Please enter the number you want to check : ");
        int n = scanner.nextInt();

        if(ob.check(n)){
            System.out.println("Yay! Check is true :)");
        } else {
            System.out.println("Alas, Check false :(");
        }
        scanner.close();
    }
}