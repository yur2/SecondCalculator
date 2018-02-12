import java.util.InputMismatchException;
import java.util.Scanner;

public class Calcul2 {

	public int value;
	public int sum;
	public String operator;
	Scanner scan = new Scanner(System.in);

	public void Start() {

		System.out.println("================================================\n");
		System.out.println("유 ㄸㅣ의 계산기에영ㅎ \n\n계산이 필요하시면 입력!! 고고~쓍");
		System.out.println("    (단 종료하고 싶을시, 느낌표를 눌러주세요)");
	}

	public void Operator(int sum) {

		while (true) {
			 if (value >= -2147483648 && value <= 2147483647) {
			
			 } else {
			 System.out.println("잘못넣었소");
			 }

			operator = scan.next();

			while (true) {

				if ("+".equals(operator))
					break;

				if ("-".equals(operator))
					break;

				else if ("*".equals(operator))
					break;

				else if ("/".equals(operator))
					break;

				else if ("!".equals(operator)) {
					System.out.println("끝이오!!");
					System.out.println("================================================\n");
					return;

				} else {
					System.out.println("잘못넣었소 연산자기호를 넣어주세요!");
					operator = scan.next();

			}
			}

			value = scan.nextInt();

			// if (value >= 0x30 && value <= 0x39) {
			// // 숫자 OK!
			// break;
			// } else {
			// System.out.println("잘못넣었소");
			// }

			switch (operator) {

			case "+":

				sum = sum + value;
				System.out.println("= " + sum);
				break;

			case "-":

				sum = sum - value;
				System.out.println("= " + sum);
				break;

			case "*":

				sum = sum * value;
				System.out.println("= " + sum);
				break;

			case "/":

				sum = sum / value;
				System.out.println("= " + sum);
				break;

			}
		}

	}

}
