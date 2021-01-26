package page;

import java.awt.Frame;
import java.util.List;

import run.ResetThread;

public class ThreadM {
	
	public ThreadM(Frame f, List list) {
		
		list.removeAll(list);
		
		ThreadP p = new ThreadP(f, list);
		p.start();
		
	}
	
	

}
