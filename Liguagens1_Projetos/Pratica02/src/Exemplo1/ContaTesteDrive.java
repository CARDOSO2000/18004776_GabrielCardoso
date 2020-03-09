package Exemplo1;

public class ContaTesteDrive {
    public static void main(String[] args) {
        Conta c1;
        //Instancia Conta - coloca a referencia de um objeto
        c1 = new Conta();
        // Acesso titular da conta
        c1.cliente = new Cliente();
        c1.cliente.nome = "Odair";
        System.out.println("Titular:" + c1.cliente.nome);
        Conta c2 = new Conta();
//        c2.titular = "Goku";
//        System.out.println("Titular C2:" + c2.titular);
        c1.saldo = 2000;
        c1.visualizarSaldo();
        c1.sacar(300);
        c1.visualizarSaldo();
        c1.transferirDinheiro(c2, 1000);
        c1.visualizarSaldo();
        c2.visualizarSaldo();


    }
}
