package exam;

public class SubstrTest {

	public static void main(String[] args) {
		String a = "abc(def";
//		System.out.println(a.substring(1, 3));
		System.out.println(a.split("\\(")[0]);
		System.out.println(Integer.parseInt("d",10));
	}

}
