package brokenCode;

public class BrokenCodeHomework2 {
//	public class BrokenCodeTwo {//duplicate main
		
		public  static void main(String[] args) {// static and void misplaced string S should be capital letter
			double tempOne=84.7;// the number is not int type of data,should be double
			 int tempTwo =66;
			
			String result;
			if (tempOne <=  0 && tempTwo  >= 100){//semicolon after bracket end the logical operator should be 2(&&) ,and greater than >=, for int data type no need double quotation 
			System.out.println( true);//to print result java use Systetem.out.println and true is string should be in double quotation mark
			}  else if  (tempOne>= 100 && tempTwo <= 0) { //if else misplaced
				System.out.println( true);//o print result java use Systetem.out.println
			} else {
				System.out.println( "true");//o print result java use Systetem.out.println
			}
			
			System.out.println("results");//result should be in double quotation mark
			
			String season = "Monday";

			switch (season="fall") {// variable in switch can not put boolean 
			case"fall"://at the end should be colon fall should be in double quotation mark
				System.out.println("Recovering from hot weather");
				break;
			case "winter":
				System.out.println("Toooo cold");			
				 
			case "s"://at the end should be colon we declare string  all case should be the same data type
				System.out.println("Recovering from cold weather");			
				break;
			case "summer"://at the end should be colon
				System.out.println("Toooo hot");			
				 
			default://at the end should be colon
				System.out.println("Season does not exist!");	
			}
			
			
			for(int i=0; i<10; i++){// for and int are capital letter should be small letter i is not declared semicolon between boolean and expression
				
				if (i>=5) { //no no bracket only one , no semicolon, == use for string data type
					System.out.println("I equals to 5");// semicolon at end
				} else {//no need to open bracket
					System.out.println("i not equals");// should be double quotation mark"
		
					
						}
					}
					
			}

			
				
				
				
			 

			}
		
	 

	






