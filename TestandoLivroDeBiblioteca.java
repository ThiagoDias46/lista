/**
 * TestandoLivroDeBiblioteca
 */
public class TestandoLivroDeBiblioteca {

    public static void main(String[] args) {
        
        LivroDeBiblioteca livroDeBiblioteca1 = new LivroDeBiblioteca();

        livroDeBiblioteca1.nome = "Beserk";
        livroDeBiblioteca1.ediçao = 2;
        livroDeBiblioteca1.autor = "Kentaro Miura";
        livroDeBiblioteca1.emprestimo = false;

        System.out.println("Nome do Livro:"+livroDeBiblioteca1.nome);
        System.out.println("Edição:"+livroDeBiblioteca1.ediçao);
        System.out.println("Autor:"+livroDeBiblioteca1.autor);
        System.out.println("Emprestado?:"+livroDeBiblioteca1.emprestimo);

    }
}