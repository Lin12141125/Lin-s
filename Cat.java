
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
		return "种类：猫"+"; 动物名字："+anname+"; 年龄："+age+"; 性别："+sex+"; 价格：200";
	}

}
