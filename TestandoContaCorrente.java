/**
 * TestandoContaCorrente
 */
public class TestandoContaCorrente {

    public static void main(String[] args) {
        
        ContaCorrente contaCorrente1 = new ContaCorrente();

        contaCorrente1.numero = 2343546;
        contaCorrente1.saldo = 650.00;
        contaCorrente1.limite = 1200.00;
        contaCorrente1.especial = true;

        System.out.println("Número da conta:"+contaCorrente1.numero);
        System.out.println("Saldo:"+contaCorrente1.saldo);
        System.out.println("Limite:");
        System.out.println("Especial?:"+contaCorrente1.especial);


    }
}