import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Leitura {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "calculando parcelas");
		double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("qual � o valor do produto?"));
		int numParcelas = Integer.parseInt(JOptionPane.showInputDialog("em quantas parcelas?"));
		double valorParcela = valorTotal / numParcelas;
		NumberFormat formato = new DecimalFormat("R$ ####.00");
		JOptionPane.showMessageDialog(null, "o valor de cada parcela �: " + formato.format(valorParcela));
	}
}
