package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		while( true ) {

			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			int num1 = Integer.parseInt(tokens[0]);
			String operation = tokens[1];
			int num2 = Integer.parseInt(tokens[2]);
			
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			/*  코드를 완성 합니다 */
			if(operation.equals("+"))
			{
				add.setValue(num1, num2);
				System.out.print(">> " + add.calculate());
				System.out.println();
			}
			else if(operation.equals("-"))
			{
				sub.setValue(num1, num2);
				System.out.print(">> " + sub.calculate());
				System.out.println();
			}
			else if(operation.equals("*"))
			{
				mul.setValue(num1, num2);
				System.out.print(">> " + mul.calculate());
				System.out.println();
			}
			else if(operation.equals("/"))
			{
				div.setValue(num1, num2);
				if(div.calculate() == 0)
				{
					System.out.println("0으로 나눌 수 없습니다. 다시하세요!");
				}
				else
				{
					System.out.print(">> " + div.calculate());
					System.out.println();
				}
			}
			
		}
		
		scanner.close();

	}

}
