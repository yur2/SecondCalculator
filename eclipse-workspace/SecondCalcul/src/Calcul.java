import java.util.Scanner;

public class Calcul {
	
	static int first;
	static int second;
	static String num;
	static int sum = 0;
	static int n = 0;
	static Scanner scan = new Scanner(System.in);
	
	
		
	public void plus(){
		if(n != 1)
	    sum	= first  + second;
		else if(n == 1)
	    sum = sum + second;
		
	}
	
	public void minus(){
		if(n != 1)
		    sum	= first  - second;
			else if(n == 1)
		    sum = sum - second;
			
		}
	
	public void multi(){
		if(n != 1)
		    sum	= first  * second;
			else if(n == 1)
		    sum = sum * second;
			
		}
	
	public void divide(){
		if(n != 1)
		    sum	= first  / second;
			else if(n == 1)
		    sum = sum / second;
			
		}
	
    public void select() {
    	
    	switch(num){
    		case "+":
    			again();
    			plus();
    			gogo();
    			break;
    			
    		case "-":
    			again();
    			minus();
    			gogo();
    			break;
    			
    		case "*":
    			again();
    			multi();
    			gogo();
    			break;
    			
    		case "/":
    			again();
    			divide();
    			gogo();
    			break;
    			
    		
    	}
    }
	
     public void again() {

 		System.out.println("수를 입력하세욤!");
 		
		second = scan.nextInt();
     }
     
     

     public void gogo() {
    	 
    	 System.out.println(sum);
    	 System.out.println("이어 연산 원하시면 1 원치 않으면 2");
    	 n = scan.nextInt();
    	 
    	 if(n == 1) {
    		 System.out.println("연산기호를 입력하세욤!");
    		    num = scan.next();
    		    select();
    		 }
    		 
     else if(n == 2){
    			 System.out.println("끝~~!");
    	    	 
    		 }
    	 
     }

	
}

