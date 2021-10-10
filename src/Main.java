import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, n = 4, cont = 2;
        String cad = "";
        System.out.println("¿Cuantos números impares de la lista de menor a mayor quiere ver?");
        num = sc.nextInt();
        System.out.println("Los " + num + " primeros términos de los números impares son:");
        if (num > 2) {
            cad = "2 - 3";
            while (cont < num) {
                i = 2;
                while (i <= n) {
                    if (i == n) {
                        cad = cad + " - " + n;
                        cont = cont + 1;
                    } else {
                        if (n % i == 0) {
                            i = n;
                        }
                    }
                    i = i + 1;
                }
                n = n + 1;
            }
            System.out.println(cad);
        } else {
            if (num > 0) {
                if (num == 1) {
                    System.out.println("es primo 2");
                } else {
                    System.out.println("es primo 2, 3");
                }
            }
        }
        System.out.println(" ");


        int numero,fibo1,fibo2,o;

        do{
            System.out.print("¿Cuantos números de la lista de sucesión de Fibonacci de menor a mayor quiere ver?");
            numero = sc.nextInt();
        }while(numero<=1);

        System.out.println("Los " + numero + " primeros términos de la sucesión Fibonacci son:");

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(o=2;o<=numero;o++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}