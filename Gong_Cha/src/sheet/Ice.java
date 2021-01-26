package sheet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//얼음양 선택 패널
public class Ice extends Panel{
	
	//마우스 리스너에서 사용하기 위해 멤버값으로 만든다.
	Panel ri;
	Panel fi;
	Panel li;
	
	//모든 항목이 체크 되었을때 다음 패널로 넘어가기위해 불린값을 만든다.
	boolean check = false;
	
	//선택한 항목을 표시할 문자열 마우스리스너에서 값을 받는다
	String ices = "";
	
	public Ice() {
		
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 16);
		
		//각 이미지를 담을 패널 생성
		ri = new Panel();
		ri.setLayout(new BorderLayout());

		fi = new Panel();
		fi.setLayout(new BorderLayout());

		li = new Panel();
		li.setLayout(new BorderLayout());
		
		ImageIcon rImg = new ImageIcon("./sheetImage/ice70.png");
		ImageIcon fImg = new ImageIcon("./sheetImage/ice100.png");
		ImageIcon lImg = new ImageIcon("./sheetImage/ice30.png");
		
		//각 패널에 넣을 이미지와 글씨 생성
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

		//각 패널에 이미지와 글씨 추가
		ri.add(rii, BorderLayout.CENTER);
		ri.add(ris, BorderLayout.SOUTH);
		fi.add(fii, BorderLayout.CENTER);
		fi.add(fis, BorderLayout.SOUTH);
		li.add(lii, BorderLayout.CENTER);
		li.add(lis, BorderLayout.SOUTH);
		
		//선택 패널에 버튼 패널 추가		
		this.setBounds(0, 260, 595, 130);
		this.add(li);
		this.add(ri);
		this.add(fi);
	}

}
