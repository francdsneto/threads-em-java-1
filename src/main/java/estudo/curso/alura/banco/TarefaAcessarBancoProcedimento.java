package estudo.curso.alura.banco;

public class TarefaAcessarBancoProcedimento implements Runnable {
    private final PoolDeConexao pool;
    private final GerenciadorDeTransacao tx;

    public TarefaAcessarBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {

        synchronized (pool) {
            System.out.println("peguei a conexão");
            pool.getConnection();

            synchronized (tx) {
                System.out.println("começando a tx");
                tx.begin();
            }
        }

    }
}
