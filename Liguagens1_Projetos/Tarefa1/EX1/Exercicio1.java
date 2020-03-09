import java.util.Scanner;

class Exercicio1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome:");
        String nome, RA, email, telefone, idade;
        nome = scanner.nextLine();
        System.out.println("RA:");
        RA = scanner.nextLine();
        System.out.println("email:");
        email = scanner.nextLine();
        System.out.println("Idade:");
        idade = scanner.nextLine();
        System.out.println("Telefone:");
        telefone = scanner.nextLine();
       
        System.out.println("Nome: " + nome );
        System.out.println("Ra: " + RA );
        System.out.println("Email: " + email );
        System.out.println("Idade: " + idade );
        System.out.println("Telefone: " + telefone );
    }
}