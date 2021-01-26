package sheet;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import run.ResetThread;

public class ToppingMouse extends MouseAdapter {
	
	int n;
	Topping tp;
	
	public ToppingMouse(int n, Topping tp) {
		this.n = n;
		this.tp = tp;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		ResetThread.reset();
		
		tp.no.setBackground(null);
		if(tp.tno.equals("���� ���� ")) {
			tp.tno = "";
		}
		switch (n) {
		case 0:
			tp.check = true;
			tp.persp.setBackground(null);
			tp.milksp.setBackground(null);
			tp.cocosp.setBackground(null);
			tp.alosp.setBackground(null);
			tp.no.setBackground(Color.green);
			tp.tno = "���� ���� ";
			tp.tper = "";
			tp.tmilk = "";
			tp.tcoco = "";
			tp.talo = "";
			tp.price = 0;
			break;
		case 1:
			if(!tp.persp.isBackgroundSet()) {
				tp.check = true;
				tp.persp.setBackground(Color.green);
				tp.tper = "��(�߰�) ";
				tp.price += 500;
			}else {
				tp.persp.setBackground(null);
				if(!tp.persp.isBackgroundSet()&&!tp.milksp.isBackgroundSet()&&!tp.cocosp.isBackgroundSet()
						&&!tp.alosp.isBackgroundSet()) {
					tp.check = false;
				}
				tp.tper = "";
				tp.price -= 500;
			}
			break;
		case 2:
			if(!tp.milksp.isBackgroundSet()) {
				tp.check = true;
				tp.milksp.setBackground(Color.green);
				tp.tmilk = "��ũ�� ";
				tp.price += 500;
			}else {
				tp.milksp.setBackground(null);
				if(!tp.persp.isBackgroundSet()&&!tp.milksp.isBackgroundSet()&&!tp.cocosp.isBackgroundSet()
						&&!tp.alosp.isBackgroundSet()) {
					tp.check = false;
				}
				tp.tmilk = "";
				tp.price -= 500;
			}
			
			break;
		case 3:
			if(!tp.cocosp.isBackgroundSet()) {
				tp.check = true;
				tp.cocosp.setBackground(Color.green);
				tp.tcoco = "���ڳ� ";
				tp.price += 500;
			}else {
				tp.cocosp.setBackground(null);
				if(!tp.persp.isBackgroundSet()&&!tp.milksp.isBackgroundSet()&&!tp.cocosp.isBackgroundSet()
						&&!tp.alosp.isBackgroundSet()) {
					tp.check = false;
				}
				tp.tcoco = "";
				tp.price -= 500;
			}
			
			break;
		case 4:
			if(!tp.alosp.isBackgroundSet()) {
				tp.check = true;
				tp.alosp.setBackground(Color.green);
				tp.talo = "�˷ο� ";
				tp.price += 500;
			}else {
				tp.alosp.setBackground(null);
				if(!tp.persp.isBackgroundSet()&&!tp.milksp.isBackgroundSet()&&!tp.cocosp.isBackgroundSet()
						&&!tp.alosp.isBackgroundSet()) {
					tp.check = false;
				}
				tp.talo = "";
				tp.price -= 500;
			}
			
			break;
		}
		tp.toppings = tp.tno+tp.tper+tp.tmilk+tp.tcoco+tp.talo;
	}

}
