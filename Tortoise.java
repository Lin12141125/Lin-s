
public class Tortoise extends Animal{
	public Tortoise() {
		super();
		this.price=50;
	}
	
	public Tortoise(String anname,int age,char sex,double price) {
		super(anname,age,sex,50);
	}

	@Override
	public String toString() {
		return "���ࣺ�� "+"�������֣�"+anname+" ���䣺"+age+" �Ա�"+sex+" �۸�50";
	}

}
