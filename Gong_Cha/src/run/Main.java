package run;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import page.ThreadM;

public class Main {
	
	public static void main(String[] args) {
		
		List<Products> list = new ArrayList<Products>();
		
		Frame f = new Frame();
		f.setTitle("gong cha");
		f.setBounds(500, 50, 595, 842);
		f.setLayout(null);

		ResetThread rt = new ResetThread(f, list);
		rt.setDaemon(true);
		rt.start();
		
		new ThreadM(f, list);
		
		f.setResizable(false);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
	}

}
