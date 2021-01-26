package category;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JOptionPane;

import Shopping_basket.Basket;
import run.Products;
import run.ResetThread;
import sheet.Sheet;

public class BasketMouse extends MouseAdapter{
	
	Frame f;
	List<Products> list;
	int n;
	int i;
	
	public BasketMouse(int n, Frame f, List<Products> list) {
		this.f = f;
		this.list = list;
		this.n = n;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		ResetThread.reset();
		Products pro = new Products();
		
		switch (n) {
		case 1:
			pro.setName("��ġŲ �θ���");
			pro.setPrice(3900);
			list.add(pro);
			break;
		case 2:
			pro.setName("�̴� ũ��ũ ����");
			pro.setPrice(3000);
			list.add(pro);
			break;
		case 3:
			pro.setName("����(ġ��)");
			pro.setPrice(2800);
			list.add(pro);
			break;
			
		case 4:
			pro.setName("�ױ۸��� ����");
			pro.setPrice(3500);
			list.add(pro);
			break;
			
		case 5:
			pro.setName("���� ������");
			pro.setPrice(5300);
			list.add(pro);
			break;
		case 6:
			pro.setName("���� �׸�Ƽ ������");
			pro.setPrice(5300);
			list.add(pro);
			break;
		case 7:
			pro.setName("���� ��Ű ������");
			pro.setPrice(5300);
			list.add(pro);
			break;
			
		case 8:
			pro.setName("���� ���ũ ������");
			pro.setPrice(4500);
			list.add(pro);
			break;
		}
		
		for(i=0; i<list.size()-1; i++) {
			if(list.get(i).getName().equals(list.get(list.size()-1).getName())) {
				list.get(i).setCnt(list.get(i).getCnt()+1);
				list.remove(list.size()-1);
				break;
			}
		}
		
		JOptionPane.showMessageDialog(f,"�޴��� ��ٱ��Ͽ� ��ҽ��ϴ�.");
	}

}
