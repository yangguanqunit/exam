package exam;

public class GCD {

	public static void main(String[] args) {
		System.out.println(64*24/gcd(24,64));

	}
	public static int gcd(int a,int b) {
		if(b==0) return a;
		else return gcd(b,a%b);
	}
}
