import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        String l, c;
        do{
        Scanner z = new Scanner(System.in);
            System.out.println("Qual jogo quer jogar?A para Jokempo B para BigBang");
            l = z.nextLine();
            if(l.equalsIgnoreCase("A")){
                Jogo.Jogon();
            }else{
                JogoBIG.jogar();
            }
            Scanner o = new Scanner(System.in);
            System.out.println(" Quer jogar denovo?S/N");
            c = o.nextLine();
        }while(c.equalsIgnoreCase("S"));
    }
}
