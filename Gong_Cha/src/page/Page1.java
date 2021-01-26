package page;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import category.PageMilk1;
import run.ResetThread;
import sheet.Sheet;

public class Page1 extends Panel {
	
	boolean stop = true;
	
	public Page1(Frame f, List list) {
		this.setBounds(0, 0, 595, 842);
		
		
		ImageIcon img = new ImageIcon("./pageImage/gongMain.jpg");
		JLabel ji = new JLabel(img);
		
		ji.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				ResetThread.reset();
				f.removeAll();
				stop = false;
				new PageMilk1(f, list);
			}
		});
		
		this.add(ji);
		f.add(this);
		f.setVisible(true);
		
		
	}
	

}
