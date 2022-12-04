import java.util.ArrayList;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		MyAnimalShop shop1=new MyAnimalShop();
		shop1.balance=1000;
		
		shop1.animal=new ArrayList<Animal>();
		shop1.dog=new ArrayList<Dog>();
		shop1.cat=new ArrayList<Cat>();
		shop1.tortoise=new ArrayList<Tortoise>();
		shop1.buyAnimalIn();
		double temp=shop1.balance;
		shop1.customer=new ArrayList<Customer>();
		shop1.receiveCustomer();
		shop1.close(temp);
		
	}

}
