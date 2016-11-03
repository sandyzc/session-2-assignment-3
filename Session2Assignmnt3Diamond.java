package assignments;
//patteern to be printed

//  	a
// 	   aba
//	  abcba
// 	   aba
//		a
public class Session2Assignmnt3Diamond {

	public static void main(String[] args) {
		int noOfcolums = 0;// intializing the columns
		int start =0;
		int noOfSpaces=3;// intiializing the spaces
		
		//loop for creating rows
		for (int i = 1 ; i<= 5 ; i++){
			if(i<3){
				start=i;
			}
			else{
				start = 6-i;
			}
			// loop for printing out spaces 
			for( int j =0 ; j<=noOfSpaces;j++){
				System.out.print(" ");
			}
			
			int alphabet = 97;// 97 is the ASCII code for alphabet "a"
			// loop for printing the characters
			for (int j =0 ; j<= noOfcolums ; j++){
				
				int middleCollumn= noOfcolums /2;
				
				System.out.print((char)alphabet);
				if(j<middleCollumn){
					alphabet++;//alphabet increment
				}
				else {
					alphabet--;// decrements and prints in reverse
				}
		}			
			System.out.println();
		
		if( i < 3 ){
			noOfcolums=noOfcolums+2;
		}
		else {
			noOfcolums=noOfcolums-2;
		}
				
		if(i<3){
			noOfSpaces=noOfSpaces-1;
			
		}
		else{
			noOfSpaces=noOfSpaces+1;
			}
		}
	}

}


