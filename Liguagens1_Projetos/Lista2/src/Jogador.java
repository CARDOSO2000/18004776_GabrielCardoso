import java.util.Scanner;
public class Jogador {
    public String nome;
    public String mao;

    void Registrar(){
        Scanner n = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        this.nome = n.nextLine();


    }
    boolean Jogada(){
        Scanner m = new Scanner(System.in);
        System.out.println("Pedra, Papel ou Tesoura?");
        this.mao = m.nextLine();
        if(this.mao.equalsIgnoreCase("Pedra") || this.mao.equalsIgnoreCase("Papel") || this.mao.equalsIgnoreCase("Tesoura")){
            return true;
        }else{
            System.out.println("E PEDRA PAPEL OU TESOURA");
            return false;
        }

    }

}
