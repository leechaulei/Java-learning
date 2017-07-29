import java.util.Scanner;

public class Sum{
	static public void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.printf("showway[1-4]\n");
			while (true) {
				int choice = sc.nextInt();
					switch (choice) {
						case 1:
							System.out.printf("for style");
							System.out.println();
							for(int a= 1;a < 10; a++ ) {
								for (int b= 1;b <= a; b++ ) {
									System.out.printf("%d*%d=%d\t",a,b,a*b);
								}
								System.out.println();
							}
						break;
							case 2:	
								System.out.printf("while style");
								System.out.println();
								int a = 1;
								while (a < 10) {
									int b = 1;
									while (b <= a) {
										System.out.printf("%d*%d=%d\t",a,b,a*b);
										b++;
									}
									System.out.println();
									a++;
									} 
							break;
								case 3:
									System.out.printf("do while style");
									System.out.println();
									int c = 1;
									do { 
										int d = 1;
										do {
											System.out.printf("%d*%d=%d\t",c,d,c*d);
											d++;
										} while ( d <= c );
										System.out.println();
										c++;
									}	while ( c<10 );
									break;
						default:
							System.out.printf("quit");
					} 
							if (choice >  3) {
								break;
							} else {
								System.out.printf("other choice");
								System.out.println();
								continue;
							}
			}
	}
}