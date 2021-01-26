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
	TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE); //�ֹ������� ��� textarea
	Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 16);
	
	public Cart(List<Products> list) {
		this.setLayout(new BorderLayout());
		this.setBounds(10,150,570,300);
		
		ta.setText("��ȣ   ��ǰ�� \t\t\t\t\t\t �ܰ�  ����   �հ�\n\n");  // ��ǰ��				�ܰ�  ����  �հ�
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getName().length() < 8) { 													//���ڰ� 7�� ������ ��ǰ�� ���
				ta.append((i+1)+"  " +list.get(i).getName()+"\t\t\t\t\t\t"+list.get(i).getPrice()+ "    " + 
						list.get(i).getCnt() +"    "+ list.get(i).getPrice() *list.get(i).getCnt()+ "��" + "\n");
			} else if(list.get(i).getName().length() == 9) {
				ta.append((i+1)+"  " +list.get(i).getName()+"\t\t\t\t\t"+list.get(i).getPrice()+ "    " + 
						list.get(i).getCnt() +"    "+ list.get(i).getPrice() *list.get(i).getCnt()+ "��" + "\n"); 
			} else if(list.get(i).getName().length() == 10) {
				ta.append((i+1)+"  " +list.get(i).getName()+"\t\t\t\t\t"+list.get(i).getPrice()+ "    " + 
						list.get(i).getCnt() +"    "+ list.get(i).getPrice() *list.get(i).getCnt()+ "��" + "\n");
			}
			else if(list.get(i).getName().length()>8 &&list.get(i).getName().length()<15) { 			//���ڰ� 7�̻� 15�̸��� ��ǰ�� ���
				ta.append((i+1)+"  " +list.get(i).getName()+"\t\t\t\t"+list.get(i).getPrice()+ "    " + 
						list.get(i).getCnt() +"    "+ list.get(i).getPrice() *list.get(i).getCnt()+ "��" + "\n");
			}else {																						//�� ���� ��ǰ�� ���
				String str1 = list.get(i).getName().substring(0, 15); 
				String str2 = list.get(i).getName().substring(15, list.get(i).getName().length());
				ta.append((i+1)+"  " +str1+"\t\t\t\t"+list.get(i).getPrice()+ "    " + 
						list.get(i).getCnt() +"    "+ list.get(i).getPrice() *list.get(i).getCnt()+ "��" + "\n"
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
	   //��ٱ����г� ����------------------------------------------------------------------------------------------------
		
	}

}
