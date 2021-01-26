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
			
			//장바구니 상단 
			Label l1 = new Label("01 주문확인");				
			Label l2 = new Label("주문내역을 확인해주세요");
			
			//장바구니 하단
			Label l3 = new Label("삭제할 번호 : ");
			Label l4 = new Label("총 결제 금액 : ");
			TextField del1 = new TextField(10);
			TextField tf = new TextField(15);
			Button prev = new Button("이전");
			Button pay = new Button("결제하기");
			Button del = new Button("삭제하기");
			tf.setEditable(false);	//TextArea에 값을 추가/수정하는 것을 방지
			
			//폰트
			Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
	        Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 16);

			//장바구니패널 생성------------------------------------------------------------------------------------------------
			Cart cart = new Cart(list);
					
			//장바구니-----------------------------------------------------------------------------------------------------
					
					//이전 버튼
					prev.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							ResetThread.reset();
							f.removeAll();
							new PageMilk1(f, list);
						}
					});
					
					//결제하기 버튼
					pay.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							ResetThread.reset();
							f.removeAll();
							new Payment1(f, list);
						}
					});
					
					//삭제하기 버튼
					del.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							ResetThread.reset();

							String str = cart.ta.getText(); //textarea의 모든 글자를 가져와 str에 저장한다.
							String[] arr = str.split("--------------------------------------------------------------"); //구분선을 기준으로 나눠서 배열에 넣는다.
							try {
								int n = Integer.parseInt(del1.getText())-1;
								if(list.get(n).getCnt() == 1) {
									str = str.replace(arr[Integer.parseInt(del1.getText())-1], ""); //del1텍스트 필드에 숫자가 입력되고 삭제 버튼을 누르면 배열에 -1이되어 ~번째 주문내역이 빈칸으로 바뀐다.
									str = str.replace("--------------------------------------------------------------", ""); // 그 밑에 구분선도 빈칸으로 만든다.
									cart.ta.setText(str); //str을 다시 textarea에 지정한다.
									list.remove(n);
									
								} else {
									list.get(n).setCnt(list.get(n).getCnt()-1);
								}
								
								if(list.size() == 0) {
									JOptionPane.showMessageDialog(f,"장바구니에 메뉴가 없습니다.");
									f.removeAll();
									new PageMilk1(f,list);
								} else {
									f.removeAll();
									new Basket(f,list);
								}
								
							} catch (Exception e2) {
								JOptionPane.showMessageDialog(f,"번호를 다시 입력해주세요.");
							}
							
						}
					});
					
			
			tf.setText("\t"+cart.total1+"원");	//총 결제금액 = 단가 * 개수
			l1.setBounds(10, 40, 180, 50);
			l1.setFont(font);
			l2.setBounds(10, 80, 180, 50);
			l3.setBounds(200,520,70,30);
			l4.setBounds(200, 620,200,30);		
			tf.setBounds(300, 620,100,30);
			prev.setBounds(100, 700, 100, 100); //이전 버튼
			pay.setBounds(400, 700, 100, 100); //결제하기 버튼
			del1.setText("");
			del1.setBounds(300, 520,70,30); //장바구니에서 삭제할 번호를 입력받는 텍스트필드
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

