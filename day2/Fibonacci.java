package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		int f=-0,s=1,t;
		System.out.print(f+" ");
		System.out.print(s+" ");
		for(int i=3; i<=num; i++) {
			t=f+s;
			System.out.print(t+" ");
			f=s;
			s=t;
		}


	}

}
