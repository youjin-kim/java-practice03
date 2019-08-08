package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] beverage = new Goods[COUNT_GOODS];
		
		System.out.println("실행결과:");
		System.out.println("------");
		
		for(int i=0; i<COUNT_GOODS; i++) {
			
			String bev = scanner.nextLine();
			
			String[] array = bev.split(" ");
			
			beverage[i] = new Goods();
			beverage[i].setName(array[0]);
			beverage[i].setPrice(Integer.parseInt(array[1]));
			beverage[i].setCountStock(Integer.parseInt(array[2]));
			
		}
		
		System.out.println();
		
		for(int j=0; j<COUNT_GOODS; j++) {
			System.out.println(beverage[j].getName() + "(가격: " + beverage[j].getPrice() + "원)이  " + beverage[j].getCountStock() + "개 입고 되었습니다.");
		}
		
		scanner.close();
	}
}
