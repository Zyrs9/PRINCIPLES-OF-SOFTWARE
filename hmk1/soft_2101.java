import java.util.Scanner;

public class soft_2101 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number_1 = scanner.nextInt();
        System.out.print("Please enter an integer: ");
        int number_2 = scanner.nextInt();

        scanner.close();

        for(int i = number_1 + 1; i < number_2; i++){
            if (i + 1 == number_2){
                System.out.println(i);
                break;
            }
            if(i%2==1)
                System.out.print(i + ", ");
        }

    }
}