import javax.swing.JOptionPane;

public class PrimeorNot {

	public static void main(String[] args) {
		
		
		
		
		String x =JOptionPane.showInputDialog("Prime Calculator enter a random number");
		
	int x1=	Integer.parseInt(x);
	
	
		
	for(int i=0; i<x1-1; i++) {
		
		
		if(i%x1==0) {
			
			JOptionPane.showMessageDialog(null, "It's Prime");
			
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Not Prime");
			
		}
		
	}
		
		
		
	}
	
}
