package ch06;

public class pyramid_01  {

	public static void main(String[] args) {
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		} 
		// TODO Auto-generated method stub

	}

}
