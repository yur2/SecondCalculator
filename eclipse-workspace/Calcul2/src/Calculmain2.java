import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculmain2 extends Calcul2 {

	public static void main(String[] args) {

		Calcul2 calcul = new Calcul2();
		Scanner scan = new Scanner(System.in);
		
		calcul.Start();
		while (true) {
			try {
				calcul.Start2(scan.nextInt());
				break;
			} catch (InputMismatchException ime) {
				scan = new Scanner(System.in);
				System.out.println("예외발생");
				System.out.println("숫자 똑바로 넣으세요");

			}
		}
		
	}

}
