
public class Cat extends Animal {
	public Cat() {
		super();
		this.price=200;
	}
	
	public Cat(String anname,int age,char sex,double price) {
		super(anname,age,sex,200);
	}

	@Override
	public String toString() {
		return "���ࣺè"+"; �������֣�"+anname+"; ���䣺"+age+"; �Ա�"+sex+"; �۸�200";
	}

}
