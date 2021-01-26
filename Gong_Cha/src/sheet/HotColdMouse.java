package sheet;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import run.ResetThread;

public class HotColdMouse extends MouseAdapter {
	
	int n;
	HotCold hc;
	Ice i;
	
	static boolean isl = false;
	
	MouseListener rim;
	MouseListener fim;
	MouseListener lim;
	
	public static void islF() {
		isl = false;
	}
	
	public HotColdMouse(int n, HotCold hc, Ice i,
			MouseListener rim, MouseListener fim, MouseListener lim) {
		this.n = n;
		this.hc = hc;
		this.i = i;
		this.rim = rim;
		this.fim = fim;
		this.lim = lim;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		ResetThread.reset();
		hc.check = true;
		hc.cp.setBackground(null);
		hc.cm.setBackground(null);
		hc.hp.setBackground(null);
		hc.hm.setBackground(null);
		switch (n) {
		//ice를 선택하면 얼음양 버튼의 색깔을 다 빼고 마우스 리스너를 넣어준다
		case 1:
			i.ri.setBackground(null);
			i.li.setBackground(null);
			i.fi.setBackground(null);
			if(!isl) {
				isl = true;
				i.ri.addMouseListener(rim);
				i.li.addMouseListener(lim);
				i.fi.addMouseListener(fim);
			}
			i.check = false;
			hc.cp.setBackground(Color.green);
			hc.hotColds = "COLD(포장)";
			break;
		case 2:
			i.ri.setBackground(null);
			i.li.setBackground(null);
			i.fi.setBackground(null);
			if(!isl) {
				isl = true;
				i.ri.addMouseListener(rim);
				i.li.addMouseListener(lim);
				i.fi.addMouseListener(fim);
			}
			i.check = false;
			hc.cm.setBackground(Color.green);
			hc.hotColds = "COLD(매장)";
			break;
		//hot을 선택하면 얼음양 버튼의 색깔을 다 빨간색으로 바꾸고 마우스리스너를 뺀다
		case 3:
			isl = false;
			i.ri.setBackground(Color.red);
			i.li.setBackground(Color.red);
			i.fi.setBackground(Color.red);
			i.ri.removeMouseListener(rim);
			i.li.removeMouseListener(lim);
			i.fi.removeMouseListener(fim);
			i.check = true;
			i.ices = "";
			hc.hp.setBackground(Color.green);
			hc.hotColds = "HOT(포장)";
			break;
		case 4:
			isl = false;
			i.ri.setBackground(Color.red);
			i.li.setBackground(Color.red);
			i.fi.setBackground(Color.red);
			i.ri.removeMouseListener(rim);
			i.li.removeMouseListener(lim);
			i.fi.removeMouseListener(fim);
			i.check = true;
			i.ices = "";
			hc.hm.setBackground(Color.green);
			hc.hotColds = "HOT(매장)";
			break;
		}
	}

}
