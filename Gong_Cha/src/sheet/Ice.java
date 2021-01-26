package sheet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//������ ���� �г�
public class Ice extends Panel{
	
	//���콺 �����ʿ��� ����ϱ� ���� ��������� �����.
	Panel ri;
	Panel fi;
	Panel li;
	
	//��� �׸��� üũ �Ǿ����� ���� �гη� �Ѿ������ �Ҹ����� �����.
	boolean check = false;
	
	//������ �׸��� ǥ���� ���ڿ� ���콺�����ʿ��� ���� �޴´�
	String ices = "";
	
	public Ice() {
		
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 16);
		
		//�� �̹����� ���� �г� ����
		ri = new Panel();
		ri.setLayout(new BorderLayout());

		fi = new Panel();
		fi.setLayout(new BorderLayout());

		li = new Panel();
		li.setLayout(new BorderLayout());
		
		ImageIcon rImg = new ImageIcon("./sheetImage/ice70.png");
		ImageIcon fImg = new ImageIcon("./sheetImage/ice100.png");
		ImageIcon lImg = new ImageIcon("./sheetImage/ice30.png");
		
		//�� �гο� ���� �̹����� �۾� ����
		JLabel rii = new JLabel(rImg);
		JLabel ris = new JLabel("Regular Ice");
		ris.setFont(font);
		ris.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel fii = new JLabel(fImg);
		JLabel fis = new JLabel("Full Ice");
		fis.setFont(font);
		fis.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel lii = new JLabel(lImg);
		JLabel lis = new JLabel("Less Ice");
		lis.setFont(font);
		lis.setHorizontalAlignment(JLabel.CENTER);

		//�� �гο� �̹����� �۾� �߰�
		ri.add(rii, BorderLayout.CENTER);
		ri.add(ris, BorderLayout.SOUTH);
		fi.add(fii, BorderLayout.CENTER);
		fi.add(fis, BorderLayout.SOUTH);
		li.add(lii, BorderLayout.CENTER);
		li.add(lis, BorderLayout.SOUTH);
		
		//���� �гο� ��ư �г� �߰�		
		this.setBounds(0, 260, 595, 130);
		this.add(li);
		this.add(ri);
		this.add(fi);
	}

}
