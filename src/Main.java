import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<=5; i++){
            for(int j=0; j<N; j--){
                if(i<j)
                System.out.println("*");
            }else{
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
