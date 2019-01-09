/* This is the client code for Code Magnets
 * @author Celeste Liu
 * @version January 9, 2019
 */
public class DrumKitTestDrive {
	public static void main(String[]args) {
		DrumKit d = new DrumKit();
		
		d.playSnare();
		d.playTopHat();
		
		d.snare = false;
		if (d.snare == true) {
			d.playSnare();
		}
	}
}
