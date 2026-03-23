import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        


        for(int i =0; i<10; i++){
        int numeroMayor = scanner.nextInt();
                if (numeroMayor < 100) {
                System.out.println("el numero es menor que 2");
            }else{
                System.out.println("el numero es mayor que 2");
            }
        }

        scanner.close();
    }
}