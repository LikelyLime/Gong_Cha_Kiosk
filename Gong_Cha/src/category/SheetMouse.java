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
			pro.setName("블랙 밀크티");
			pro.setPrice(4000);
			list.add(pro);
			break;
		case 2:
			pro.setName("타로 밀크티");
			pro.setPrice(4000);
			list.add(pro);
			break;
		case 3:
			pro = new Products();
			pro.setName("초콜릿 밀크티");
			pro.setPrice(4000);
			list.add(pro);
			break;
		case 4:
			pro.setName("얼그레이 밀크티");
			pro.setPrice(4000);
			list.add(pro);
			break;
		case 5:
			pro.setName("우롱 밀크티");
			pro.setPrice(4000);
			list.add(pro);
			break;
		case 6:
			pro.setName("자스민 밀크티");
			pro.setPrice(4000);
			list.add(pro);
			break;
		
		}
		f.removeAll();
		new Sheet(f, list);
	}

}
