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
		System.out.println("    (단 종료하고 싶을시, 느낌표와 아무숫자를 눌러주세요)");
	}

	public void Operator(int sum) {
		while (true) {

			while (true) {
				try {

					operator = scan.next();
					break;

				} catch (InputMismatchException ime) {
					scan = new Scanner(System.in);
					System.out.println("예외발생");
					System.out.println("연산기호나 숫자 똑바로 넣으세요");

				}
			}
//			if (operator == "!") {
//				 System.out.println("끝이오!!");
//				 System.out.println("================================================\n");
//				 }
//				
//				
//				 else {

				while (true) {
					try {

						value = scan.nextInt();
						break;
					} catch (InputMismatchException ime) {
						scan = new Scanner(System.in);
						System.out.println("예외발생");
						System.out.println("문자나 숫자 똑바로 넣으세요");

					}
				}

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

				case "!":
					System.out.println("끝이오!!");
					System.out.println("================================================\n");
					break;
				}
			}

		}

	}

