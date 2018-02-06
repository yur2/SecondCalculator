import java.util.Scanner;

public class MoreCalcul {

	public int first;
	public int second;
	public String num;
	int sum = 0;
	int n = 0;
	Scanner scan = new Scanner(System.in);

	public MoreCalcul(){
		
		this.first = first;
		this.second = second;
	}

	

	public void plus(int second) {

		if (n != 1)
			sum = first + second;
		else if (n == 1)
			sum = sum + second;

	}

	public void minus(int second) {
		if (n != 1)
			sum = first - second;
		else if (n == 1)
			sum = sum - second;

	}

	public void multi(int second) {
		if (n != 1)
			sum = first * second;
		else if (n == 1)
			sum = sum * second;

	}

	public void divide(int second) {
		if (n != 1)
			sum = first / second;
		else if (n == 1)
			sum = sum / second;

	}

	public void select(String num) {

		switch (num) {
		case "+":

			System.out.println("수를 입력하세욤!");
			plus(scan.nextInt());
			gogo(scan.nextLine());
			break;

		case "-":

			System.out.println("수를 입력하세욤!");
			minus(scan.nextInt());
			gogo(scan.next());
			break;

		case "*":

			System.out.println("수를 입력하세욤!");
			multi(scan.nextInt());
			gogo(scan.next());
			break;

		case "/":

			System.out.println("수를 입력하세욤!");
			divide(scan.nextInt());
			gogo(scan.next());
			break;

		}
	}

	public void firstgo() {

		System.out.println("사칙연산 놀이를 해볼까용?!");

		System.out.println("수를 입력하세욤!");
		first = scan.nextInt();

	}

	public void gogo(String num) {

		System.out.println("이어 연산 원하시면 1 원치 않고 결과값을 보고싶으면 2");
		n = scan.nextInt();

		if (n == 1) {

			System.out.println("연산기호를 입력하세욤!");
			select(scan.next());
		}

		else if (n == 2) {
			System.out.println("총 결과값은 = " + sum);

		}

	}

}
