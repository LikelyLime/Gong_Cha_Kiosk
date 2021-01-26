package sheet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//hot/cold 선택 패널
public class HotCold extends Panel{
	
	//마우스 리스너에서 사용하기 위해 멤버값으로 만든다.
	Panel cp;
	Panel cm;
	Panel hp;
	Panel hm;
	
	//모든 항목이 체크 되었을때 다음 패널로 넘어가기위해 불린값을 만든다.
	boolean check = false;
	
	//선택한 항목을 표시할 문자열 마우스리스너에서 값을 받는다
	String hotColds = "";
	
	//얼음양 선택과 이어지게하기 위해서 얼음양 패널을 파라미터로 받는다.
	public HotCold(Ice i) {
		

		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 16);
		
		//각 이미지를 담을 패널 생성
		cp = new Panel();
		cp.setLayout(new BorderLayout());
		
		cm = new Panel();
		cm.setLayout(new BorderLayout());
		
		hp = new Panel();
		hp.setLayout(new BorderLayout());
		
		hm = new Panel();
		hm.setLayout(new BorderLayout());
		
		ImageIcon iimg = new ImageIcon("./sheetImage/ice.jpg");
		//ImageIcon iimgc = new ImageIcon("./sheetImage/coldcup.png");
		ImageIcon himg = new ImageIcon("./sheetImage/hot.jpg");
		//ImageIcon himgc = new ImageIcon("./sheetImage/hotcup.png");
		
		//각 패널에 넣을 이미지와 글씨 생성
		JLabel cpi = new JLabel(iimg);
		JLabel cps = new JLabel("COLD(포장)");
		cps.setFont(font);
		cps.setHorizontalAlignment(JLabel.CENTER);

		JLabel cmi = new JLabel(iimg);
		JLabel cms = new JLabel("COLD(매장)");
		cms.setFont(font);
		cms.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel hpi = new JLabel(himg);
		JLabel hps = new JLabel("HOT(포장)");
		hps.setFont(font);
		hps.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel hmi = new JLabel(himg);
		JLabel hms = new JLabel("HOT(매장)");
		hms.setFont(font);
		hms.setHorizontalAlignment(JLabel.CENTER);
		
		//hot일때 얼음을 선택할 수 없게 ice마우스 리스너를 만든다
		MouseListener rim = new IceMouse(1, i);
		MouseListener fim = new IceMouse(2, i);
		MouseListener lim = new IceMouse(3, i);
		
		
		//각 패널에 마우스 리스너 추가
		cp.addMouseListener(new HotColdMouse(1, this, i, rim, fim, lim));
		cm.addMouseListener(new HotColdMouse(2, this, i, rim, fim, lim));
		hp.addMouseListener(new HotColdMouse(3, this, i, rim, fim, lim));
		hm.addMouseListener(new HotColdMouse(4, this, i, rim, fim, lim));
		
		//각 패널에 이미지와 글씨 추가
		cp.add(cpi, BorderLayout.CENTER);
		cp.add(cps, BorderLayout.SOUTH);
		cm.add(cmi, BorderLayout.CENTER);
		cm.add(cms, BorderLayout.SOUTH);
		hp.add(hpi, BorderLayout.CENTER);
		hp.add(hps, BorderLayout.SOUTH);
		hm.add(hmi, BorderLayout.CENTER);
		hm.add(hms, BorderLayout.SOUTH);
		
		//선택 패널에 버튼 패널 추가
		this.setBounds(0, 100, 595, 130);
		this.add(cp);
		this.add(cm);
		this.add(hp);
		this.add(hm);
		
	}

}
