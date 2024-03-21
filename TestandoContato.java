/**
 * TestandoContato
 */
public class TestandoContato {

    public static void main(String[] args) {
        
        ContatoAgenda contatoAgenda1 = new ContatoAgenda();

        contatoAgenda1.nome = "Luiz Fernando";
        contatoAgenda1.numero = 21009272;
        contatoAgenda1.email = "luizfernando1@gmail.com";

        System.out.println("Nome:"+contatoAgenda1.nome);
        System.out.println("Número:"+contatoAgenda1.numero);
        System.out.println("Email:"+contatoAgenda1.email);
    }
}