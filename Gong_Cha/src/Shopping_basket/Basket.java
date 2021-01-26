package Shopping_basket;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import category.PageMilk1;
import payment.Payment1;
import run.Products;
import run.ResetThread;

public class Basket extends Panel{
	
	
	
	
		public Basket(Frame f, List<Products> list) {
			this.setBounds(0, 0, 595, 842);
			this.setLayout(null);
			
			//��ٱ��� ��� 
			Label l1 = new Label("01 �ֹ�Ȯ��");				
			Label l2 = new Label("�ֹ������� Ȯ�����ּ���");
			
			//��ٱ��� �ϴ�
			Label l3 = new Label("������ ��ȣ : ");
			Label l4 = new Label("�� ���� �ݾ� : ");
			TextField del1 = new TextField(10);
			TextField tf = new TextField(15);
			Button prev = new Button("����");
			Button pay = new Button("�����ϱ�");
			Button del = new Button("�����ϱ�");
			tf.setEditable(false);	//TextArea�� ���� �߰�/�����ϴ� ���� ����
			
			//��Ʈ
			Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
	        Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 16);

			//��ٱ����г� ����------------------------------------------------------------------------------------------------
			Cart cart = new Cart(list);
					
			//��ٱ���-----------------------------------------------------------------------------------------------------
					
					//���� ��ư
					prev.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							ResetThread.reset();
							f.removeAll();
							new PageMilk1(f, list);
						}
					});
					
					//�����ϱ� ��ư
					pay.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							ResetThread.reset();
							f.removeAll();
							new Payment1(f, list);
						}
					});
					
					//�����ϱ� ��ư
					del.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							ResetThread.reset();

							String str = cart.ta.getText(); //textarea�� ��� ���ڸ� ������ str�� �����Ѵ�.
							String[] arr = str.split("--------------------------------------------------------------"); //���м��� �������� ������ �迭�� �ִ´�.
							try {
								int n = Integer.parseInt(del1.getText())-1;
								if(list.get(n).getCnt() == 1) {
									str = str.replace(arr[Integer.parseInt(del1.getText())-1], ""); //del1�ؽ�Ʈ �ʵ忡 ���ڰ� �Էµǰ� ���� ��ư�� ������ �迭�� -1�̵Ǿ� ~��° �ֹ������� ��ĭ���� �ٲ��.
									str = str.replace("--------------------------------------------------------------", ""); // �� �ؿ� ���м��� ��ĭ���� �����.
									cart.ta.setText(str); //str�� �ٽ� textarea�� �����Ѵ�.
									list.remove(n);
									
								} else {
									list.get(n).setCnt(list.get(n).getCnt()-1);
								}
								
								if(list.size() == 0) {
									JOptionPane.showMessageDialog(f,"��ٱ��Ͽ� �޴��� �����ϴ�.");
									f.removeAll();
									new PageMilk1(f,list);
								} else {
									f.removeAll();
									new Basket(f,list);
								}
								
							} catch (Exception e2) {
								JOptionPane.showMessageDialog(f,"��ȣ�� �ٽ� �Է����ּ���.");
							}
							
						}
					});
					
			
			tf.setText("\t"+cart.total1+"��");	//�� �����ݾ� = �ܰ� * ����
			l1.setBounds(10, 40, 180, 50);
			l1.setFont(font);
			l2.setBounds(10, 80, 180, 50);
			l3.setBounds(200,520,70,30);
			l4.setBounds(200, 620,200,30);		
			tf.setBounds(300, 620,100,30);
			prev.setBounds(100, 700, 100, 100); //���� ��ư
			pay.setBounds(400, 700, 100, 100); //�����ϱ� ��ư
			del1.setText("");
			del1.setBounds(300, 520,70,30); //��ٱ��Ͽ��� ������ ��ȣ�� �Է¹޴� �ؽ�Ʈ�ʵ�
			del.setBounds(400,500, 70,70);
					
			f.add(tf,BorderLayout.SOUTH);
			f.add(l1);
			f.add(l2);
			f.add(l3);
			f.add(l4);
			f.add(prev);
			f.add(pay);
			f.add(del);
			f.add(del1);
			f.add(cart);
			f.setVisible(true);
			

		}
}

