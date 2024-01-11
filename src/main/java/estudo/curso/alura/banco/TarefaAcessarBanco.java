package estudo.curso.alura.banco;

public class TarefaAcessarBanco implements Runnable {
    private final PoolDeConexao pool;
    private final GerenciadorDeTransacao tx;

    public TarefaAcessarBanco(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {

        synchronized (pool) {
            System.out.println("peguei a chave do pool");
            pool.getConnection();

            synchronized (tx) {
                System.out.println("começando a gerenciar a transação");
                tx.begin();
            }
        }

    }

}
