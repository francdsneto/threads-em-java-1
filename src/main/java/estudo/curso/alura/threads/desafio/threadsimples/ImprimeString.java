package estudo.curso.alura.threads.desafio.threadsimples;

public class ImprimeString {

    public static void main(String[] args) {

        Thread threadSimples = new Thread(() -> System.out.println("Imprimindo string a partir de uma Thread"));

        threadSimples.start();

    }

}
