package findNumber;

public class findNumber {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int find = 6;
		boolean varMi=false;
		
		for(int number:numbers) {
			if(number==find) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Find Number");
		}else {
			System.out.println("Not Find Number");
		}
	}

}
