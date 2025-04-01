import java.util.Scanner;

public class RecursiveMinusFive {


    static void minusFive(int number, int first, boolean decrease){
        System.out.print(number + ", ");
        if (decrease){
            if (number > 0){
                minusFive(number-5, first, true);
            }
            else {
                minusFive(number+5, first, false);
            }
        }
        else {
            if (number <= first) {
                minusFive(number + 5, first, false);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        minusFive(n,n,true);
        sc.close();
    }

}
