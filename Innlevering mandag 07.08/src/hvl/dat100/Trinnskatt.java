package hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {
	public static void main(String[] args) {
		int inntekt= Integer.parseInt(showInputDialog("Inntekten"));
		int skatt = 0;
		
		if (inntekt >= 934051) {
			skatt += (inntekt - 934051) * 0.1452;
			inntekt = 934051;
		}
		if (inntekt >= 580651) {
			skatt +=(inntekt - 580651) * 0.1152;
			inntekt = 580651;
		}
		if (inntekt >= 230951) {
			skatt += (inntekt - 230951) * 0.0241;
			inntekt = 230951;			
		}
		if (inntekt >= 164101) {
			skatt +=(inntekt - 164102) * 0.0093;
			inntekt = 164101;
		}
		showMessageDialog(null,"Inntekten:"+ skatt);
	}
	
}
