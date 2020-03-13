import java.util.Scanner;
public class Jogo {
    static void partida(Jogador a, Jogador b){
        if(a.mao.equalsIgnoreCase("Pedra") && b.mao.equalsIgnoreCase("Tesoura")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Tesoura") && b.mao.equalsIgnoreCase("Papel")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Papel") && b.mao.equalsIgnoreCase("Pedra")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Papel") && b.mao.equalsIgnoreCase("Tesoura")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else if(a.mao.equalsIgnoreCase("Pedra") && b.mao.equalsIgnoreCase("Papel")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else if(a.mao.equalsIgnoreCase("Tesoura") && b.mao.equalsIgnoreCase("Pedra")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else{
            System.out.println("EMPATE KKKKKK");
        }


    }
    public static void Jogon() {
        Jogador a = new Jogador();
        Jogador b = new Jogador();
        a.Registrar();
        b.Registrar();
        String S;
        int i = 0;
        do{
            while(i == 0) {
                if(a.Jogada()){
                b.Jogada();
            } if(b.Jogada()){
              i = 1;   
            }else{
                i = 0;
            }

        }
            partida(a, b);
            Scanner n = new Scanner(System.in);
            System.out.println("Quer tentar denovo?S/N");
             S = n.nextLine();

        }while(S.equals("S"));
    }
}
