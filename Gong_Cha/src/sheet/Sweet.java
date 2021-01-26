package sheet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//�絵 ���� �г�
public class Sweet extends Panel{
	
	//���콺 �����ʿ��� ����ϱ� ���� ��������� �����.
	Panel s50;
	Panel s100;
	Panel s70;
	Panel s30;
	
	//��� �׸��� üũ �Ǿ����� ���� �гη� �Ѿ������ �Ҹ����� �����.
	boolean check = false;
	
	//������ �׸��� ǥ���� ���ڿ� ���콺�����ʿ��� ���� �޴´�
	String sweets = "";
	
		public Sweet() {

			Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 16);
			
			//�� �̹����� ���� �г� ����
			s50 = new Panel();
			s50.setLayout(new BorderLayout());

			s100 = new Panel();
			s100.setLayout(new BorderLayout());

			s70 = new Panel();
			s70.setLayout(new BorderLayout());

			s30 = new Panel();
			s30.setLayout(new BorderLayout());
			
			ImageIcon simg30 = new ImageIcon("./sheetImage/su30.jpg");
			ImageIcon simg50 = new ImageIcon("./sheetImage/su50.jpg");
			ImageIcon simg70 = new ImageIcon("./sheetImage/su70.jpg");
			ImageIcon simg100 = new ImageIcon("./sheetImage/su100.jpg");
			
			//�� �гο� ���� �̹����� �۾� ����
			JLabel s30i = new JLabel(simg30);
			JLabel s30s = new JLabel("�絵 30%");
			s30s.setFont(font);
			s30s.setHorizontalAlignment(JLabel.CENTER);
			
			JLabel s50i = new JLabel(simg50);
			JLabel s50s = new JLabel("�絵 50%");
			s50s.setFont(font);
			s50s.setHorizontalAlignment(JLabel.CENTER);

			JLabel s70i = new JLabel(simg70);
			JLabel s70s = new JLabel("�絵 70%");
			s70s.setFont(font);
			s70s.setHorizontalAlignment(JLabel.CENTER);

			JLabel s100i = new JLabel(simg100);
			JLabel s100s = new JLabel("�絵 100%");
			s100s.setFont(font);
			s100s.setHorizontalAlignment(JLabel.CENTER);
			
			//�� �гο� ���콺 ������ �߰�
			s50.addMouseListener(new SweetMouse(1, this));
			s100.addMouseListener(new SweetMouse(2, this));
			s70.addMouseListener(new SweetMouse(3, this));
			s30.addMouseListener(new SweetMouse(4, this));
			
			//�� �гο� �̹����� �۾� �߰�
			s50.add(s50i, BorderLayout.CENTER);
			s50.add(s50s, BorderLayout.SOUTH);
			s100.add(s100i, BorderLayout.CENTER);
			s100.add(s100s, BorderLayout.SOUTH);
			s70.add(s70i, BorderLayout.CENTER);
			s70.add(s70s, BorderLayout.SOUTH);
			s30.add(s30i, BorderLayout.CENTER);
			s30.add(s30s, BorderLayout.SOUTH);

			//���� �гο� ��ư �г� �߰�
			this.setBounds(0, 420, 595, 130);
			this.add(s30);
			this.add(s50);
			this.add(s70);
			this.add(s100);
			
		}

}
