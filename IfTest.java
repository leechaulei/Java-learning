import java.util.Scanner;

public class IfTest{
	static public void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (count < 10) {
			System.out.printf("���������0-100:");
			int a = sc.nextInt();
			if (a == -1 ){
				break;
			}
			if (a == 50 ){
				System.out.printf("����̫����\n");	
				continue;
			}
			if (a > 100 || a < 0){
				System.out.printf("������Ϸ�����\n");
			} else if (a > 90) {
				System.out.printf("�˷���ΪA�ȼ�\n");
			}else if (a > 80) {
				System.out.printf("�˷���ΪB�ȼ�\n");
			}else if (a > 70) {
				System.out.printf("�˷���ΪC�ȼ�\n");
			}else {
				System.out.printf("�˷���ΪD�ȼ�\n");
			}
			count++;
		}
	}
}