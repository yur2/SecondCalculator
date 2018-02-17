import java.util.Scanner;

public class Calcul2 {

	public String value;
	public String sum;
	public String operator;
	public int a;
	Scanner scan = new Scanner(System.in);

	public void Start() {

		System.out.println("================================================\n");
		System.out.println("유띠의 계산기에영ㅎ \n\n계산이 필요하시면 입력!! 고고~쓍");
		System.out.println("    (단 종료하고 싶을시, 느낌표를 눌러주세요)");
	}

	public void Operator(String sum) {

		while (true) {
			
		

			while (true) {

				char check;

				if (sum.equals("")) {
					// 문자열이 공백인지 확인
					System.out.println("잘못넣었소 숫자를 넣어주세요!");
					sum = scan.next();
				}
				else {
					for (int i = 0; i < sum.length(); i++) {
						check = sum.charAt(i);
						if (check < 48 || check > 58) {
							// 해당 char값이 숫자가 아닐 경우
							System.out.println("잘못넣었소 숫자를 넣어주세요!");
							sum = scan.next();
					}
							else
								break;

						}

						
					}
			

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

				value = scan.next();

				while (true) {

					char check1;

					if (value.equals("")) {
						// 문자열이 공백인지 확인
						System.out.println("잘못넣었소 숫자를 넣어주세요!");
					value = scan.next();
					} else {
						for (int i = 0; i < value.length(); i++) {
							check1 = value.charAt(i);
							if (check1 < 48 || check1 > 58) {
								// 해당 char값이 숫자가 아닐 경우
								System.out.println("잘못넣었소 숫자를 넣어주세요!");
								value = scan.next();
                            }
								else
									break;

							}

						}
				}
				
				
				switch (operator) {

				case "+":
					if (a == 0) {
						a = Integer.parseInt(sum) + Integer.parseInt(value);
						System.out.println("= " + a);
						break;
					} else {
						a = a + Integer.parseInt(value);
						System.out.println("= " + a);
						break;
					}

				case "-":
					if (a == 0) {
						a = Integer.parseInt(sum) - Integer.parseInt(value);
						System.out.println("= " + a);
						break;
					} else {
						a = a - Integer.parseInt(value);
						System.out.println("= " + a);
						break;
					}

				case "*":
					if (a == 0) {
						a = Integer.parseInt(sum) * Integer.parseInt(value);
						System.out.println("= " + a);
						break;
					} else {
						a = a * Integer.parseInt(value);
						System.out.println("= " + a);
						break;
					}

				case "/":
					if (a == 0) {
						a = Integer.parseInt(sum) / Integer.parseInt(value);
						System.out.println("= " + a);
						break;
					} else {
						a = a / Integer.parseInt(value);
						System.out.println("= " + a);
						break;
					}

					// case "/":
					//
					// sum = sum / value;
					// System.out.println("= " + sum);
					// break;

				}
			}

	}
}