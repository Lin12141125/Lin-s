import java.util.Scanner;
import java.util.concurrent.locks.LockSupport;
public class Threadtest {
	static Thread a1=null,a2=null;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input the first array:");
		String s=sc.nextLine();
		System.out.println("Please input the second array:");
		String ss=sc.nextLine();
		s.replace(" ", ",");
		ss.replace(" ", ",");
		String s1[]=s.split(",");
		String s2[]=ss.split(",");
		int l=s1.length;
		int[] arr1=new int[l];
		int[] arr2=new int[l];
		for(int i=0;i<l;i++) {
			arr1[i]=Integer.parseInt(s1[i]);
			arr2[i]=Integer.parseInt(s2[i]);
		}
//		Array1 a1=new Array1(arr1);
//		Array2 a2=new Array2(arr2);
//		a1.start();
//		a2.start();
		


		
		a1 = new Thread() {
			public void run() {
				for(int a:arr1) {
					System.out.print(a+" ");
					LockSupport.unpark(a2);
					LockSupport.park();
				}
			}
		};
		
		a2=new Thread() {
			public void run() {
				for(int a:arr2) {
					LockSupport.park();
					System.out.print(a+" ");
					LockSupport.unpark(a1);
				}
			}
		};
		
		a1.start();
		a2.start();

	}

}

//class Array1 extends Thread{
//	int[] ar;
//	Array1(int[] ar){
//		this.ar=ar;
//	}
//	public void run() {
//		for(int i=0;i<ar.length;i++) {
//			System.out.print(ar[i]+" ");
//			LockSupport.unpark(a2)
//		}
//	}
//}
//
//class Array2 extends Thread{
//	int[] ar;
//	Array2(int[] ar){
//		this.ar=ar;
//	}
//	public void run() {
//		for(int i=0;i<ar.length;i++) {
//			System.out.print(ar[i]+" ");
//			try {
//				sleep(500);
//			}catch(Exception e) {
//			}
//		}
//	}
//}