import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Starting_Point
{

	public static void main(String[] args)
	{
		DecimalFormat threeDigits = new DecimalFormat("0.00");
		DecimalFormat twoDigits = new DecimalFormat("0.0");
		
		String OGString = JOptionPane.showInputDialog("Enter the Original Gravity");
		double originalGravityCount = Double.parseDouble(OGString);
		
		String FGString =	JOptionPane.showInputDialog("Enter in the Final Gravity");
		double finalGravityCountCount = Double.parseDouble(FGString);
		
		double alcoholByVolumeCount = (originalGravityCount - finalGravityCountCount) * 131;
		
		double originalGravityCount2 = Math.pow(originalGravityCount, 2);
		double originalGravityCount3 = Math.pow(originalGravityCount, 3);
		
		double finalGravityCountCount2 = Math.pow(finalGravityCountCount, 2);
		double finalGravityCountCount3 = Math.pow(finalGravityCountCount, 3);
		
		double startingPlato = (-1 * 616.868) + (1111.14 * originalGravityCount) - (630.272 * originalGravityCount2) + (135.997 * originalGravityCount3);
		double finishingPlato = (-1 * 616.868) + (1111.14 * finalGravityCountCount) - (630.272 * finalGravityCountCount2) + (135.997 * finalGravityCountCount3);
		
		double abvPlato = startingPlato  - finishingPlato;
		double abvPlato2 = abvPlato * .516;
				
		JOptionPane.showMessageDialog(null, "The Percentage of Alcohol by Volume is " + threeDigits.format(alcoholByVolumeCount));
		JOptionPane.showMessageDialog(null, "Plato is " + threeDigits.format(abvPlato2));
		
		System.exit(0);
	}
}
