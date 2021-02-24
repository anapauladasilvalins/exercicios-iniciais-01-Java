package resolucao.tela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
	public static void main(String[] args) {
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();	
		int larg = (int) tela.getWidth(); 
		int alt = (int) tela.getHeight();
		System.out.println("A resolução desta tela é " + larg + " X " + alt);
	}

}
