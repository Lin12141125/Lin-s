
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
		return "种类：龟 "+"动物名字："+anname+" 年龄："+age+" 性别："+sex+" 价格：50";
	}

}
