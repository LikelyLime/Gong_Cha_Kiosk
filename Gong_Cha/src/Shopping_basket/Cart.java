package Shopping_basket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.List;

import run.Products;

public class Cart extends Panel {
	int total1 = 0;
	TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE); //주문내역이 담길 textarea
	Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 16);
	
	public Cart(List<Products> list) {
		this.setLayout(new BorderLayout());
		this.setBounds(10,150,570,300);
		
		ta.setText("번호   상품명 \t\t\t\t\t\t 단가  수량   합계\n\n");  // 상품명				단가  수량  합계
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getName().length() < 8) { 													//글자가 7개 이하인 제품의 출력
				ta.append((i+1)+"  " +list.get(i).getName()+"\t\t\t\t\t\t"+list.get(i).getPrice()+ "    " + 
						list.get(i).getCnt() +"    "+ list.get(i).getPrice() *list.get(i).getCnt()+ "원" + "\n");
			} else if(list.get(i).getName().length() == 9) {
				ta.append((i+1)+"  " +list.get(i).getName()+"\t\t\t\t\t"+list.get(i).getPrice()+ "    " + 
						list.get(i).getCnt() +"    "+ list.get(i).getPrice() *list.get(i).getCnt()+ "원" + "\n"); 
			} else if(list.get(i).getName().length() == 10) {
				ta.append((i+1)+"  " +list.get(i).getName()+"\t\t\t\t\t"+list.get(i).getPrice()+ "    " + 
						list.get(i).getCnt() +"    "+ list.get(i).getPrice() *list.get(i).getCnt()+ "원" + "\n");
			}
			else if(list.get(i).getName().length()>8 &&list.get(i).getName().length()<15) { 			//글자가 7이상 15미만인 제품의 출력
				ta.append((i+1)+"  " +list.get(i).getName()+"\t\t\t\t"+list.get(i).getPrice()+ "    " + 
						list.get(i).getCnt() +"    "+ list.get(i).getPrice() *list.get(i).getCnt()+ "원" + "\n");
			}else {																						//그 외의 제품들 출력
				String str1 = list.get(i).getName().substring(0, 15); 
				String str2 = list.get(i).getName().substring(15, list.get(i).getName().length());
				ta.append((i+1)+"  " +str1+"\t\t\t\t"+list.get(i).getPrice()+ "    " + 
						list.get(i).getCnt() +"    "+ list.get(i).getPrice() *list.get(i).getCnt()+ "원" + "\n"
						+ str2);
				
			}
			ta.append("\n--------------------------------------------------------------");
		}	
			
		for(int i = 0; i<list.size(); i++) {
			total1 += list.get(i).getPrice() * list.get(i).getCnt();
		}

		
	     ta.setBackground(Color.white);
	     ta.setFont(font1);
	     ta.setEditable(false);
	     this.add(ta, BorderLayout.CENTER);
	   //장바구니패널 생성------------------------------------------------------------------------------------------------
		
	}

}
