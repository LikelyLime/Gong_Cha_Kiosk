package sheet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//���� ���� �г�
public class Topping extends Panel{
	
	//���콺 �����ʿ��� ����ϱ� ���� ��������� �����.
	Panel no;
	Panel persp;
	Panel milksp;
	Panel cocosp;
	Panel alosp;
	
	//��� �׸��� üũ �Ǿ����� ���� �гη� �Ѿ������ �Ҹ����� �����.
	boolean check = false;
	
	//������ �׸��� ǥ���� ���ڿ��� ���콺�����ʿ��� ���� �޴´�
	String tno = "";
	String tper = "";
	String tmilk = "";
	String tcoco = "";
	String talo = "";
	
	String toppings = "";
	int price = 0;
	
	public Topping() {
		
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 16);
		
		//�� �г��� ����
		no = new Panel();
		no.setLayout(new BorderLayout());
		
		Panel per = new Panel();
		per.setLayout(new BorderLayout());
		
		Panel milkForm = new Panel();
		milkForm.setLayout(new BorderLayout());
		
		Panel coco = new Panel();
		coco.setLayout(new BorderLayout());
		
		Panel alo = new Panel();
		alo.setLayout(new BorderLayout());
		
		ImageIcon noImg = new ImageIcon("./sheetImage/ban.png");
		ImageIcon coImg = new ImageIcon("./sheetImage/coconut.jpg");
		ImageIcon formimg = new ImageIcon("./sheetImage/foam.png");
		ImageIcon perImg = new ImageIcon("./sheetImage/tapioca.jpg");
		ImageIcon aloImg = new ImageIcon("./sheetImage/aloe.jpg");
		
		//�гο� ���� �۾��� �̹����� ����
		JLabel noi = new JLabel(noImg);
		JLabel nos = new JLabel("���þ���");
		nos.setFont(font);
		nos.setHorizontalAlignment(JLabel.CENTER);
		
		//�Ʒ��� ���� �۾��� �ΰ��� �۾� �г��� �ϳ� �� ����
		JLabel peri = new JLabel(perImg);
		JLabel pers = new JLabel("��(�߰�)");
		JLabel perp = new JLabel("(500��)");
		pers.setFont(font);
		pers.setHorizontalAlignment(JLabel.CENTER);
		perp.setFont(font);
		perp.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel milkFormi = new JLabel(formimg);
		JLabel milkForms = new JLabel("��ũ��");
		JLabel milkFormp = new JLabel("(500��)");
		milkForms.setFont(font);
		milkForms.setHorizontalAlignment(JLabel.CENTER);
		milkFormp.setFont(font);
		milkFormp.setHorizontalAlignment(JLabel.CENTER);

		JLabel cocoi = new JLabel(coImg);
		JLabel cocos = new JLabel("���ڳ�");
		JLabel cocop = new JLabel("(500��)");
		cocos.setFont(font);
		cocos.setHorizontalAlignment(JLabel.CENTER);
		cocop.setFont(font);
		cocop.setHorizontalAlignment(JLabel.CENTER);

		JLabel aloi = new JLabel(aloImg);
		JLabel alos = new JLabel("�˷ο�");
		JLabel alop = new JLabel("(500��)");
		alos.setFont(font);
		alos.setHorizontalAlignment(JLabel.CENTER);
		alop.setFont(font);
		alop.setHorizontalAlignment(JLabel.CENTER);
		
		//�۾� �ΰ��� ���� �г�
		persp = new Panel();
		persp.setLayout(new BorderLayout());
		persp.add(pers, BorderLayout.CENTER);
		persp.add(perp, BorderLayout.SOUTH);
		
		milksp = new Panel();
		milksp.setLayout(new BorderLayout());
		milksp.add(milkForms, BorderLayout.CENTER);
		milksp.add(milkFormp, BorderLayout.SOUTH);

		cocosp = new Panel();
		cocosp.setLayout(new BorderLayout());
		cocosp.add(cocos, BorderLayout.CENTER);
		cocosp.add(cocop, BorderLayout.SOUTH);

		alosp = new Panel();
		alosp.setLayout(new BorderLayout());
		alosp.add(alos, BorderLayout.CENTER);
		alosp.add(alop, BorderLayout.SOUTH);
				
		
		//�гο� ���콺 ������ �߰�
		no.addMouseListener(new ToppingMouse(0, this));
		per.addMouseListener(new ToppingMouse(1, this));
		milkForm.addMouseListener(new ToppingMouse(2, this));
		coco.addMouseListener(new ToppingMouse(3, this));
		alo.addMouseListener(new ToppingMouse(4, this));
		
		//�гο� �̹����� �۾� �߰�
		no.add(noi, BorderLayout.CENTER);
		no.add(nos, BorderLayout.SOUTH);
		per.add(peri, BorderLayout.CENTER);
		per.add(persp, BorderLayout.SOUTH);
		milkForm.add(milkFormi, BorderLayout.CENTER);
		milkForm.add(milksp, BorderLayout.SOUTH);
		coco.add(cocoi, BorderLayout.CENTER);
		coco.add(cocosp, BorderLayout.SOUTH);
		alo.add(aloi, BorderLayout.CENTER);
		alo.add(alosp, BorderLayout.SOUTH);

		//���� �гο� ��ư �г� �߰�
		this.setBounds(0, 580, 595, 150);
		this.add(no);
		this.add(per);
		this.add(milkForm);
		this.add(coco);
		this.add(alo);
		
	}

}
