package sheet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//hot/cold ���� �г�
public class HotCold extends Panel{
	
	//���콺 �����ʿ��� ����ϱ� ���� ��������� �����.
	Panel cp;
	Panel cm;
	Panel hp;
	Panel hm;
	
	//��� �׸��� üũ �Ǿ����� ���� �гη� �Ѿ������ �Ҹ����� �����.
	boolean check = false;
	
	//������ �׸��� ǥ���� ���ڿ� ���콺�����ʿ��� ���� �޴´�
	String hotColds = "";
	
	//������ ���ð� �̾������ϱ� ���ؼ� ������ �г��� �Ķ���ͷ� �޴´�.
	public HotCold(Ice i) {
		

		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 16);
		
		//�� �̹����� ���� �г� ����
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
		
		//�� �гο� ���� �̹����� �۾� ����
		JLabel cpi = new JLabel(iimg);
		JLabel cps = new JLabel("COLD(����)");
		cps.setFont(font);
		cps.setHorizontalAlignment(JLabel.CENTER);

		JLabel cmi = new JLabel(iimg);
		JLabel cms = new JLabel("COLD(����)");
		cms.setFont(font);
		cms.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel hpi = new JLabel(himg);
		JLabel hps = new JLabel("HOT(����)");
		hps.setFont(font);
		hps.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel hmi = new JLabel(himg);
		JLabel hms = new JLabel("HOT(����)");
		hms.setFont(font);
		hms.setHorizontalAlignment(JLabel.CENTER);
		
		//hot�϶� ������ ������ �� ���� ice���콺 �����ʸ� �����
		MouseListener rim = new IceMouse(1, i);
		MouseListener fim = new IceMouse(2, i);
		MouseListener lim = new IceMouse(3, i);
		
		
		//�� �гο� ���콺 ������ �߰�
		cp.addMouseListener(new HotColdMouse(1, this, i, rim, fim, lim));
		cm.addMouseListener(new HotColdMouse(2, this, i, rim, fim, lim));
		hp.addMouseListener(new HotColdMouse(3, this, i, rim, fim, lim));
		hm.addMouseListener(new HotColdMouse(4, this, i, rim, fim, lim));
		
		//�� �гο� �̹����� �۾� �߰�
		cp.add(cpi, BorderLayout.CENTER);
		cp.add(cps, BorderLayout.SOUTH);
		cm.add(cmi, BorderLayout.CENTER);
		cm.add(cms, BorderLayout.SOUTH);
		hp.add(hpi, BorderLayout.CENTER);
		hp.add(hps, BorderLayout.SOUTH);
		hm.add(hmi, BorderLayout.CENTER);
		hm.add(hms, BorderLayout.SOUTH);
		
		//���� �гο� ��ư �г� �߰�
		this.setBounds(0, 100, 595, 130);
		this.add(cp);
		this.add(cm);
		this.add(hp);
		this.add(hm);
		
	}

}
