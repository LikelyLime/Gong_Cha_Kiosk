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
				
				String str2 = new String(br); // 배열에 담긴 데이터를 string으로 변환
				res = Integer.parseInt(str2); // string으로 변환한 값을 int로 변환
				
				// res는 내가 입력한 카드번호안에 있는 금액. 
				
				if (res >= money1) {
					
					res -= money1;
					//System.out.println(res);
					JOptionPane.showMessageDialog(f1,"결제가 완료되었습니다");
					FileOutputStream fos = null;
					
					try {
						fos = new FileOutputStream(path);
						fos.write( String.valueOf(res).getBytes());
						//System.out.println("저장완료");
					} catch (Exception e) {
						System.out.println("저장실패");
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
					JOptionPane.showMessageDialog(f1,"금액이 부족합니다");
					
				}
				
			} catch (Exception e) {
				System.out.println("정보를 불러올 수 없습니다");
			}finally {
				try {
					//ois.close();
					fis.close();
				} catch (Exception e2) {
					
				}
			}
		}else {
			JOptionPane.showMessageDialog(f1,"카드 정보를 불러올 수 없습니다");
			
		}
	}

}
