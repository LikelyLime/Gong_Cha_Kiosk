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
			pro.setName("핫치킨 부리또");
			pro.setPrice(3900);
			list.add(pro);
			break;
		case 2:
			pro.setName("미니 크로크 무슈");
			pro.setPrice(3000);
			list.add(pro);
			break;
		case 3:
			pro.setName("스콘(치즈)");
			pro.setPrice(2800);
			list.add(pro);
			break;
			
		case 4:
			pro.setName("잉글리쉬 머핀");
			pro.setPrice(3500);
			list.add(pro);
			break;
			
		case 5:
			pro.setName("망고 스무디");
			pro.setPrice(5300);
			list.add(pro);
			break;
		case 6:
			pro.setName("제주 그린티 스무디");
			pro.setPrice(5300);
			list.add(pro);
			break;
		case 7:
			pro.setName("딸기 쿠키 스무디");
			pro.setPrice(5300);
			list.add(pro);
			break;
			
		case 8:
			pro.setName("초코 쿠앤크 스무디");
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
		
		JOptionPane.showMessageDialog(f,"메뉴를 장바구니에 담았습니다.");
	}

}
