import javax.swing.JOptionPane;

public class PrimeorNot {
	


	public static void main(String[] args) {
		
		
		Boolean check= true;
		
		String x =JOptionPane.showInputDialog("Prime Calculator enter a random number");
		
	int x1=	Integer.parseInt(x);
	
	
		
	for(int i=2; i<=x1; i++) {
		
		
		if(i==x1) {
			
			x1=-1;
			
		}
		
	else	if(x1%i==0) {
			
			JOptionPane.showMessageDialog(null, "It's Not Prime");
			
			check= false;
			
		break;
			
		}
		
		
	}
		
		if(check==true) {
			
			JOptionPane.showMessageDialog(null, "It's Prime");
			
		}
		
		
	
			
		
		
	
	
	
	
	
	}
		
		
		
	
	
	
	}
	

