package exam;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Topology {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> q = new ArrayBlockingQueue<>(50);
		int n = scanner.nextInt();
		int[] inDegree = new int[n+1];
		int[][] list = new int[n+1][n+1];
		while(scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(a+b==0)
				break;
			list[a][b]=1;
			inDegree[b]++;
		}
		for(int i=1;i<=n;i++)
			if(inDegree[i]==0) {
				q.offer(i);
				inDegree[i]=-1;
			}
		int count=0;
		while(!q.isEmpty()) {
			int tmp = q.poll();
			for(int i=1;i<=n;i++) {
				if(list[tmp][i]==1) {
					inDegree[i]--;
				}
			}
			for(int i=1;i<=n;i++)
				if(inDegree[i]==0) {
					q.offer(i);
					inDegree[i]=-1;
				}
			count++;
		}
		System.out.println(count==n?"YES":"NO");
	}
	

}
