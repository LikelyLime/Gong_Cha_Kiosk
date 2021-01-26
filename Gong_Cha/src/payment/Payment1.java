package payment;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import Shopping_basket.Basket;
import run.Products;
import run.ResetThread;

public class Payment1 extends Panel {

	int money = 0;
	String numStr = "";

	public Payment1(Frame f, List<Products> list) {
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 25);

		for (int i = 0; i < list.size(); i++) {
			money += list.get(i).getCnt() * list.get(i).getPrice();
		}

		// ī���ȣ����г�------------------------------------------------
		Panel pCenter = new Panel();
		pCenter.setFont(font);
		pCenter.setBounds(80, 250, 400, 55); // ī���ȣ�Է�â�� �� �г��� ��ġ

		Label cardnum = new Label("ī���ȣ");
		TextField tf = new TextField(10);
		tf.setEditable(false);

		pCenter.add(cardnum);
		pCenter.add(tf);
		f.add(pCenter);
		// ���� ��ư----------------------------------------------------------------
		
		// 1  2  3
		// 4  5  6
		// 7  8  9
		//     0  C
		
		// �гξȿ� ���ڹ�ư�� ���� ���� ���� ������ �г� ��ġ�� �����.
		Panel pNum1 = new Panel();
		pNum1.setFont(font);
		pNum1.setBounds(140, 350, 100, 50);
		Button btnNum1 = new Button("   1   ");
		
		Panel pNum2 = new Panel();
		pNum2.setFont(font);
		pNum2.setBounds(250, 350, 100, 50);
		Button btnNum2 = new Button("   2   ");
		
		Panel pNum3 = new Panel();
		pNum3.setFont(font);
		pNum3.setBounds(360, 350, 100, 50);
		Button btnNum3 = new Button("   3   ");
		
		Panel pNum4 = new Panel();
		pNum4.setFont(font);
		pNum4.setBounds(140, 400, 100, 50);
		Button btnNum4 = new Button("   4   ");
		
		Panel pNum5 = new Panel();
		pNum5.setFont(font);
		pNum5.setBounds(250, 400, 100, 50);
		Button btnNum5 = new Button("   5   ");
		
		Panel pNum6 = new Panel();
		pNum6.setFont(font);
		pNum6.setBounds(360, 400, 100, 50);
		Button btnNum6 = new Button("   6   ");
		
		Panel pNum7 = new Panel();
		pNum7.setFont(font);
		pNum7.setBounds(140, 450, 100, 50);
		Button btnNum7 = new Button("   7   ");
		
		Panel pNum8 = new Panel();
		pNum8.setFont(font);
		pNum8.setBounds(250, 450, 100, 50);
		Button btnNum8 = new Button("   8   ");
		
		Panel pNum9 = new Panel();
		pNum9.setFont(font);
		pNum9.setBounds(360, 450, 100, 50);
		Button btnNum9 = new Button("   9   ");
		
		Panel pNum0 = new Panel();
		pNum0.setFont(font);
		pNum0.setBounds(250, 500, 100, 50);
		Button btnNum0 = new Button("   0   ");
		//-----------------------------------------------------------------------------------------------------------------
		
		
		
		// ���ڹ�ư�� ��� �� �̺�Ʈ--------------------------------------------------------------------------------
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				//System.out.println( e.getActionCommand() );
				numStr += e.getActionCommand().trim(); // �ش� ���ڹ�ư�� �� ���ڿ��� ������ ���� �� umStr�� �߰�
				tf.setText(numStr); // setText�� ���
	
			}
		};
		
		btnNum1.addActionListener(al);
		btnNum2.addActionListener(al);
		btnNum3.addActionListener(al);
		btnNum4.addActionListener(al);
		btnNum5.addActionListener(al);
		btnNum6.addActionListener(al);
		btnNum7.addActionListener(al);
		btnNum8.addActionListener(al);
		btnNum9.addActionListener(al);
		btnNum0.addActionListener(al);
		//------------------------------------------------------------------------------------------------------------------

		//Ű�е�� �Է¹��� ���� ������ư---------------------------------------------------------------------------
		Panel pNumC = new Panel();
		pNumC.setFont(font);
		pNumC.setBounds(360, 500, 100, 50);
		Button btnNumC = new Button("   C   ");

		btnNumC.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				//Ű�е�� ���� ������ �� ���̿��� ������ư�� ���������� �� ���ھ� ���� 
				//�� ���̰� 0���� ������ ������� �ʴ´�.
				if (numStr.length() >0) {
					
					numStr = numStr.substring( 0, numStr.length()-1);
					tf.setText(numStr);
				}
			}
		});
		
		pNum1.add(btnNum1);
		pNum2.add(	btnNum2);
		pNum3.add(	btnNum3);
		pNum4.add(	btnNum4);
		pNum5.add(	btnNum5);
		pNum6.add(	btnNum6);
		pNum7.add(	btnNum7);
		pNum8.add(	btnNum8);
		pNum9.add(	btnNum9);
		pNum0.add(	btnNum0);
		pNumC.add(	btnNumC);
		
		f.add(pNum1);
		f.add(pNum2);
		f.add(pNum3);
		f.add(pNum4);
		f.add(pNum5);
		f.add(pNum6);
		f.add(pNum7);
		f.add(pNum8);
		f.add(pNum9);
		f.add(pNum0);
		f.add(pNumC);

		// �ڷΰ��� ��ư--------------------------------------------------------------------
		Panel pSouth2 = new Panel();
		pSouth2.setFont(font);
		pSouth2.setBounds(90, 700, 400, 100); // �����Ϸ� ��ư ��ġ
		Button btnundo = new Button("�ڷΰ���");

		btnundo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();
				f.removeAll();
				new Basket(f, list);
			}
		});

		pSouth2.add(btnundo);
		f.add(pSouth2);
		// �����Ϸ��г�---------------------------------------------------------------------
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBounds(90, 650, 400, 100); // �����Ϸ� ��ư ��ġ
		Button btnpay = new Button("�����ϱ�");
		btnpay.setEnabled(false);// ��ư ��Ȱ��ȭ

		pSouth.add(btnpay);
		f.add(pSouth);

		// -----------------------------------------------------------------------------
		// TextField�� ī���ȣ�� �Է��� ��쿡�� �����Ϸ� ��ư�� Ȱ��ȭ
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				// tf�� ������ ����ִٸ� �Է¹�ư ��Ȱ��ȭ
				if (tf.getText().equals("")) {
					btnpay.setEnabled(false);
				} else {
					btnpay.setEnabled(true);
				}

			}
		});
		// --------------------------------------------------------------------------------
		btnpay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ResetThread.reset();

				new Card(tf.getText(), f, money, list);
				tf.setText(""); // TextField�� ���� ī���ȣ�� �Է������� ��ȣ�� �������� �ٽ� �Է�
				numStr ="";
				tf.requestFocusInWindow();
			}
		});
		f.setVisible(true);
	}

}
