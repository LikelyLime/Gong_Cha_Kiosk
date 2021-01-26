package category;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import run.Products;
import run.ResetThread;
import sheet.Sheet;

public class SheetMouse extends MouseAdapter {
	
	Frame f;
	List list;
	int n;
	
	public SheetMouse(int n, Frame f, List list) {
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
			pro.setName("�� ��ũƼ");
			pro.setPrice(4000);
			list.add(pro);
			break;
		case 2:
			pro.setName("Ÿ�� ��ũƼ");
			pro.setPrice(4000);
			list.add(pro);
			break;
		case 3:
			pro = new Products();
			pro.setName("���ݸ� ��ũƼ");
			pro.setPrice(4000);
			list.add(pro);
			break;
		case 4:
			pro.setName("��׷��� ��ũƼ");
			pro.setPrice(4000);
			list.add(pro);
			break;
		case 5:
			pro.setName("��� ��ũƼ");
			pro.setPrice(4000);
			list.add(pro);
			break;
		case 6:
			pro.setName("�ڽ��� ��ũƼ");
			pro.setPrice(4000);
			list.add(pro);
			break;
		
		}
		f.removeAll();
		new Sheet(f, list);
	}

}
