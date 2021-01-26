package category;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Shopping_basket.Basket;
import page.ThreadM;
import page.ThreadP;
import run.ResetThread;



public class PageMilk1 extends Panel{
	
	PageMilk1 m = this;
	//===========================================카테고리 버튼
	public PageMilk1(Frame f, List list) {
		this.setBounds(0, 0, 595, 842);
		this.setLayout(null);
		
		//버튼 생성
		
		Button milk = new Button("밀크티");
		Button di = new Button("디저트");
		Button sm = new Button("스무디");
		//==========================-----------------
		
		//버튼 위치
		milk.setBounds(50, 40, 120, 50);
		di.setBounds(230, 40, 120, 50);		
		sm.setBounds(406, 40, 120, 50);
		//-------------------------------------------
        
        //버튼 활성화
       di.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				f.removeAll();//전체삭제
				new PageDi(f, list);//디저트 페이지 열기
			}
		});
		
       
       
       sm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				f.removeAll();//전체삭제
				new PageSm(f, list);//스무디 페이지 열기
			}
		});
       
       milk.setBackground(Color.orange);
       
		f.add(milk);
		f.add(di);
		f.add(sm);
		
		f.setVisible(true);
		
        //---------------------페이지 이동 버튼
        
        
        Button Pagemove = new Button("◀");
        Button Pagemove2 = new Button("▶");
        Pagemove.setBounds(180, 700, 30, 30);
        Pagemove2.setBounds(400, 700, 30, 30);
        
        JLabel num = new JLabel("1");
        num.setBounds(290, 700, 30, 30);
        num.setHorizontalAlignment(JLabel.CENTER);
        this.add(num);
        f.add(this);
        num.setVisible(true);
        
        Pagemove.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
             f.removeAll();
             new PageMilk2(f, list);
            }
           });
        
        
        
        Pagemove2.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
             f.removeAll();
             new PageMilk2(f, list);
            }
           });
        
        this.add(Pagemove);
        f.add(this);
        this.add(Pagemove2);
        f.add(this);
        Pagemove.setVisible(true);
        Pagemove2.setVisible(true);
        
        
        //-----------------------------------------장바구니 버튼 코드
        Button menuba = new Button("장바구니");
        menuba.setBounds(338, 770, 100, 50);
        menuba.addActionListener( new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
         if (list.size() != 0) {
        	 f.removeAll();
        	 new Basket(f, list);
			
		}else {
			JOptionPane.showMessageDialog(f,"메뉴를 선택하세요");
		}
         }
        });
              this.add(menuba);
              f.add(this);
              menuba.setVisible(true);
      //==========================================메뉴	
        
        Panel im1;
        Panel im2;
        Panel im3;
        Panel im4;
        
                
        
        
        ImageIcon img = new ImageIcon("./cateImage/milk1.jpg");//이미지 찾기
        
        im1 = new Panel();//패널 생성
        im1.setLayout(null);//임의 위치선택 x
        im1.setLayout(new BorderLayout());
        im1.setBounds(50, 100, 230, 290);//위치 선택
     
        
        
        ImageIcon img2 = new ImageIcon("./cateImage/milk2.jpg");//이미지 찾기
        im2 = new Panel();//패널 생성
        im2.setLayout(null);//임의 위치선택 x
        im2.setLayout(new BorderLayout());
        im2.setBounds(300, 100, 230, 290);//위치 선택
        
        
        
        ImageIcon img3 = new ImageIcon("./cateImage/milk3.jpg");//이미지 찾기
        im3 = new Panel();//패널 생성
        im3.setLayout(null);//임의 위치선택 x
        im3.setLayout(new BorderLayout());
        im3.setBounds(50, 400, 230, 290);//위치 선택
        
        
        ImageIcon img4 = new ImageIcon("./cateImage/얼그레이.jpg");//이미지 찾기
        im4 = new Panel();//패널 생성
        im4.setLayout(null);//임의 위치선택 x
        im4.setLayout(new BorderLayout());
        im4.setBounds(300, 400, 230, 290);//위치 선택
        
        
        JLabel jl1 = new JLabel(img);//이미지 생성
        jl1.setBounds(0, -10, 230, 290);//이미지 위치
        JLabel jl11 = new JLabel("블랙 밀크티 4000원");//메뉴 이름
        jl11.setBounds(0, 270, 230, 20);//메뉴이름 위치
        jl11.setHorizontalAlignment(JLabel.CENTER);//메뉴이름 위치 잡아주기
        
       
        
        JLabel jl2 = new JLabel(img2);//이미지 생성
        jl2.setBounds(0, 0, 230, 270);//이미지 위치
        JLabel jl22 = new JLabel("타로 밀크티 4000원");//메뉴 이름
        jl22.setBounds(0, 270, 230, 20);//메뉴이름 위치
        jl22.setHorizontalAlignment(JLabel.CENTER);//메뉴이름 위치 잡아주기
        
        
        
        JLabel jl3 = new JLabel(img3);//이미지 생성
		jl3.setBounds(0, 0, 230, 270);//이미지 위치
		JLabel jl33 = new JLabel("초콜릿 밀크티 4000원");//메뉴 이름
        jl33.setBounds(0, 270, 230, 20);//메뉴이름 위치
        jl33.setHorizontalAlignment(JLabel.CENTER);//메뉴이름 위치 잡아주기
		

        JLabel jl4 = new JLabel(img4);//이미지 생성
		jl4.setBounds(0, 0, 230, 270);//이미지 위치
		JLabel jl44 = new JLabel("얼그레이 밀크티 4000원");//메뉴 이름
        jl44.setBounds(0, 270, 230, 20);//메뉴이름 위치
        jl44.setHorizontalAlignment(JLabel.CENTER);//메뉴이름 위치 잡아주기
        
        //----------------페이지 넘기기
		jl1.addMouseListener(new SheetMouse(1, f, list));
		jl2.addMouseListener(new SheetMouse(2, f, list));
		jl3.addMouseListener(new SheetMouse(3, f, list));
		jl4.addMouseListener(new SheetMouse(4, f, list));
		
		//------------------------------패널입력
		im1.add(jl1, BorderLayout.CENTER);
		im1.add(jl11, BorderLayout.SOUTH);
		im2.add(jl2, BorderLayout.CENTER);
		im2.add(jl22, BorderLayout.SOUTH);
		im3.add(jl3, BorderLayout.CENTER);
		im3.add(jl33, BorderLayout.SOUTH);
		im4.add(jl4, BorderLayout.CENTER);
		im4.add(jl44, BorderLayout.SOUTH);
		//------------------------------프레임에 입력
		this.add(im1);
		this.add(im2);
		this.add(im3);
		this.add(im4);
		
		
		
		//==================뒤로가기 버튼
		Button btn = new Button("뒤로");

		btn.setBounds(157, 770, 100, 50);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.removeAll();
				new ThreadM(f, list);
			}
		});
		
		this.add(btn);
		
		f.add(this);
		
		
		
		
	}
	
	

}
