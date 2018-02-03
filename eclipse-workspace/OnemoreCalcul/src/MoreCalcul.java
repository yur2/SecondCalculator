import java.util.Scanner;

public class MoreCalcul {
	
	private int first;
	private int second;
	private String num;
	int sum = 0;
	int n = 0;
	Scanner scan = new Scanner(System.in);
	
	public void MoreCalcul(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	
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
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
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
    			again(scan.nextInt());
    			plus();
    			gogo(scan.next());
    			break;
    			
    		case "-":
    			again(scan.nextInt());
    			minus();
    			gogo(scan.next());
    			break;
    			
    		case "*":
    			again(scan.nextInt());
    			multi();
    			gogo(scan.next());
    			break;
    			
    		case "/":
    			again(scan.nextInt());
    			divide();
    			gogo(scan.next());
    			break;
    			
    		
    	}
    }
	
    
    public void firstgo(int first) {
    	
       	 System.out.println("사칙연산 놀이를 해볼까용?!");
    	
    	     System.out.println("수를 입력하세욤!");
		 first = scan.nextInt();
		
    }
    
    
    
    
     public void again(int second) {

 		System.out.println("수를 입력하세욤!");
 		
		second = scan.nextInt();
     }
     
     

     public void gogo(String num) {
    	 
    	 //System.out.println(sum);
    	 System.out.println("이어 연산 원하시면 1 원치 않고 결과값을 보고싶으면 2");
    	 n = scan.nextInt();
    	 
    	 if(n == 1) {
    		 System.out.println("연산기호를 입력하세욤!");
    		    num = scan.next();
    		    select();
    		 }
    		 
     else if(n == 2){
    			 System.out.println("총 결과값은 = "+sum);
    	    	 
    		 }
    	 
     }

	
}

