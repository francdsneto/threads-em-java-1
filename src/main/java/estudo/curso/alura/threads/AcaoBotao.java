
package estudo.curso.alura.threads;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoBotao implements ActionListener {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;

	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	/**
	 * Calculo de multiplicação propositalmente ineficiente para teste de threads
	 * @param e the event to be processed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		TarefaMultiplicacao tarefaRunnable = new TarefaMultiplicacao(primeiro,segundo,resultado);
		Thread threadCalculo = new Thread(tarefaRunnable,"Thread Calculadora");

		threadCalculo.start();

	}

}