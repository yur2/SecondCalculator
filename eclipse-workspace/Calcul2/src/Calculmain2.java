import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculmain2 extends Calcul2 {

	public static void main(String[] args) {

		Calcul2 calcul = new Calcul2();
		Scanner scan = new Scanner(System.in);

		calcul.Start();

		calcul.Operator(scan.nextInt());

	}

}
