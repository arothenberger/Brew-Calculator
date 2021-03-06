import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Starting_Point
{
	public static void main(String[] args)
	{
		/*  Declaring double and string variables */
		/*  Creating a decimal format to show ABV correctly */
		double ogCount, fgCount, abvCount;
		String ogString, fgString;
		DecimalFormat twoDigits = new DecimalFormat("0.0");
			
		/*  Input to get original gravity
			Taking the input and storing it for use */		
		ogString = JOptionPane.showInputDialog("Enter the Original Gravity");
		ogCount = Double.parseDouble(ogString);
		
		/*	Checks to make sure that the original gravity number is in range */
		if(ogCount > 9.999 || ogCount < 0.001) {
			JOptionPane.showMessageDialog(null, "Please enter in a valid original gravity reading, format as #.###");
			System.exit(0); }
		
		/*  Input to get final gravity
			Taking the input and storing it for use */
		fgString = JOptionPane.showInputDialog("Enter in the Final Gravity");
		fgCount = Double.parseDouble(fgString);
		
		/*	Checks to make sure that the final gravity number is in range */
		if(fgCount > 9.999 || fgCount < 0.001) {
			JOptionPane.showMessageDialog(null, "Please enter in a valid final gravity reading, format as #.###");
			System.exit(0); }
		
		/*	Checks to make sure that the final gravity is not greater than the original gravity */
		if(fgCount > ogCount){
			JOptionPane.showMessageDialog(null, "Your final gravity has to be lower than your original gravity, format as #.###"); 
			System.exit(0); }
		
		/*  Calculates the overall ABV */
		abvCount = (ogCount - fgCount) * 131;
		
		/* 	Output showing the ABV as */
		JOptionPane.showMessageDialog(null, "The percentage of alcohol by volume is " + twoDigits.format(abvCount));
		
		/* 	Exit the application */
		System.exit(0);
		
		
		
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
		
	}
}
