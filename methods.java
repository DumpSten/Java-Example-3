package methods;

public class methods {

	public static void main(String[] args) {
		 
		findNumber();
		findNumber();
		findNumber();
		findNumber();
	}
	public static void findNumber() {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int find = 6;
		boolean varMi=false;
		
		for(int number:numbers) {
			if(number==find) {
				varMi = true;
				break;
			}
		}
		String message="";
		if(varMi) {
			message ="Find Number: "+find;
			giveMessage(message);
		}else {
			giveMessage("Not Find Number: "+find);
		}
	}
	
	public static void giveMessage(String message) {
		System.out.println(message);
	}
}
