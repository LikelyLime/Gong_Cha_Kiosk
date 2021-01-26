package category;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Shopping_basket.Basket;
import page.ThreadM;
import run.ResetThread;

public class PageMilk2 extends Panel{
	PageMilk2 m = this;
	//===========================================ī�װ� ��ư
	public PageMilk2(Frame f, List list) {
		this.setBounds(0, 0, 595, 842);
		this.setLayout(null);
		
		//��ư ����
		
		Button milk = new Button("��ũƼ");
		Button di = new Button("����Ʈ");
		Button sm = new Button("������");
		//==========================-----------------
		
		//��ư ��ġ
		milk.setBounds(50, 40, 120, 50);
		di.setBounds(230, 40, 120, 50);		
		sm.setBounds(406, 40, 120, 50);
		//-------------------------------------------
        
        //��ư Ȱ��ȭ
       di.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				f.removeAll();//��ü����
				new PageDi(f, list);//����Ʈ ������ ����
			}
		});
		
       sm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				f.removeAll();//��ü����
				new PageSm(f, list);//������ ������ ����
			}
		});
       
       milk.setBackground(Color.orange);
       
		f.add(milk);
		f.add(di);
		f.add(sm);
		
		f.setVisible(true);
	
        //---------------------������ �̵� ��ư
        Button Pagemove = new Button("��");
        Button Pagemove2 = new Button("��");
        Pagemove.setBounds(180, 700, 30, 30);
        Pagemove2.setBounds(400, 700, 30, 30);
        
        
        JLabel num = new JLabel("2");
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
				new PageMilk1(f, list);
            }
           });
        Pagemove2.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				f.removeAll();
				new PageMilk1(f, list);
            }
           });
        
        this.add(Pagemove);
        f.add(this);
        this.add(Pagemove2);
        f.add(this);
        Pagemove.setVisible(true);
        Pagemove2.setVisible(true);
        
        
        //-----------------------------------------��ٱ��� ��ư �ڵ�
        Button menuba = new Button("��ٱ���");
        menuba.setBounds(338, 770, 100, 50);
        menuba.addActionListener( new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
        	 if (list.size() != 0) {
            	 f.removeAll();
            	 new Basket(f, list);
    			
    		}else {
    			JOptionPane.showMessageDialog(f,"�޴��� �����ϼ���");
    		}
         }
        });
              this.add(menuba);
              f.add(this);
              menuba.setVisible(true);
      //==========================================�޴�	
        
        Panel im1;
        Panel im2;
        
        
                
        
        
        ImageIcon img = new ImageIcon("./cateImage/���.jpg");//�̹��� ã��
        
        im1 = new Panel();//�г� ����
        im1.setLayout(null);//���� ��ġ���� x
        im1.setLayout(new BorderLayout());
        im1.setBounds(50, 100, 230, 290);//��ġ ����
     
        
        
        ImageIcon img2 = new ImageIcon("./cateImage/�ڽ���.jpg");//�̹��� ã��
        im2 = new Panel();//�г� ����
        im2.setLayout(null);//���� ��ġ���� x
        im2.setLayout(new BorderLayout());
        im2.setBounds(300, 100, 230, 290);//��ġ ����
        
        
        
        
        
        
        JLabel jl1 = new JLabel(img);//�̹��� ����
        jl1.setBounds(0, -10, 230, 290);//�̹��� ��ġ
        JLabel jl11 = new JLabel("��� ��ũƼ 4000��");//�޴� �̸�
        jl11.setBounds(0, 270, 230, 20);//�޴��̸� ��ġ
        jl11.setHorizontalAlignment(JLabel.CENTER);//�޴��̸� ��ġ ����ֱ�
        
       
        
        JLabel jl2 = new JLabel(img2);//�̹��� ����
        jl2.setBounds(0, 0, 230, 270);//�̹��� ��ġ
        JLabel jl22 = new JLabel("�ڽ��� ��ũƼ 4000��");//�޴� �̸�
        jl22.setBounds(0, 270, 230, 20);//�޴��̸� ��ġ
        jl22.setHorizontalAlignment(JLabel.CENTER);//�޴��̸� ��ġ ����ֱ�
        
        
        
      
        
        //----------------������ �ѱ��
		jl1.addMouseListener(new SheetMouse(5, f, list));
		jl2.addMouseListener(new SheetMouse(6, f, list));
		
		
		//------------------------------�г��Է�
		im1.add(jl1, BorderLayout.CENTER);
		im1.add(jl11, BorderLayout.SOUTH);
		im2.add(jl2, BorderLayout.CENTER);
		im2.add(jl22, BorderLayout.SOUTH);
		
		//------------------------------�����ӿ� �Է�
		this.add(im1);
		this.add(im2);
		
		
		
		//==================�ڷΰ��� ��ư
		Button btn = new Button("�ڷ�");

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
