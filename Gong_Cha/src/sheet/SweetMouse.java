package sheet;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import run.ResetThread;

public class SweetMouse extends MouseAdapter{
	
	int n;
	Sweet sw;
	
	public SweetMouse(int n, Sweet sw) {
		this.n = n;
		this.sw = sw;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		ResetThread.reset();
		sw.check = true;
		sw.s50.setBackground(null);
		sw.s100.setBackground(null);
		sw.s70.setBackground(null);
		sw.s30.setBackground(null);
		switch (n) {
		case 1:
			sw.s50.setBackground(Color.green);
			sw.sweets = "�絵(50%)";
			break;
		case 2:
			sw.s100.setBackground(Color.green);
			sw.sweets = "�絵(100%)";
			break;
		case 3:
			sw.s70.setBackground(Color.green);
			sw.sweets = "�絵(70%)";
			break;
		case 4:
			sw.s30.setBackground(Color.green);
			sw.sweets = "�絵(30%)";
			break;
		}
	}

}
