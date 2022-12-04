
public class Dog extends Animal {
	boolean isVaccineInjected;
	public Dog() {
		super();
		this.price=100;
		this.isVaccineInjected=true;
	}
	
	public Dog(String anname,int age,char sex,double price,boolean is) {
		super(anname,age,sex,100);
		isVaccineInjected=is;
	}
	
	public void setVaccine(boolean isVaccineInjected) {
		this.isVaccineInjected=isVaccineInjected;
	}
	public boolean getIsVaccineInjected() {
		return isVaccineInjected;
	}

	@Override
	public String toString() {
		return "种类：狗  "+"动物名字："+anname+" 年龄："+age+" 性别："+sex+" 价格：100 "+"是否注射疫苗："+isVaccineInjected;
	}
	
}
