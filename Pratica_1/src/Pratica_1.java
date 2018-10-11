

import java.awt.Rectangle;

import ij.IJ;
import ij.plugin.PlugIn;
import ij.ImagePlus;
import ij.process.ImageProcessor;
import ij.gui.Roi;


public class Pratica_1  implements PlugIn {
	public void run(String arg) {
		ImagePlus imp;
		ImageProcessor processor; 
		
		imp = IJ.getImage();
		processor = imp.getProcessor();
		processor.invert();
		imp.updateAndDraw();
		IJ.wait(500);
		processor.invert();
		imp.updateAndDraw();
	}
}




//public class Pratica_1  implements PlugIn {
//	public void run(String arg) {
//		IJ.showMessage("My_Plugin","Hello world!!!!");
//	}
//}