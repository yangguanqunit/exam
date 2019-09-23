package exam;

public class ABC {

	public static void main(String[] args) {
		for(int a=0;a<10;a++) {
			for(int b=0;b<10;b++) {
				for(int c=0;c<10;c++) {
					int num_1 = Integer.parseInt(a+""+b+""+c);
					int num_2 = Integer.parseInt(b+""+c+""+c);
					if(num_1+num_2==532)
						System.out.println(a+" "+b+" "+c);
				}
			}
		}

	}

}
