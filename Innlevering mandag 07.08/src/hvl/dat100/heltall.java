package hvl.dat100;

import javax.swing.JOptionPane;

public class heltall {
	public static void main(String[] args) {
		while(true) {
			int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall: "));
			for(int i = tall;i>=2;i--) {
				tall=tall*(i-1);
			}
			System.out.println(tall);
		}
	}

}
