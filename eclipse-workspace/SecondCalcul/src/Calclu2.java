import java.util.Scanner;

public class Calclu2 extends Calcul{
	
	static Calcul calculator = new Calcul();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("사칙연산 놀이를 해볼까용?!");
		
		
		System.out.println("수를 입력하세욤!");
		first = scan.nextInt();
		
		System.out.println("연산기호를 입력하세욤!");
	    num = scan.next();
	    
	    calculator.select();
	    

	}
	//yul

}
