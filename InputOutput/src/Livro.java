import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Livro extends Exercicio {
	public void exibirDados() {
		this.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("digite o c�digo do livro")));
		this.setDescricao(JOptionPane.showInputDialog("descri��o"));
		this.setPreco(Double.parseDouble(JOptionPane.showInputDialog("valor")));
		NumberFormat formato = new DecimalFormat("R$ ###.00");
		JOptionPane.showMessageDialog(null, "C�digo do livro: " + getCodigo()+ "\nDescri��o: " + getDescricao()+ "\nPre�o: " +formato.format(getPreco()));
	}
}
