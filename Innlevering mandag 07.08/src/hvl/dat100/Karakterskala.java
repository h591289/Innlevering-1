package hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakterskala {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
		    int poeng = Integer.parseInt(showInputDialog("Din poengsum " ));
	        char karakter = ' ';
	    if(poeng <= 100 && poeng >= 90) {
	       karakter ='A';
	       showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
			}
	    else if(poeng <= 89 && poeng >= 80) {
	    	karakter = 'B';
	    	showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
	    	
	    }
	    else if(poeng <= 79 && poeng >= 60) {
	    	karakter = 'C';
	    	showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
	    	
			}
	    else if(poeng <= 59 && poeng >= 50) {
	    	karakter = 'D';
	    	showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
	    	
		}
	    else if(poeng <= 49 && poeng >= 40) {
	    	karakter = 'E';
	    	showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
	    	
		}
	    else if(poeng <= 39 && poeng >= 0) {
	    	karakter = 'F';
	    	showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
	    	
		}
	    else if (poeng >= 100 || poeng < 0) {
	    	showMessageDialog(null, "feilmelding; ugyldig poengsum");
	    	
	    	
	    	
	    }
		}
			
		}
	}
