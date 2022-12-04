
public abstract class Animal {
	protected String anname;
	protected int age;
	protected char sex;
	protected double price;
	
	public Animal() {
//		this.anname=anname;
//		this.age=age;
//		this.sex=sex;
//		this.price=price;
	}
	
	public Animal(String anname,int age,char sex,double price){
		this.anname=anname;
		this.age=age;
		this.sex=sex;
		this.price=price;
	}
	
	public void setAnname(String anname) {
		this.anname=anname;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setSex(char sex) {
		this.sex=sex;
	}
	
	public String getAnname() {
		return anname;
	}
	public int getAge() {
		return age;
	}
	public char getSex() {
		return sex;
	}
	public double getPrice() {
		return price;
	}
	
	public abstract String toString();

}