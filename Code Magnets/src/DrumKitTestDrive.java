//Justin Wong
//November 28, 2017
//Code Magnets 

import java.awt.*;

class DrumKitTestDrive {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		d.playSnare();
		d.playTopHat();
		d.Snare = false;
			if(d.Snare == true) {
				d.playSnare();
			}
	
	}
}
