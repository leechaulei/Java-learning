import java.util.Scanner;

public class IfTest{
	static public void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (count < 10) {
			System.out.printf("请输入分数0-100:");
			int a = sc.nextInt();
			if (a == -1 ){
				break;
			}
			if (a == 50 ){
				System.out.printf("考得太好了\n");	
				continue;
			}
			if (a > 100 || a < 0){
				System.out.printf("输出不合法分数\n");
			} else if (a > 90) {
				System.out.printf("此分数为A等级\n");
			}else if (a > 80) {
				System.out.printf("此分数为B等级\n");
			}else if (a > 70) {
				System.out.printf("此分数为C等级\n");
			}else {
				System.out.printf("此分数为D等级\n");
			}
			count++;
		}
	}
}