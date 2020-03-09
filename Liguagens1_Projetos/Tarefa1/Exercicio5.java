import java.util.Scanner;
class Exercicio5{
    public static int Fibonacci(final int n){
        if (n < 2)
            return n;
        else 
            return (Fibonacci(n - 1) + Fibonacci(n - 2));
    }
    public static void main(String[] args){
    int n, i, j, k;
    Scanner scanner =  new Scanner(System.in);
    System.out.println("Quantos numeros da série:");
    i = 1;
    k = scanner.nextInt();
    for(n = 1; n < k; n++){
        j = Fibonacci(i);
        i++;
        System.out.println(j + "\n");
    }
    }
}