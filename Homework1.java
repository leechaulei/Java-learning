import java.util.Scanner;

public class Homework1{
	static public void main(String [] args){
		int b = (int)(Math.random()*10+1);
		while (true){	
			Scanner sc = new Scanner(System.in);	
			System.out.printf("enter:\n");
			int a = sc.nextInt();
			
			if (a == b ){
				System.out.printf("bingo\n");
				break;
				
			} else if (a < b){
				System.out.printf("bigger\n");
				continue;
			} else {
				System.out.printf("smaller\n");
				continue;
			}
		}
		
	}
}

