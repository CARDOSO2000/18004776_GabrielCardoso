
import java.util.Scanner;

public class JogadorBIG {
    public String nome;
    public String mao;

    void Registrar(){
        Scanner n = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        this.nome = n.nextLine();


    }
    boolean Jogada(){
        Scanner m = new Scanner(System.in);
        System.out.println("Rock, Paper, Scissors, Lizard, Spock?");
        this.mao = m.nextLine();
        if(this.mao.equalsIgnoreCase("Rock") || this.mao.equalsIgnoreCase("Paper") || this.mao.equalsIgnoreCase("Scissors") || this.mao.equalsIgnoreCase("Lizard") || this.mao.equalsIgnoreCase("Spock") ){
            return true;
        }else{
            System.out.println("ITS ROCK PAPER SCISSORS LIZARD SPOCK!!! TRY AGAIN");
            return false;
        }

    }

}
