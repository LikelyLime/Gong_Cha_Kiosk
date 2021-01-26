package category;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class PageDi extends Panel{
	
	PageDi m = this;
	//===========================================ī�װ� ��ư
	public PageDi(Frame f, List list) {
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
        milk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				f.removeAll();//��ü����
				new PageMilk1(f, list);//��ũƼ ������ ����
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
       
       di.setBackground(Color.orange);

		
		f.add(milk);
		f.add(di);
		f.add(sm);
		
		f.setVisible(true);
		
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
        Panel im3;
        Panel im4;
               
        ImageIcon img = new ImageIcon("./cateImage/di1 (1).png");
        
        im1 = new Panel();
        im1.setLayout(null);
        im1.setLayout(new BorderLayout());
        im1.setBounds(50, 100, 230, 290);
       // im1.setBackground(Color.green);
        
        ImageIcon img2 = new ImageIcon("./cateImage/di2.jpg");
        im2 = new Panel();
        im2.setLayout(null);
        im2.setLayout(new BorderLayout());
        im2.setBounds(300, 100, 230, 290);
        //im2.setBackground(Color.green);
        
        
        ImageIcon img3 = new ImageIcon("./cateImage/di3.jpg");
        im3 = new Panel();
        im3.setLayout(null);
        im3.setLayout(new BorderLayout());
        im3.setBounds(50, 400, 230, 290);
        //im3.setBackground(Color.green);
        
        ImageIcon img4 = new ImageIcon("./cateImage/����.jpg");//�̹��� ã��
        im4 = new Panel();//�г� ����
        im4.setLayout(null);//���� ��ġ���� x
        im4.setLayout(new BorderLayout());
        im4.setBounds(300, 400, 230, 290);//��ġ ����
        
        
        JLabel jl1 = new JLabel(img);
        jl1.setBounds(0, 0, 230, 270);
        JLabel jl11 = new JLabel("��ġŲ �긮�� 3900��");
        jl11.setBounds(0, 270, 230, 20);
        jl11.setHorizontalAlignment(JLabel.CENTER);
        
        
        JLabel jl2 = new JLabel(img2);
        jl2.setBounds(0, 0, 230, 270);
        JLabel jl22 = new JLabel("�̴� ũ��ũ ���� 3000��");
        jl22.setBounds(0, 270, 230, 20);
        jl22.setHorizontalAlignment(JLabel.CENTER);
        
        
        
        JLabel jl3 = new JLabel(img3);
        jl3.setBounds(0, 0, 230, 270);
        JLabel jl33 = new JLabel("����(ġ��) 2800��");
        jl33.setBounds(0, 270, 230, 20);
        jl33.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel jl4 = new JLabel(img4);//�̹��� ����
		jl4.setBounds(0, 0, 230, 270);//�̹��� ��ġ
		JLabel jl44 = new JLabel("�ױ۸��� ���� 3500��");//�޴� �̸�
        jl44.setBounds(0, 270, 230, 20);//�޴��̸� ��ġ
        jl44.setHorizontalAlignment(JLabel.CENTER);//�޴��̸� ��ġ ����ֱ�
        
		
		jl1.addMouseListener(new BasketMouse(1, f, list));
		jl2.addMouseListener(new BasketMouse(2, f, list));
		jl3.addMouseListener(new BasketMouse(3, f, list));
		jl4.addMouseListener(new BasketMouse(4, f, list));
		
		
		
		im1.add(jl1, BorderLayout.CENTER);
		im1.add(jl11, BorderLayout.SOUTH);
		im2.add(jl2, BorderLayout.CENTER);
		im2.add(jl22, BorderLayout.SOUTH);
		im3.add(jl3, BorderLayout.CENTER);
		im3.add(jl33, BorderLayout.SOUTH);
		im4.add(jl4, BorderLayout.CENTER);
		im4.add(jl44, BorderLayout.SOUTH);
		
		
		
		this.add(im1);
		this.add(im2);
		this.add(im3);
		this.add(im4);
		
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
