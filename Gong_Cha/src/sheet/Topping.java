package sheet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//토핑 선택 패널
public class Topping extends Panel{
	
	//마우스 리스너에서 사용하기 위해 멤버값으로 만든다.
	Panel no;
	Panel persp;
	Panel milksp;
	Panel cocosp;
	Panel alosp;
	
	//모든 항목이 체크 되었을때 다음 패널로 넘어가기위해 불린값을 만든다.
	boolean check = false;
	
	//선택한 항목을 표시할 문자열을 마우스리스너에서 값을 받는다
	String tno = "";
	String tper = "";
	String tmilk = "";
	String tcoco = "";
	String talo = "";
	
	String toppings = "";
	int price = 0;
	
	public Topping() {
		
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 16);
		
		//각 패널을 생성
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
		
		//패널에 넣을 글씨와 이미지를 생성
		JLabel noi = new JLabel(noImg);
		JLabel nos = new JLabel("선택안함");
		nos.setFont(font);
		nos.setHorizontalAlignment(JLabel.CENTER);
		
		//아래에 넣을 글씨가 두개라 글씨 패널을 하나 더 생성
		JLabel peri = new JLabel(perImg);
		JLabel pers = new JLabel("펄(추가)");
		JLabel perp = new JLabel("(500원)");
		pers.setFont(font);
		pers.setHorizontalAlignment(JLabel.CENTER);
		perp.setFont(font);
		perp.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel milkFormi = new JLabel(formimg);
		JLabel milkForms = new JLabel("밀크폼");
		JLabel milkFormp = new JLabel("(500원)");
		milkForms.setFont(font);
		milkForms.setHorizontalAlignment(JLabel.CENTER);
		milkFormp.setFont(font);
		milkFormp.setHorizontalAlignment(JLabel.CENTER);

		JLabel cocoi = new JLabel(coImg);
		JLabel cocos = new JLabel("코코넛");
		JLabel cocop = new JLabel("(500원)");
		cocos.setFont(font);
		cocos.setHorizontalAlignment(JLabel.CENTER);
		cocop.setFont(font);
		cocop.setHorizontalAlignment(JLabel.CENTER);

		JLabel aloi = new JLabel(aloImg);
		JLabel alos = new JLabel("알로에");
		JLabel alop = new JLabel("(500원)");
		alos.setFont(font);
		alos.setHorizontalAlignment(JLabel.CENTER);
		alop.setFont(font);
		alop.setHorizontalAlignment(JLabel.CENTER);
		
		//글씨 두개를 넣을 패널
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
				
		
		//패널에 마우스 리스너 추가
		no.addMouseListener(new ToppingMouse(0, this));
		per.addMouseListener(new ToppingMouse(1, this));
		milkForm.addMouseListener(new ToppingMouse(2, this));
		coco.addMouseListener(new ToppingMouse(3, this));
		alo.addMouseListener(new ToppingMouse(4, this));
		
		//패널에 이미지와 글씨 추가
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

		//선택 패널에 버튼 패널 추가
		this.setBounds(0, 580, 595, 150);
		this.add(no);
		this.add(per);
		this.add(milkForm);
		this.add(coco);
		this.add(alo);
		
	}

}
