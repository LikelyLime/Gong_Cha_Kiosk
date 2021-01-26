package payment;

import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import page.ThreadM;


public class Card {
	
	static int res = 0;
	
	public Card  ( String cardNum , Frame f1, int money1, List list) {
		String path = "./card/" + cardNum + ".txt";
		
		File fie = new File(path);
		byte[] br = new byte[(int)fie.length()];
		
		FileInputStream fis = null;
		
		if (fie.exists()) {
			try {
				fis = new FileInputStream(path);
				fis.read(br);
				
				String str2 = new String(br); // �迭�� ��� �����͸� string���� ��ȯ
				res = Integer.parseInt(str2); // string���� ��ȯ�� ���� int�� ��ȯ
				
				// res�� ���� �Է��� ī���ȣ�ȿ� �ִ� �ݾ�. 
				
				if (res >= money1) {
					
					res -= money1;
					//System.out.println(res);
					JOptionPane.showMessageDialog(f1,"������ �Ϸ�Ǿ����ϴ�");
					FileOutputStream fos = null;
					
					try {
						fos = new FileOutputStream(path);
						fos.write( String.valueOf(res).getBytes());
						//System.out.println("����Ϸ�");
					} catch (Exception e) {
						System.out.println("�������");
						e.printStackTrace();
					}finally {
						try {
							fos.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
					list.removeAll(list);
					Thread.sleep(500);
					new ThreadM(f1, list);
					
				}else {
					JOptionPane.showMessageDialog(f1,"�ݾ��� �����մϴ�");
					
				}
				
			} catch (Exception e) {
				System.out.println("������ �ҷ��� �� �����ϴ�");
			}finally {
				try {
					//ois.close();
					fis.close();
				} catch (Exception e2) {
					
				}
			}
		}else {
			JOptionPane.showMessageDialog(f1,"ī�� ������ �ҷ��� �� �����ϴ�");
			
		}
	}

}
