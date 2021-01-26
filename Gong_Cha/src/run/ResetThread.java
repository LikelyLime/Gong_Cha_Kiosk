package run;

import java.awt.Frame;
import java.util.List;

import page.ThreadM;
import page.ThreadP;

public class ResetThread extends Thread {
	
	static int n = 0;
	
	Frame f;
	List list;
	static boolean stop = false;
	
	public ResetThread(Frame f, List list) {
		this.f = f;
		this.list = list;
	}
	
	public static void reset() {
		n = 0;
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			n++;
			if(n>=10) {
				n = 0;
				new ThreadM(f, list);
			}
			
		}
		
	}

}
