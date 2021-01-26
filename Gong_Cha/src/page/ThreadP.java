package page;

import java.awt.Frame;
import java.util.List;

import run.ResetThread;

public class ThreadP extends Thread{
	
	Frame f;
	List list;
	
	public ThreadP(Frame f, List list) {
		this.f = f;
		this.list = list;
	}
	
	@Override
	public void run() {
		int n =1;
		

		Page1 p1 = new Page1(f, list);
		Page2 p2 = new Page2(f, list);
		Page3 p3 = new Page3(f, list);
		
		while(p1.stop&&p2.stop&&p3.stop) {
			ResetThread.reset();
			try {
				f.removeAll();
				
				switch (n) {
				case 1:
					p1 = new Page1(f, list);
					n =2;
					break;
				case 2:
					p2 = new Page2(f, list);
					n =3;
					break;
				case 3:
					p3 = new Page3(f, list);
					n =1;
					break;
				}
				Thread.sleep(2000);
								
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			
		}
	}
	
}
