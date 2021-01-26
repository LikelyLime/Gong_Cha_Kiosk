package sheet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//당도 선택 패널
public class Sweet extends Panel{
	
	//마우스 리스너에서 사용하기 위해 멤버값으로 만든다.
	Panel s50;
	Panel s100;
	Panel s70;
	Panel s30;
	
	//모든 항목이 체크 되었을때 다음 패널로 넘어가기위해 불린값을 만든다.
	boolean check = false;
	
	//선택한 항목을 표시할 문자열 마우스리스너에서 값을 받는다
	String sweets = "";
	
		public Sweet() {

			Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 16);
			
			//각 이미지를 담을 패널 생성
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
			
			//각 패널에 넣을 이미지와 글씨 생성
			JLabel s30i = new JLabel(simg30);
			JLabel s30s = new JLabel("당도 30%");
			s30s.setFont(font);
			s30s.setHorizontalAlignment(JLabel.CENTER);
			
			JLabel s50i = new JLabel(simg50);
			JLabel s50s = new JLabel("당도 50%");
			s50s.setFont(font);
			s50s.setHorizontalAlignment(JLabel.CENTER);

			JLabel s70i = new JLabel(simg70);
			JLabel s70s = new JLabel("당도 70%");
			s70s.setFont(font);
			s70s.setHorizontalAlignment(JLabel.CENTER);

			JLabel s100i = new JLabel(simg100);
			JLabel s100s = new JLabel("당도 100%");
			s100s.setFont(font);
			s100s.setHorizontalAlignment(JLabel.CENTER);
			
			//각 패널에 마우스 리스너 추가
			s50.addMouseListener(new SweetMouse(1, this));
			s100.addMouseListener(new SweetMouse(2, this));
			s70.addMouseListener(new SweetMouse(3, this));
			s30.addMouseListener(new SweetMouse(4, this));
			
			//각 패널에 이미지와 글씨 추가
			s50.add(s50i, BorderLayout.CENTER);
			s50.add(s50s, BorderLayout.SOUTH);
			s100.add(s100i, BorderLayout.CENTER);
			s100.add(s100s, BorderLayout.SOUTH);
			s70.add(s70i, BorderLayout.CENTER);
			s70.add(s70s, BorderLayout.SOUTH);
			s30.add(s30i, BorderLayout.CENTER);
			s30.add(s30s, BorderLayout.SOUTH);

			//선택 패널에 버튼 패널 추가
			this.setBounds(0, 420, 595, 130);
			this.add(s30);
			this.add(s50);
			this.add(s70);
			this.add(s100);
			
		}

}
