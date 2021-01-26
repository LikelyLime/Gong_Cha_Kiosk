package sheet;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import run.ResetThread;

public class IceMouse extends MouseAdapter {
	
	int n;
	Ice ice;
	
	public IceMouse(int n, Ice ice) {
		this.n = n;
		this.ice = ice;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		ResetThread.reset();
		ice.check = true;
		ice.ri.setBackground(null);
		ice.fi.setBackground(null);
		ice.li.setBackground(null);
		switch (n) {
		case 1:
			ice.ri.setBackground(Color.green);
			ice.ices = "R Ice";
			break;
		case 2:
			ice.fi.setBackground(Color.green);
			ice.ices = "F Ice";
			break;
		case 3:
			ice.li.setBackground(Color.green);
			ice.ices = "L Ice";
			break;
		}
	}

}
