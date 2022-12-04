
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
		return "���ࣺ��  "+"�������֣�"+anname+" ���䣺"+age+" �Ա�"+sex+" �۸�100 "+"�Ƿ�ע�����磺"+isVaccineInjected;
	}
	
}
