import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Starting_Point
{
	public static void main(String[] args)
	{
		/*  Setting double variables */
		double ogCount, fgCount, abvCount;

		/*  Setting string variables */
		String ogString, fgString;
		
		/*  Creating a decimal format to show ABV correctly */
		DecimalFormat threeDigits = new DecimalFormat("0.00");
		
		/*  Input to get original gravity, has to be in format of 0.000
			Taking the input and storing it for use */		
		ogString = JOptionPane.showInputDialog("Enter the Original Gravity");
		ogCount = Double.parseDouble(ogString);
		
		/*  Input to get final gravity, has to be in format of 0.000
			Taking the input and storing it for use */
		fgString =	JOptionPane.showInputDialog("Enter in the Final Gravity");
		fgCount = Double.parseDouble(fgString);
		
		/*  Calculates the overall ABV */
		abvCount = (ogCount - fgCount) * 131;
		
		/* 	Output showing the ABV */
		JOptionPane.showMessageDialog(null, "The percentage of alcohol by volume is " + threeDigits.format(abvCount));
		
		/*
		 * Calculating Degrees Plato, work in progress *
		
		double originalGravityCount2, originalGravityCount3, finalGravityCountCount2, 
		finalGravityCountCount3, startingPlato, finishingPlato, abvPlato, abvPlato2;
		
		DecimalFormat twoDigits = new DecimalFormat("0.0");
		
		originalGravityCount2 = Math.pow(originalGravityCount, 2);
		originalGravityCount3 = Math.pow(originalGravityCount, 3);
		
		finalGravityCountCount2 = Math.pow(finalGravityCountCount, 2);
		finalGravityCountCount3 = Math.pow(finalGravityCountCount, 3);
		
		startingPlato = (-1 * 616.868) + (1111.14 * originalGravityCount) - (630.272 * originalGravityCount2) + (135.997 * originalGravityCount3);
		finishingPlato = (-1 * 616.868) + (1111.14 * finalGravityCountCount) - (630.272 * finalGravityCountCount2) + (135.997 * finalGravityCountCount3);
		
		abvPlato = startingPlato  - finishingPlato;
		abvPlato2 = abvPlato * .516;
		
		JOptionPane.showMessageDialog(null, "Plato is " + threeDigits.format(abvPlato2));
		
		*/
		
		System.exit(0);
	}
}
