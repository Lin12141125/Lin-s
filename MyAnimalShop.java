import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class MyAnimalShop implements AnimalShop{
	double balance;
	ArrayList<Animal> animal;
	ArrayList<Customer> customer;
	boolean open;
	ArrayList<Dog> dog;
	ArrayList<Cat> cat;
	ArrayList<Tortoise> tortoise;
	
	public void buyAnimalIn() {
		System.out.println("�����Ƿ�Ϊ����깺���Y/N��");
		Scanner sc=new Scanner(System.in);
		String choice=new String("");
		while((choice=sc.next()).equalsIgnoreCase("N")==false) {
			System.out.println("ѡ�����ࣺ1.�л���԰Ȯ������50Ԫ����2.èè������100Ԫ����3.�ڹ꣨����25Ԫ��");
			int kind=sc.nextInt();
			System.out.println("ѡ��������");
			int num=sc.nextInt();
			if(kind==1) {
				balance=balance-50*num;
				if(balance<0) throw new InsufficientBalanceException("���㣡");
				Dog[] dogs=new Dog[num];
				for(int i=0;i<num;i++) {
					dogs[i]=new Dog();
					dog.add(dogs[i]);
					animal.add(dog.get(i));
				}
			}
			if(kind==2) {
				balance=balance-100*num;
				if(balance<0) throw new InsufficientBalanceException("���㣡");
				Cat[] cats=new Cat[num];
				for(int i=0;i<num;i++) {
					cats[i]=new Cat();
					cat.add(cats[i]);
					animal.add(cat.get(i));
				}
			}
			if(kind==3) {
				balance=balance-25*num;
				if(balance<0) throw new InsufficientBalanceException("���㣡");
				Tortoise[] tortoises=new Tortoise[num];
				for(int i=0;i<num;i++) {
					tortoises[i]=new Tortoise();
					tortoise.add(tortoises[i]);
					animal.add(tortoise.get(i));
				}
			}
			System.out.println("�����Ƿ�Ϊ����깺���Y/N��");
			continue;
		}
//		sc.close();
		System.out.println("������ϣ���ǰ��"+balance);
		for(int i=0;i<animal.size();i++) {
			System.out.println((Animal) animal.get(i));
		}
	}
	
	public void receiveCustomer() {
		System.out.println("���ʹ˿��Ƿ���ꣿ��Y/N��");
		Scanner scc=new Scanner(System.in);
		String choice=new String("");
		while((choice=scc.next()).equalsIgnoreCase("N")==false) {
			System.out.println("����������");
			String custoname=scc.next();
			int x=0;
			for(int i=0;i<customer.size();i++) {
				if(custoname.equals((customer.get(i)).getCuname())) {
					x=1;
					int tem=(customer.get(i)).getTimes();
					customer.get(i).setTimes(tem+1);
					customer.get(i).setNewtime(LocalDate.now());
				}
			}
			if(x==0) {
				Customer c=new Customer();
				c.setCuname(custoname);
				c.setTimes(1);
				c.setNewtime(LocalDate.now());
				customer.add(c);
			}
			
			System.out.println("�ҵ����У�");
			for(int i=0;i<animal.size();i++) {
				System.out.print((i+1)+" ");
				System.out.print((Animal) animal.get(i));
				System.out.println();
			}
			System.out.println("��������Ҫ�����ţ�����");
			int bianhao=scc.nextInt()-1;
			if(bianhao>=animal.size()) throw new AnimalNotFountException("�޶��");
			double p=(animal.get(bianhao)).getPrice();
			balance=balance+p;
			animal.remove(bianhao);
			System.out.println("����ɹ�����ӭ�´ι��٣�");
			System.out.println();
//			System.out.println("����������");
//			for(int i=0;i<animal.size();i++) {
//				System.out.print((i+1)+" ");
//				System.out.print((Animal) animal.get(i));
//				System.out.println();
//			}
			System.out.println("���ʹ˿��Ƿ���ꣿ��Y/N��");
			continue;
		}
//		scc.close();
		System.out.println();
		System.out.print(customer.size());
		System.out.println("�˿�������");
		for(int i=0;i<customer.size();i++) {
			System.out.print((i+1)+" ");
			System.out.print((Customer) customer.get(i));
			System.out.println();
		}
	}
	
	public void close() {
		
	}

}

class AnimalNotFountException extends RuntimeException{
	String reason="�޶��";
	public AnimalNotFountException(String reason) {
		this.reason=reason;
	}
}
class InsufficientBalanceException extends RuntimeException{
	String reason="���㣡";
	public InsufficientBalanceException(String reason) {
		this.reason=reason;
	}
}
