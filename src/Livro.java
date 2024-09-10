/**
 * Esta classe representa um Livro que esta na Biblioteca.
 * Contém propriedades e métodos para manipular as informações de um livro.
 *
 * @author Lucas Jardim
 */
public class Livro {

    // Propriedades do Livro
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;

    /**
     * Criação do objeto Livro.
     *
     * @param titulo Título do livro
     * @param autor Autor do livro
     * @param anoPublicacao Ano de publicação do livro
     */
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    /**
     * Retorna o título do livro.
     *
     * @return Título do livro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retorna o autor do livro.
     *
     * @return Autor do livro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Retorna o ano de publicação do livro.
     *
     * @return o ano de publicação
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * Verifica se o livro está emprestado.
     *
     * @return Retorna true se o livro estiver emprestado, false caso não estiver!
     */
    public boolean isEmprestado() {
        return emprestado;
    }

    /**
     * Método para emprestar o livro.
     */
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + titulo + "' já está emprestado.");
        }
    }

    /**
     * Método para devolver o livro.
     */
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + titulo + "' já estava disponível.");
        }
    }

    /**
     * Método main para testar a classe Livro.
     */
    public static void main(String[] args) {
        // Criando um novo livro
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        // Printando o resultado
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de Publicação: " + livro1.getAnoPublicacao());

        // Emprestando o livro
        livro1.emprestar();

        // Tentando emprestar novamente
        livro1.emprestar();

        // Devolvendo o livro
        livro1.devolver();
    }
}
