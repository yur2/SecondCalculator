import java.util.Scanner;

public class OnemoreCalcul extends MoreCalcul{
	
	public static void main(String[] args) {
		
		MoreCalcul calculator = new MoreCalcul();
		Scanner scan = new Scanner(System.in);
		

		 calculator.firstgo();

		 System.out.println("연산기호를 입력하세욤!");
		    
		
	     calculator.select(scan.next());
	}
	

}
