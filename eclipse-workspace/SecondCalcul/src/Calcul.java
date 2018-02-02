import java.util.Scanner;

public class Calcul {
	
	static private int first;
	static private int second;
	protected static String num;
	static int sum = 0;
	static int n = 0;
	static Scanner scan = new Scanner(System.in);
	
	
	public int getFirst() {
		return first;
	}
	
	public void setFirst(int first) {
		this.first = first ;
	}
	
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	
		
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
	
    
    public void firstgo() {
    	
       	 System.out.println("사칙연산 놀이를 해볼까용?!");
    	
    	     System.out.println("수를 입력하세욤!");
		 first = scan.nextInt();
		
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

