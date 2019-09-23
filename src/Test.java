import java.util.Comparator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("Hello World");
		Queue<Integer> q = new PriorityBlockingQueue<>(20,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1>o2?-1:1;
			}
		});
		q.offer(3);
		q.offer(2);
		q.offer(5);
		System.out.println(q.poll());

	}

}
