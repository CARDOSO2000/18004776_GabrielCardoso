import java.util.Scanner;

public class JogoBIG {
    static void Partida(JogadorBIG a, JogadorBIG b){
        if(a.mao.equalsIgnoreCase("Scissors") && b.mao.equals("Paper")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Rock") && b.mao.equalsIgnoreCase("Scissors")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Paper") && b.mao.equalsIgnoreCase("Rock")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Paper") && b.mao.equalsIgnoreCase("Scissors")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else if(a.mao.equalsIgnoreCase("Rock") && b.mao.equalsIgnoreCase("Paper")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else if(a.mao.equalsIgnoreCase("Scissors") && b.mao.equalsIgnoreCase("Rock")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else if(a.mao.equalsIgnoreCase("Spock") && b.mao.equalsIgnoreCase("Scissors")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome + " SPOCK SMASHES SCISSORS");
        }else if(a.mao.equalsIgnoreCase("Lizard") && b.mao.equalsIgnoreCase("Spock")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Spock") && b.mao.equalsIgnoreCase("Lizard")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else if(a.mao.equalsIgnoreCase("Spock") && b.mao.equalsIgnoreCase("Lizard")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else if(a.mao.equalsIgnoreCase("Lizard") && b.mao.equalsIgnoreCase("Paper")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Paper") && b.mao.equalsIgnoreCase("Lizard")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else if(a.mao.equalsIgnoreCase("Scissors") && b.mao.equalsIgnoreCase("Lizard")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Lizard") && b.mao.equalsIgnoreCase("Rock")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else if(a.mao.equalsIgnoreCase("Paper") && b.mao.equalsIgnoreCase("Spock")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Spock") && b.mao.equalsIgnoreCase("Paper")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else if(a.mao.equalsIgnoreCase("Spock") && b.mao.equalsIgnoreCase("Rock")){
            System.out.println(a.nome + " ganhou do(a) " + b.nome);
        }else if(a.mao.equalsIgnoreCase("Rock") && b.mao.equalsIgnoreCase("Spock")){
            System.out.println(b.nome + " ganhou do(a) " + a.nome);
        }else{
            System.out.println("EMPATE KKKKKK");
        }

        }
        public static void jogar(){
            JogadorBIG a = new JogadorBIG();
            JogadorBIG b = new JogadorBIG();
            a.Registrar();
            b.Registrar();
            String S;
            do{
                while(!(a.Jogada() && b.Jogada())) {
                    a.Jogada();
                    b.Jogada();
                }
                Partida(a, b);
                Scanner n = new Scanner(System.in);
                System.out.println("Quer tentar denovo?S/N");
                S = n.nextLine();

            }while(S.equals("S"));
        }

}
