package sheet;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import category.PageMilk1;
import run.Products;
import run.ResetThread;

//���� �г�
public class Sheet extends Panel{
	
	public  Sheet(Frame f, List<Products> list) {
		this.setBounds(0, 0, 595, 842);
		this.setLayout(null);
		

		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		
		//�� �г� ����
		Ice ice = new Ice();
		HotCold hc = new HotCold(ice);
		Sweet sw = new Sweet();
		Topping tp = new Topping();
		
		//�гε��� ��Ʈ�гο� �߰�
		this.add(hc);
		this.add(ice);
		this.add(sw);
		this.add(tp);
		
		//�̸� �г� ����
		Panel name = new Panel();
		JLabel namel = new JLabel("---" + list.get(list.size()-1).getName() + "---");
		namel.setFont(font);
		namel.setHorizontalAlignment(JLabel.CENTER);
		name.add(namel);
		
		Panel hcn = new Panel();
		JLabel hcl = new JLabel
				("--------------------------------------------COLD/HOT--------------------------------------------");
		hcl.setFont(font);
		hcl.setHorizontalAlignment
		(JLabel.CENTER);
		hcn.add(hcl);
		
		Panel icen = new Panel();
		JLabel icel = new JLabel
				("--------------------------------------------ICE--------------------------------------------");
		icel.setFont(font);
		icel.setHorizontalAlignment(JLabel.CENTER);
		icen.add(icel);
		Panel swn = new Panel();
		JLabel swl = new JLabel
				("--------------------------------------------SWEET--------------------------------------------");
		swl.setFont(font);
		swl.setHorizontalAlignment(JLabel.CENTER);
		swn.add(swl);
		
		Panel tpn = new Panel();
		JLabel tpl = new JLabel
				("--------------------------------------------TOPPING--------------------------------------------");
		tpl.setFont(font);
		tpl.setHorizontalAlignment(JLabel.CENTER);
		tpn.add(tpl);
		
		//�̸� �г� ��ġ
		name.setBounds(0, 40, 595, 30);
		hcn.setBounds(0, 70, 595, 30);
		icen.setBounds(0, 230, 595, 30);
		swn.setBounds(0, 390, 595, 30);
		tpn.setBounds(0, 550, 595, 30);
		this.add(name);
		this.add(hcn);
		this.add(icen);
		this.add(swn);
		this.add(tpn);
		
		// ��ư ����
		Button btn1 = new Button("�ڷ�");
		Button btn2 = new Button("���");
		btn1.setBounds(157, 0, 100, 50);
		btn2.setBounds(338, 0, 100, 50);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				HotColdMouse.islF();
				list.remove(list.size()-1);
				f.removeAll();
				new PageMilk1(f, list);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				if(hc.check&&ice.check&&sw.check&&tp.check) {
					
					HotColdMouse.islF();
					
					String name = String.format(" %s %s %s %s\n", 
							hc.hotColds, ice.ices, sw.sweets, tp.toppings);
					
					Products pro = list.get(list.size()-1);
					
					int i=0;
					for(; i<list.size(); i++) {
						if(list.get(i).getName().equals(pro.getName() + name)) {
							list.get(i).setCnt(list.get(i).getCnt()+1);
							list.remove(list.size()-1);
							break;
						}
					}
					if(i==list.size()) {
						pro.setName(pro.getName()+name);
						pro.setPrice(pro.getPrice()+tp.price);
						list.remove(i-1);
						list.add(pro);
					}
					
					f.removeAll();
					new PageMilk1(f, list);
					JOptionPane.showMessageDialog(f,"�޴��� ��ٱ��Ͽ� ��ҽ��ϴ�.");
				}else {
					JOptionPane.showMessageDialog(f, "��� �׸��� üũ�ϼ���.");
				}
				
			}
		});
		
		//��ư�� ��� �г��� �����ϰ� ��ư�� �߰�
		Panel nebi = new Panel();
		nebi.setLayout(null);
		nebi.setBounds(0, 770, 595, 100);
		nebi.add(btn1);
		nebi.add(btn2);
		
		this.add(nebi);
		
		f.add(this);
		f.setVisible(true);
		
	}

}
